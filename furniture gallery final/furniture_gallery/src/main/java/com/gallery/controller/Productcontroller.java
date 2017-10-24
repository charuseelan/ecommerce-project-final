package com.gallery.controller;

import java.io.File;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.gallery.dao.CategoryDAO;
import com.gallery.dao.ProductDAO;
import com.gallery.dao.SupplierDAO;
import com.gallery.model.Category;
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
	model.addAttribute("prolist",this.productdao.getProductList());
	model.addAttribute("catlist",this.categorydao.getCategoryList());
	List<Supplier> suplist=supplierdao.getSupplierList();
	System.out.println("supplier list in controller------------------>"+suplist);	
	model.addAttribute("suplist",suplist);
	return "product";
}
@RequestMapping(value="saveProduct")
public String addproduct(@Valid @ModelAttribute(name="product")Product product,BindingResult result,Model model )
{
	
if(result.hasErrors()){
	List<Category> category=categorydao.getCategoryList();
	model.addAttribute("category",category);
return "product";
	
}

	productdao.addproduct(product);
	model.addAttribute("product",new Product());
	model.addAttribute("prolist",this.productdao.getProductList());
	model.addAttribute("catlist",this.categorydao.getCategoryList());
	model.addAttribute("suplist",this.supplierdao.getSupplierList());
	
	MultipartFile image=product.getPimage();
	Path path=Paths.get("H:\\neonwork_space\\furniture_gallery\\src\\main\\webapp\\resources\\"+product.getId()+".jpg");
	try {
		image.transferTo(new File(path.toString()));
	} catch (IllegalStateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return "product";
}



/*
@RequestMapping("productlist")
public String getAllProducts(Model model){
	List<Product> product=productdao.getProductList();
	model.addAttribute("product",product);
	return "productlist";
	
}  */
/*
@RequestMapping("/viewproduct/{id}")
public String getProductById(@PathVariable int id,Model model){
	Product product=productdao.getProductById(id);
	model.addAttribute("product",product);
	return "viewproduct";
}   */

@RequestMapping("/prodelete")
public String deleteproductlist(@RequestParam("pid") int id,Model model)
{
	productdao.deleteproduct(id);
	model.addAttribute("product", new Product());
	model.addAttribute("prolist",this.productdao.getProductList());
	model.addAttribute("catlist",this.categorydao.getCategoryList());
	model.addAttribute("suplist",this.supplierdao.getSupplierList());
	
	return"product";
}
@RequestMapping(value="/proedit")
public String getproduct(@RequestParam("pid") int id,Model model)
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


@RequestMapping(value = "/displayproducts")
public String displatProduct(Model m)
{
	List<Product> prolist = productdao.getProductList();
	m.addAttribute("prolist", prolist);
	List<Category> catlist=categorydao.getCategoryDetails();
	m.addAttribute("categorylist", catlist);

	
	return "productpage";
} 


@RequestMapping(value = "/productdesc/{id}")
public String showProductDesc(@PathVariable("id") int id,Model m)
{
	Product product=productdao.getProduct( id);
	m.addAttribute("product" ,product);
	return "productdesc";
}


/*@RequestMapping("/all/product/searchbycategory")
public String selectByCategory(@RequestParam String searchCondition,Model model){
	model.addAttribute("product",productdao.getProductList());
	if(searchCondition.equals("All"))
		model.addAttribute("searchCondition","");
	else
	model.addAttribute("searchcondition",searchCondition);
	return "product";
}
*/
/*
@RequestMapping(value="/displaybeds")
public String sareeView(@PathVariable("catid") String catid,Model m)
{
	
	System.out.println("dropdown beds");
	m.addAttribute("catlist",categorydao.getCategoryList());
	m.addAttribute("prolist",productdao.getProductList());
	
	return "productpage";
} */
@RequestMapping(value="returns")
public String returnprolist(Model m)
{
	m.addAttribute("prolist",productdao.getProductList());

	return "productpage";
}

}
