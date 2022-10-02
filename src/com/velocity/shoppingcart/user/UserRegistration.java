package com.velocity.shoppingcart.user;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.velocity.shoppingcart.connection.ConnectionPool;

public class UserRegistration {
	
	public void getRegisterUser(String s1,String s2) {
		
		ConnectionPool cp= new ConnectionPool();
		try {
			Connection con = cp.getConnectionDemo();
			PreparedStatement ps = con.prepareStatement("insert into user(user_name,user_password) values(?,?)");
		ps.setString(1,s1 );
		ps.setString(2, s2);
		
		ps.executeUpdate();
		System.out.println("User Registration done !!!!!");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
