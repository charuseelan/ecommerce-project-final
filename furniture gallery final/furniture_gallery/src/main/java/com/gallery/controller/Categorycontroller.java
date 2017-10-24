package com.gallery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gallery.dao.CategoryDAO;
import com.gallery.model.Category;

@Controller
public class Categorycontroller {
	@Autowired
	CategoryDAO categorydao;


	@RequestMapping(value="Category")
	public ModelAndView getCategoryPage(@ModelAttribute("category")Category category)
	{
		ModelAndView mv = new ModelAndView("category","catlist",this.categorydao.getCategoryList());
		return mv;
	}

	@RequestMapping(value="saveCategory",method=RequestMethod.POST)
	public String addCategory(Category category, Model model)
	{
		categorydao.addCategory(category);
		model.addAttribute("catlist",this.categorydao.getCategoryList());
		return "admin";
	}
	@RequestMapping("/catdelete")
	public String deletecategorylist(@RequestParam("cid") String id,Model model)
	{
		categorydao.deletecategory(id);
		model.addAttribute("category", new Category());
		model.addAttribute("catlist",this.categorydao.getCategoryList());
		return"category";
	}
	@RequestMapping(value="/catedit")
	public String getcategory(@RequestParam("cid")String catid,Model model)
	{
		Category category=categorydao.getCategory(catid);
		model.addAttribute("categorydata",category);
		model.addAttribute("category",new Category());
		return "editpage";
		
	}

	@RequestMapping(value="/editcategory",method=RequestMethod.POST)
	public String updatecategory(Category category,Model model)
	{
		categorydao.editcategory(category);
		model.addAttribute("catlist", this.categorydao.getCategoryList());
		return "category";
		
	}

	
	
}
