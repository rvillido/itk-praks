package ee.itcollege.i377.praktikum7.controller;

import java.security.Principal;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	private static Logger log = Logger.getLogger(LoginController.class);
	
	@RequestMapping(value="/welcome")
	public String welcome(Model model, Principal principal) {
		log.debug("Rendering welcome page");
		
		String name = principal.getName();
		model.addAttribute("username", name);
		log.debug("Logged in with user "+name);
		
		return "welcome";
	}
	
	@RequestMapping("/login")
	public String login(){
		log.debug("Rendering login page");
		return "login";
	}
	
	@RequestMapping(value="/loginfailed")
	public String loginerror(Model model) {
 
		model.addAttribute("error", "true");
		return "login";
 
	}

}
