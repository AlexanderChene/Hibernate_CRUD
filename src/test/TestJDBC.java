package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//connect JDBC
		String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
		String user = "springstudent";
		String pwd = "springstudent";
		
		try {
			//connect to database
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pwd);
			System.out.println("Connect successfully");
		}catch(Exception exc){
			exc.printStackTrace();
			
			
		}

	}

}
