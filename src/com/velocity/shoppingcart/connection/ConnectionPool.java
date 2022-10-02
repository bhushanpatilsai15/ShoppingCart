package com.velocity.shoppingcart.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionPool {
public Connection getConnectionDemo() throws Exception {
		
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingcart","root", "Root");
		return con;
	}
}
