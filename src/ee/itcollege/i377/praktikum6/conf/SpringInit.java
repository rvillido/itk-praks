package ee.itcollege.i377.praktikum6.conf;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringInit implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext container) {
    	// Create the 'root' Spring application context
    	AnnotationConfigWebApplicationContext rootContext = 
    			new AnnotationConfigWebApplicationContext();
        
    	rootContext.register(DispatcherConfig.class);

        // Create the dispatcher servlet's Spring application context
        ServletRegistration.Dynamic dispatcher = 
        		container.addServlet("dispatcher", new DispatcherServlet(rootContext));
        
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");

        container.addListener(new ContextLoaderListener(rootContext));
        
        // Spring Security
        FilterRegistration.Dynamic securityFilter = 
        		container.addFilter("springSecurityFilterChain", DelegatingFilterProxy.class);
		securityFilter.addMappingForUrlPatterns(null, false, "/*");
        
    }

 }
