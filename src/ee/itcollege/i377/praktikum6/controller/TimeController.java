package ee.itcollege.i377.praktikum6.controller;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TimeController {
	
	private static Logger log = Logger.getLogger(TimeController.class);
	
	@RequestMapping(value="/currentTime", method=RequestMethod.GET)
	@ResponseBody
	public String currentTime(@RequestParam(required=false, value="time") Long timeInMillis){
		if(timeInMillis == null) {
			log.debug("Time is not set");
			return new Date().toString();
		}
		else {
			log.debug("Time has been set");
			return new Date(timeInMillis).toString();
		}
	}
	
	@RequestMapping(value = "/timeTillTheEnd", method = RequestMethod.GET)
	public String printTimeTillTheEnd(Model model) {
		model.addAttribute("timeTillTheEnd", new Date(4449546671000L));
		return "main";
	}
	
	@RequestMapping(value = "/")
	public String main(Model model) {
		model.addAttribute("timeTillTheEnd", new Date(4449546671000L));
		return "main";
	}
}
