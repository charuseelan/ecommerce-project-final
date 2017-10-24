package com.gallery.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gallery.model.Category;


@Repository
public class CategoryDAOimpl implements CategoryDAO{

	@Autowired
	SessionFactory sf;
	public void addCategory(Category category)
	{
		try
		{
		Session sec=sf.openSession();	
		Transaction trans=sec.beginTransaction();
		sec.save(category);
		trans.commit();
		sec.flush();
		sec.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@SuppressWarnings("unchecked")
	public List<Category> getCategoryList(){
		Session sec=sf.openSession();
		Transaction trans=sec.beginTransaction();
		List<Category> catlist = sec.createQuery("from Category").list();
		trans.commit();
		sec.flush();
		sec.close();
		return catlist;

	}

	
	public void deletecategory(String id)
	{
		Session session=sf.openSession();
		Transaction tran=session.beginTransaction();
		Category category=(Category)session.get(Category.class,id); 
		session.delete(category);
		tran.commit();
		session.close();
		
	}
	
	public Category getCategory(String id)
	{
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
		Category category=(Category)session.get(Category.class,id);
		trans.commit();
		session.flush();
		session.close();
		return category;
		
	}
	
	public void editcategory(Category category)
	{
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
		session.update(category);
		trans.commit();
		session.flush();
		session.close();
		
	}
}
