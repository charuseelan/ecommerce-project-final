package com.gallery.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gallery.dao.CartDAO;
import com.gallery.dao.ProductDAO;
import com.gallery.model.Cart;
import com.gallery.model.Product;

@Controller
public class Cartcontroller {
	@Autowired
	ProductDAO productDAO;
	@Autowired
	CartDAO cartDAO;
	@RequestMapping("/addcart/{id}")
	public String addToCart(@PathVariable("id")int id,@RequestParam("quantity") int quantity,HttpSession session,Model m)
	{
		Cart cart=new Cart();
		String uname=(String)session.getAttribute("uname");
		cart.setCartid(1001);
		cart.setId(id);
		cart.setQuantity(quantity);
		cart.setStatus("N");
		cart.setUname(uname); 
		Product product=productDAO.getProduct(id);
		cart.setName(product.getName());
		cart.setPrize(product.getPrize());
		cartDAO.addToCart(cart);
		List<Cart> list=cartDAO.getCartItems(uname);
		m.addAttribute("cartitems", list);
		return "cart";
	}
	@RequestMapping("/addcart")
	public String getcart( HttpSession session,Model model)
	{
		String uname=(String)session.getAttribute("uname");
		List<Cart> list=cartDAO.getCartItems(uname);
		model.addAttribute("cartitems", list);
		return "cart";
		
	}
	@RequestMapping(value="/updateCartItem/{citemid}")
	public String updateCartItem(@PathVariable("citemid")int citemid,@RequestParam("quantity")int quantity,HttpSession session,Model m)
	{
		Cart cart=cartDAO.getCartItem(citemid);
		cart.setQuantity(quantity);
		cartDAO.updateCartItem(cart);
		String uname=(String)session.getAttribute("uname");
		List<Cart> list=cartDAO.getCartItems(uname);
		m.addAttribute("cartitems", list);
		return "cart";
		
	}
	@RequestMapping(value="/deleteCartItem/{citemid}")
	public String deleteCartItem(@PathVariable("citemid")int citemid,HttpSession session,Model m)
	{
		Cart cart=cartDAO.getCartItem(citemid);
		cartDAO.deleteCartItem(cart);
		String uname=(String)session.getAttribute("uname");
		List<Cart> list=cartDAO.getCartItems(uname);
		m.addAttribute("cartitems", list);
		return "cart";
		
	}
	@RequestMapping("/checkout")
	public String orderConfirm(HttpSession session,Model m)
	{
		String uname=(String)session.getAttribute("uname");
		List<Cart> list=cartDAO.getCartItems(uname);
		
		int grandtotal=0;
		for(Cart cart:list)
		{
			grandtotal=grandtotal+(cart.getQuantity()*cart.getPrize());
		}
		m.addAttribute("grandtotal", grandtotal);
		m.addAttribute("cartitems", list);
		return "OrderConfirm";
		
	}
	
}
