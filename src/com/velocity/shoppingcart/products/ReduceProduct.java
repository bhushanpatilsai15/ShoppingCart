package com.velocity.shoppingcart.products;

import java.sql.*;
import java.util.*;

import com.velocity.shoppingcart.connection.ConnectionPool;

public class ReduceProduct {
	ConnectionPool cp= new ConnectionPool();;
	Connection con =null;
	public List<Product> getProduct() throws Exception{
		
		con=cp.getConnectionDemo();
		Statement stm;
	    stm = con.createStatement();
	    String sql = "Select * From products";
	    ResultSet rst;
	    rst = stm.executeQuery(sql);
	    ArrayList<Product> productList = new ArrayList<>();
	    while (rst.next()) {
	    
	    	Product product = new Product(rst.getInt("prod_id"),rst.getString("prod_description"), rst.getString("prod_price"), rst.getString("prod_name"),rst.getInt("prod_quantity"));
	        productList.add(product);
	    }
	    return productList;

	}
public void reduceProductQuantity(int num,int quantity) throws Exception {
	List<Product> list= getProduct();
	for(Product p:list) {
		
		if(num == p.getProd_id()) {
	if(p.getProd_quantity()>0) {
		
	
			int numquantity=p.getProd_quantity()-quantity;
			
			con=cp.getConnectionDemo();
			Statement stm;
		    stm = con.createStatement();
		    String sql = "update products set prod_quantity=+"+numquantity+" where prod_id="+num;

		    	stm.execute(sql);
		    	//System.out.println(" Record updated in>>"+p.getProd_id());
		    	System.out.println("You have purchased "+quantity+" laptop of "+p.getProd_name());
		 
	}else
		System.out.println("quantity must not be less than zero!!!!");
		}
	}
}
}
