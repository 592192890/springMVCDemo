package com.bbg.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value="userDAO")
public class UserDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession(){
		Session session=this.sessionFactory.openSession();
		return session;
	}
	public User load(int id){
		return getSession().load(User.class,id);
	}
	
	public User get(int id){
		try {
			Session session=getSession();
			User u=session.get(User.class, id);
			return u;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
		
	}
	
	public List<User> getAllUsers(){
		return getSession().createQuery("FROM User").list();
	}
}
