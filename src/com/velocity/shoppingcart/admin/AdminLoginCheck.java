package com.velocity.shoppingcart.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.velocity.shoppingcart.connection.ConnectionPool;

public class AdminLoginCheck {
	
	public boolean adminLoginCheck() throws Exception {
		String adminName=null;
		String adminPassword=null;
		Admin admin = new Admin();
		System.out.println(admin.getAdmin_name());
		System.out.println(admin.getAdmin_password());
		ConnectionPool cp = new ConnectionPool();
		Connection connection = cp.getConnectionDemo();
		PreparedStatement st = connection.prepareStatement("Select admin_name, admin_password from admin");
		ResultSet rs = st.executeQuery();
		//System.out.println("55555");
		while (rs.next()) {
			adminName=rs.getString(1);
			adminPassword=rs.getString(2);
		}
		System.out.println(adminName);
		System.out.println(adminPassword);
		System.out.println("**********");
		System.out.println(admin.getAdmin_name());
		System.out.println(admin.getAdmin_password());
		
		if(adminName.equals(admin.getAdmin_name()) && adminPassword.equals(admin.getAdmin_password())) {
			
			System.out.println("Admin login from Database");
		
		return true;
		}else
			return false;
		
	}

	}
	
