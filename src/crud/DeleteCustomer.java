package crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteCustomer {

	public static void main(String[] args) {
		//create session factory
				SessionFactory factory = new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Customer.class)
						.buildSessionFactory();
		
				
		//create session
		Session session = factory.getCurrentSession();
		try {
			//id you want to delete
			int deleteID = 1;
			
			session.beginTransaction();
			
			//get the object
			Customer theCustomer = session.get(Customer.class, deleteID);
			
			//delete customer
			session.delete(theCustomer);
			
			session.getTransaction().commit();
			System.out.println("done");
			
		}finally {
			factory.close();
			
		}

	}

}
