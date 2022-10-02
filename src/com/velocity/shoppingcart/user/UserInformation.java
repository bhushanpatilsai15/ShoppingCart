package com.velocity.shoppingcart.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.velocity.shoppingcart.connection.ConnectionPool;

public class UserInformation {

	
	public void getAllUsers() {
		
		ConnectionPool cp = new ConnectionPool();
		try {
			Connection con = cp.getConnectionDemo();
			PreparedStatement ps = con.prepareStatement("select * from user");
			ResultSet rs = ps.executeQuery();
			int i=1;
			while(rs.next())
			{
				System.out.println("User+"+i+">> " +rs.getString(2));
			i++;
				System.out.println();
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	}

