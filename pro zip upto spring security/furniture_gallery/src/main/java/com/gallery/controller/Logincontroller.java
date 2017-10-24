package com.gallery.controller;

import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Logincontroller {
	@RequestMapping(value = "/loginsuccess")
	public String login_session_attributes(HttpSession session,Model model) 
	{
		//System.out.println("Hello");
		String userid = SecurityContextHolder.getContext().getAuthentication().getName();
		
		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		String page="";
		
		String role="ROLE_USER";
		for (GrantedAuthority authority:authorities) 
		{
		 System.out.println(authority.getAuthority());
		     if (authority.getAuthority().equals(role)) 
		     {
		    	 
		    	 session.setAttribute("UserLoggedIn", "true");
		    	 session.setAttribute("Username", userid);
		    	 page="FullProduct";
		    	/* ArrayList list=(ArrayList)pdao.showProduct();
		    	 Gson gson = new Gson();
		    	 String jsonInString=gson.toJson(list);
		    	 model.addAttribute("list",jsonInString);
		    	 ArrayList<Cart> cartitem=new ArrayList<Cart>();
		    	 session.setAttribute("mycart", cartitem);   */
		    	 
		    	 break;
		     }
		     else 
		     {
		    	 session.setAttribute("LoggedIn", "true");
		    	 session.setAttribute("Administrator", "true");
		    	 page="admin";
		    	 break;
		    }
		}
		return page;
	}


}
