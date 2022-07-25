package com.example.hellocontroller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class HelloController {

	@RequestMapping("/welcome/countryName/{userName}/{countryName}")
	   public ModelAndView helloworld(@PathVariable Map<String, String>pathvars){
		
		String name = pathvars.get("username");
		String country= pathvars.get("countryName");
			
			ModelAndView model = new ModelAndView("HelloPage");
			model.addObject("msg" , "Hello "+name+" you are from "+country);
			
			return model;
	}
	

}
