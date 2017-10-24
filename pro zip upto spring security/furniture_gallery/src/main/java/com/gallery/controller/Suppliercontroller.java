package com.gallery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gallery.dao.SupplierDAO;

import com.gallery.model.Supplier;

@Controller
public class Suppliercontroller {
	@Autowired
	SupplierDAO supplierdao;
	@RequestMapping(value="Supplier")
	public ModelAndView addsupplier(@ModelAttribute("supplier")Supplier supplier)
	{
		//userdao.addsupplier(supplier);
		ModelAndView mv = new ModelAndView("supplier","suplist",this.supplierdao.getSupplierList());
		return mv;
	}

	@RequestMapping(value="SaveSupplier",method=RequestMethod.POST)
	public String addsupplier(Supplier supplier, Model model)
	{
		supplierdao.addsupplier(supplier);
		model.addAttribute("suplist", this.supplierdao.getSupplierList());
		return "supplier";
		
	}
	
	@RequestMapping("/supplierdelete")
	public String deletecategorylist(@RequestParam("sid") String id,Model model)
	{
		supplierdao.deletesupplier(id);
		model.addAttribute("supplier", new Supplier());
		model.addAttribute("suplist",this.supplierdao.getSupplierList());
		return"supplier";
	}
	@RequestMapping(value="/supplieredit")
	public String getcategory(@RequestParam("sid")String supplierid,Model model)
	{
		Supplier supplier =supplierdao.getSupplier(supplierid);
		model.addAttribute("supplierdata",supplier);
		model.addAttribute("supplier",new Supplier());
		return "editsupplier";
		
	}

	@RequestMapping(value="/editsupplier",method=RequestMethod.POST)
	public String updatesupplier(Supplier supplier,Model model)
	{
		supplierdao.editsupplier(supplier);
		model.addAttribute("suplist", this.supplierdao.getSupplierList());
		return "supplier";
		
	}

}
