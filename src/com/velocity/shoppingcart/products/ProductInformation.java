package com.velocity.shoppingcart.products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import com.velocity.shoppingcart.connection.ConnectionPool;

public class ProductInformation {

	public void getProducts(){
		//List<Product> productList= new ArrayList<Product>();
		ConnectionPool cp = new ConnectionPool();
		try {
			Connection con = cp.getConnectionDemo();
			PreparedStatement ps = con.prepareStatement("select * from products");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println("Product name>> " +rs.getString(3));
				System.out.println("Product Discription>> " + rs.getString(2));
				System.out.println("product price >> " +rs.getString(3));
				System.out.println("product quantity>> " + rs.getString(5));
				
				System.out.println("***************************");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
