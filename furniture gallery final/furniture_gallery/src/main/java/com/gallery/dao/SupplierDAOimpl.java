package com.gallery.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gallery.model.Supplier;

@Repository
public class SupplierDAOimpl implements SupplierDAO {

	@Autowired
	SessionFactory sessionFactory;
	public void addsupplier(Supplier supplier) {
	
	try
	   {
		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		session.save(supplier);
		trans.commit();
		session.flush();
		session.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
	public List<Supplier> getSupplierList() {
	    Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		List<Supplier> catlist = session.createQuery("from Supplier").list();
		trans.commit();
		session.flush();
		session.close();
		return catlist;
	

}
	public void deletesupplier(String id)
	{
		Session session=sessionFactory.openSession();
		Transaction tran=session.beginTransaction();
		Supplier supplier=(Supplier)session.get(Supplier.class,id); 
		session.delete(supplier);
		tran.commit();
		session.close();
		
	}
	
	public Supplier getSupplier(String id)
	{
		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		Supplier supplier=(Supplier)session.get(Supplier.class,id);
		trans.commit();
		session.flush();
		session.close();
		return supplier;
		
	}
	
	public void editsupplier(Supplier supplier)
	{
		Session session=sessionFactory.openSession();
		Transaction trans=session.beginTransaction();
		session.update(supplier);
		trans.commit();
		session.flush();
		session.close();
		
	}

}
