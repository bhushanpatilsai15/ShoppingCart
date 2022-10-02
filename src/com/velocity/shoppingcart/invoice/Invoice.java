package com.velocity.shoppingcart.invoice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import com.velocity.shoppingcart.connection.ConnectionPool;
import com.velocity.shoppingcart.products.ReduceProduct;

public class Invoice {
	ConnectionPool cp= new ConnectionPool();;
	Connection con =null;
	public double getInvoice(int num, int quantity) throws Exception {
		ReduceProduct rp= new ReduceProduct();
		
		con=cp.getConnectionDemo();
		Statement stm;
	    stm = con.createStatement();
	    String sql = "Select * From products";
	    ResultSet rst;
	    rst = stm.executeQuery(sql);
	    double val=0.0d;
	    while(rst.next()) {
	    	 val= rst.getDouble(3);
	    }
	   // System.out.println("The total amount have to pay: "+val *quantity );
	    return val *quantity;
	}
	
	
		
	}

	


