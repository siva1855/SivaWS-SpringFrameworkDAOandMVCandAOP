package siva.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	
	//@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@GetMapping(value = "/hello")
	public ModelAndView sayHello() {
		return new ModelAndView("welcome");
		
	}

}