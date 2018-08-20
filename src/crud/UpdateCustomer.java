package crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class UpdateCustomer {
	
	public static void main (String [] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Customer.class)
				.buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			int updateID=2;
			
			session.beginTransaction();
			
			Customer theCustomer = session.get(Customer.class, updateID);
			
			//update fields
			theCustomer.setEmail("abc@qq.com");
			
			//commit the transaction
			session.getTransaction().commit();
			
			
		}
		finally {
			factory.close();
			
		}
	}

}
