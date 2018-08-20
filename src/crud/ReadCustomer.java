package crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ReadCustomer {

	public static void main(String[] args) {
		//create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Customer.class)
				.buildSessionFactory();

		//create session
		Session session = factory.getCurrentSession();
		
		try {
			
			//start transaction
			session.beginTransaction();
			
			//Query customer
			List<Customer> theCustomers = session.createQuery("from Customer c where c.first_name='kevin'").list();
			 for( Customer tempcustomer : theCustomers) {
				 System.out.println(tempcustomer);
			 }
			
			
			session.getTransaction().commit();
			System.out.println("done");
			
		}
		finally {
			factory.close();
			
		}
	}

}
