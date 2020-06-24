package edu.aspire.daos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.aspire.domain.Student;

public class InsertStudent {
	public static void main(String[] args) {
		Configuration cfg = new Configuration(); //Starts hibernate framework
		cfg.configure("hibernate.cfg.xml"); //Loads hib configuration file
		SessionFactory factory = cfg.buildSessionFactory(); //Builds factory obj. Create and manage pool of connections
		Session s = factory.openSession(); //Opens an empty session without connection
		Transaction tx = s.beginTransaction(); //Begins tx and gives connection to session
		
		Student s1 = new Student();
		s1.setSno(1);
		s1.setSname("xyz");
		s1.setEmail("xyz@java2aspire.com");
		s1.setMobile(9885407683L);
		
		s.save(s1); //The pojo obj moves into session and sets some flag with f/w
		s.flush(); //The record is inserted but not commited
		tx.commit(); //commits tx and returns con back to pool
		s.close();
	}
}
