package com.velocity.shoppingcart.products;

import java.util.ArrayList;
import java.util.ListIterator;

public class PurchaseProduct {

	public void purchaseItem(Product p) {
		ArrayList<Product> list= new ArrayList<Product>();
		ListIterator<Product> iterator1 = list.listIterator();
		while(iterator1.hasNext()) {
			Product item2 = iterator1.next();
			if (item2.getProd_name().equals(p.getProd_name())) {
				list.remove(p);
				break;
			}
		}
		
		
	}
}
