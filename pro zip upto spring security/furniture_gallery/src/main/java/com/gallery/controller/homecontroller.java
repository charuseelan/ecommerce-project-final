package com.gallery.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homecontroller {

		@RequestMapping(value="login")
		public String admin()
		{
			return "loginpage";
		}

	}

