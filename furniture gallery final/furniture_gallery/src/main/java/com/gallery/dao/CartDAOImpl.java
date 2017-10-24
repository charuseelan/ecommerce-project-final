package com.gallery.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gallery.model.Cart;

@Transactional
@Repository
public class CartDAOImpl implements CartDAO {
	@Autowired
	SessionFactory sessionFactory;
	public void addToCart(Cart cartitem)
	{
		try
		{
			Session session=sessionFactory.openSession();
			Transaction trans=session.beginTransaction();
			session.save(cartitem);
			trans.commit();
			session.flush();
			session.close();
		}
		
		catch(Exception ex)
		{
			System.out.println("Error="+ex);
		}
	}
	public List<Cart> getCartItems(String uname)
	{
		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		Query query=session.createQuery("from Cart where uname=:uname and status='N'");
		query.setParameter("uname",uname);
		@SuppressWarnings("unchecked")
		List<Cart> list=query.list();
		return list;
	}
	public void deleteCartItem(Cart cart)
	{
		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction(); 
		session.delete(cart);
		trans.commit();
		session.close();
	}
	public Cart getCartItem(int citemid)
	{
		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		Cart cart=(Cart)session.get(Cart.class,citemid);
		return cart;
	}
	public void updateCartItem(Cart cart)
	{
		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		sessionFactory.getCurrentSession().update(cart);
	}
	
	

}
