package com.gallery.dao;

import java.util.List;

import com.gallery.model.Category;
import com.gallery.model.Product;


public interface ProductDAO {
	public void addproduct(Product product);
	 public List<Product> getProductList();
	    public void deleteproduct(int id);
	    public Product getProduct(int id);
		public void editproduct(Product product);
	
		List<Category> getCategoryList();

}
