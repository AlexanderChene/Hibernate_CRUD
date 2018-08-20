package crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCustomer {

	public static void main(String[] args) {
		
		//create session factory
		SessionFactory factory = new Configuration()
				            .configure("hibernate.cfg.xml")
				            .addAnnotatedClass(Customer.class)
				            .buildSessionFactory();
		
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			//create object
			Customer theCustomer = new Customer("Kevin", "Duranr","KD35@nba.com");
			
			//start transaction
			session.beginTransaction();
			
			//commit transaction
			session.save(theCustomer);
			
			session.getTransaction().commit();
			System.out.println("done");
			
		}
		finally {
			factory.close();
			
		}

	}

}
