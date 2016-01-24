package com.redhat.samples.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.redhat.samples.springmvc.models.User;

@Controller
public class Welcome {

	@RequestMapping("/welcome")
	public ModelAndView welcome() {
        User myUser = new User();
        myUser.setName("My Name");
        myUser.setAddress("My Address");
        myUser.setAge(99);
        
		System.out.println("welcome: " + this.getClass().getCanonicalName() + " " + myUser);
        
		return new ModelAndView("welcome", "user", myUser);
	}
}
