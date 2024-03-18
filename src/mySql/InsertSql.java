package mySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertSql {

	String url="jdbc:mysql://127.0.0.1:3306/codebegun_test_db";
	String userName="root";
	String password="Akki@4505";

	void method(int n) {

		String insertquery="insert INTO  STUDENT_INFO(FIRSTNAME,LASTNAME,MOBILENUMBER,EMAILID,GENDER)"
				+ "VALUES(?,?,?,?,?)";
		try {
			
			//Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection connection=DriverManager.getConnection(url, userName, password);
			PreparedStatement statement=connection.prepareStatement(insertquery);
			Scanner type = new Scanner(System.in);
			for(int i=1;i<=n;i++) {
			 System.out.println("Enter The FName");
			 String FName = type.next();
			 System.out.println("Enter The LName");
			 String LName = type.next();
			 System.out.println("Enter The Email");
			 String Email = type.next();
			 System.out.println("Enter The PhoneNumber");
			 Long PhoneNumber = type.nextLong();
			 System.out.println("Enter The Gender");
			 Boolean gender = type.nextBoolean();
			statement.setString(1, FName);
			statement.setString(2, LName);
			statement.setLong(3, PhoneNumber);
			statement.setString(4,Email);
			statement.setBoolean(5,gender);
			int no=statement.executeUpdate();
			System.out.println(no);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


	}
	
	void method1() {
		String updateSql="update STUDENT_INFO set FIRSTNAME='Akshay' where gender=1 ";
     try {
			
			//Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection connection=DriverManager.getConnection(url, userName, password);
			Statement statement=connection.createStatement();
			int no=statement.executeUpdate(updateSql);
			System.out.println(no);
     }
     catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	void method2() {
		String deleteSql="delete from STUDENT_INFO where gender=0 ";
     try {
			
			//Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection connection=DriverManager.getConnection(url, userName, password);
			Statement statement=connection.createStatement();
			int no=statement.executeUpdate(deleteSql);
			System.out.println(no);
     }
     catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
	



	

