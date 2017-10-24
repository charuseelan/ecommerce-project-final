package com.gallery.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gallery.model.User;


@Repository
public class UserDAOimpl implements UserDAO {

	
	@Autowired
	SessionFactory sessionFactory;

	public void adduser(User user) {
		// TODO Auto-generated method stub
		
		try
		{
			Session session=sessionFactory.openSession();
			Transaction trans=session.beginTransaction();
			session.save(user);
			trans.commit();
			session.flush();
			session.close();
		}
		
		catch(Exception ex)
		{
			System.out.println("Error="+ex);
		}

}
}
