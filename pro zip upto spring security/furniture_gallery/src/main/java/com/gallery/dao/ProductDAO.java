package com.gallery.dao;

import java.util.List;

import com.gallery.model.Product;


public interface ProductDAO {
	public void addproduct(Product product);
	 public List<Product> getProductList();
	    public void deleteproduct(String id);
	    public Product getProduct(String id);
		public void editproduct(Product product);
}
