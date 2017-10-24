package com.gallery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gallery.dao.CategoryDAO;
import com.gallery.dao.ProductDAO;
import com.gallery.dao.SupplierDAO;
import com.gallery.model.Product;
import com.gallery.model.Supplier;

@Controller
public class Productcontroller {
	@Autowired
	ProductDAO productdao;
	@Autowired
	CategoryDAO categorydao;
	@Autowired
	SupplierDAO supplierdao;
@RequestMapping(value="Product")
public String getProductPage(@ModelAttribute("product") Product product, Model model)
{
	productdao.addproduct(product);
	model.addAttribute("catlist",this.categorydao.getCategoryList());
	List<Supplier> suplist=supplierdao.getSupplierList();
	System.out.println("supplier list in controller------------------>"+suplist);	
	model.addAttribute("suplist",suplist);
	model.addAttribute("prolist", this.productdao.getProductList());
	return "product";
}
@RequestMapping("/prodelete")
public String deleteproductlist(@RequestParam("pid") String id,Model model)
{
	productdao.deleteproduct(id);
	model.addAttribute("product", new Product());
	model.addAttribute("prolist",this.productdao.getProductList());
	return"product";
}
@RequestMapping(value="/proedit")
public String getproduct(@RequestParam("pid")String id,Model model)
{
	Product product=productdao.getProduct(id);
	model.addAttribute("productdata",product);
	model.addAttribute("product",new Product());
	return "editproduct";
	
}

@RequestMapping(value="/editproduct",method=RequestMethod.POST)
public String updateproduct(Product product,Model model)
{
	productdao.editproduct(product);
	model.addAttribute("prolist", this.productdao.getProductList());
	return "product";
	
}


}
