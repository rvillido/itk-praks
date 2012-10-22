package ee.itcollege.i377.praktikum5.test;

import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ee.itcollege.i377.praktikum4.entities.Guard;
import ee.itcollege.i377.praktikum5.GuardService;
import ee.itcollege.i377.praktikum5.GuardServiceImpl;

public class SpringApplicationContextTest {
	
	private static Logger log = Logger.getLogger(SpringApplicationContextTest.class);
	
	private ApplicationContext ctx;
	
	@Before
	public void setUp() {
		ctx = new ClassPathXmlApplicationContext("application-context.xml");	
		
		// Log4j Configuration
		BasicConfigurator.configure();
	}

	@Test
	public void test() {
		GuardServiceImpl bean = ctx.getBean(GuardServiceImpl.class);
		Assert.assertNotNull(bean);
	}
	
	@Test
	public void getGuardsTest() {
		log.debug("Testing getting all guards from the DB");
		GuardService guardService = ctx.getBean(GuardService.class);
		List<Guard> guards = guardService.getGuards();
		log.debug("Got "+guards.size()+" guards");
		Assert.assertTrue(guards.size() > 0);
		log.info("Info test");
		log.error("Error");
		log.warn("Warning");
		log.debug("Debug");
	}

}
