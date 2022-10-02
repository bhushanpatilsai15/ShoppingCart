package com.velocity.shoppingcart.user;

import java.util.Scanner;

import com.velocity.shoppingcart.invoice.Invoice;
import com.velocity.shoppingcart.products.ProductInformation;
import com.velocity.shoppingcart.products.ReduceProduct;

public class UserChoices {
	public void userChoice() {

		System.out.println("User login done!!!!!!!!");
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do {
			// Admin having authority to check
			System.out.println("1.check all products");
			System.out.println("2.purchase Product");
			System.out.println("3.Billing");
			ch = sc.nextInt();
			if (ch == 1) {
				System.out.println("check all products");
				ProductInformation pi = new ProductInformation();
				pi.getProducts();
				break;
			} else if (ch == 2) {
				System.out.println("purchase Product");

				System.out.println("1.HP");

				System.out.println("2.Dell");

				System.out.println("3.Asus");
				int num1 = sc.nextInt();
				int quantity = 0;
				ReduceProduct rp = null;
				switch (num1) {
				case 1:
					System.out.println("You have selected HP");
					System.out.println("Enter number of quantity: ");
					quantity = sc.nextInt();
					int numHp = 1;
					rp = new ReduceProduct();
					try {
						rp.reduceProductQuantity(numHp, quantity);
						
					Invoice inv= new Invoice();
					double invoice = inv.getInvoice(numHp, quantity);
					System.out.println(" You have to pay :"+invoice);
					} catch (Exception e) {

						e.printStackTrace();
					}
					break;
				case 2:
					System.out.println("You have selected Dell");
					System.out.println("Enter number of quantity: ");
					quantity = sc.nextInt();
					int numDell = 2;
					rp = new ReduceProduct();
					try {
						rp.reduceProductQuantity(numDell, quantity);
						Invoice inv= new Invoice();
						double invoice = inv.getInvoice(numDell, quantity);
						System.out.println(" You have to pay :"+invoice);
					} catch (Exception e) {

						e.printStackTrace();
					}
					break;
				case 3:
					System.out.println("You have selected Asus");
					System.out.println("Enter number of quantity: ");
					quantity = sc.nextInt();
					int numAsus =3;
					rp = new ReduceProduct();
					try {
						rp.reduceProductQuantity(numAsus, quantity);
						Invoice inv= new Invoice();
						double invoice = inv.getInvoice(numAsus, quantity);
						System.out.println(" You have to pay :"+invoice);
					} catch (Exception e) {

						e.printStackTrace();
					}

					break;
				default:
					System.out.println("You have enter wrong input");
				}

				break;
			} else if (ch == 3) {
				System.out.println("Billing");
				//Invoice invoice= new Invoice();
				break;
			} else
				System.out.println("Invalid input");
			break;

		} while (ch >= 4);

	}

}
