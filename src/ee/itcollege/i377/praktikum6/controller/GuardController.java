package ee.itcollege.i377.praktikum6.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ee.itcollege.i377.praktikum4.entities.Guard;

@Controller
public class GuardController {
	
	private static Logger log = Logger.getLogger(GuardController.class);
	
	@RequestMapping(value="/guardForm", method=RequestMethod.POST )
	public String guardForm(@ModelAttribute Guard formInput, Model model){
		log.debug("Rendering guard form "+formInput.getName()+" age: "+formInput.getAge());
		model.addAttribute("addedGuard", formInput);
		return "guard";
	}
	
	@RequestMapping(value="/guardForm", method=RequestMethod.GET)
	public String guardForm(){
		log.debug("Rendering guard view");
		return "guard";
	}

}
