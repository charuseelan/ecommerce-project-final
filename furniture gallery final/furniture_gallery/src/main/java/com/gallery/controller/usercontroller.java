package com.gallery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gallery.dao.UserDAO;
import com.gallery.model.User;

@Controller
public class usercontroller {
 
	
	@Autowired
	UserDAO dao;
	
	@RequestMapping(value="register", method=RequestMethod.GET)
	public ModelAndView sendregister(@ModelAttribute("customer")User user)
	{
		ModelAndView mv=new ModelAndView("Registerpage");
		return mv;
	}

	@RequestMapping(value="register", method=RequestMethod.POST)
	public ModelAndView getUser(User user)
	{
		
		dao.adduser(user);
		ModelAndView mv=new ModelAndView("loginpage","user",new User());
		return mv;		
		
	}


}
