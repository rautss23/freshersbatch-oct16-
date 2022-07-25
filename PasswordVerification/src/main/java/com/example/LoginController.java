package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
		@RequestMapping("/")
		public ModelAndView hello (HttpServletRequest request, HttpServletResponse response)
		{
			String name=request.getParameter("name");
			String password=request.getParameter("password");
			if(password.equals("password123")) {
				String message="Welcome "+name;
				return new ModelAndView("welcomepage","message",message);
			}
			else {
				return new ModelAndView("error","message","Invalid Password");
			}
			
		}
}
