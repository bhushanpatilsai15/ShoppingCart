package com.velocity.shoppingcart.products;

import java.sql.SQLException;
import java.util.List;


public class Test {
public static void main(String[] args) {
	ReduceProduct rp= new ReduceProduct();
	
	
try {
	//System.out.println(rp.getProduct());
	List<Product> list= rp.getProduct();
	for(Product p:list) {
		System.out.println(p.getProd_id()+"  "+p.getProd_name());
		System.out.println("**********************");
	}
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


}
}
