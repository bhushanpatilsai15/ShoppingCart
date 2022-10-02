package com.velocity.shoppingcart.homscreen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.velocity.shoppingcart.admin.Admin;

import com.velocity.shoppingcart.connection.ConnectionPool;
import com.velocity.shoppingcart.products.ProductInformation;
import com.velocity.shoppingcart.user.UserCheck;
import com.velocity.shoppingcart.user.UserChoices;
import com.velocity.shoppingcart.user.UserInformation;
import com.velocity.shoppingcart.user.UserRegistration;

//Starting page of the application
public class WelcomePage {
	static Admin admin = new Admin();

	// it hadles the admin login code
	public static void getAdmin(String name, String password) throws Exception {
		String adminName = null;
		String adminPass = null;
		// making connection pooling
		ConnectionPool cp = new ConnectionPool();
		Connection connection = cp.getConnectionDemo();
		PreparedStatement st = connection.prepareStatement("Select admin_name, admin_password from admin");
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			adminName = rs.getString(1);
			adminPass = rs.getString(2);
		}
		String mm = admin.getAdmin_name();
		String ss = admin.getAdmin_password();

		// checking the input value and database vales
		if (adminName.equals(mm) && adminPass.equals(ss)) {

			System.out.println("Admin login done!!!!!!!!");
			Scanner sc = new Scanner(System.in);
			int ch = 0;
			do {
				//Admin having authority to check
				System.out.println("1.check all products");
				System.out.println("2.check all users");
				System.out.println("3.check Purchase History of user");
				ch = sc.nextInt();
				if (ch == 1) {
					System.out.println("check all products");
					ProductInformation pi = new ProductInformation();
					pi.getProducts();
					break;
				} else if (ch == 2) {
					System.out.println("check all users");
					UserInformation ui = new UserInformation();
					ui.getAllUsers();
					break;
				} else if (ch == 3) {
					System.out.println("check Purchase History of user");
					break;
				} else
					System.out.println("Invalid input");
				break;

			} while (ch >= 4);

		} else

			System.out.println("Invalid admin");
	}

	public static void getUser(String name, String password) {
		
		UserCheck uc = new UserCheck();
		uc.checkValidUser(name, password);
		//user choice
		UserChoices uc1 = new UserChoices();
		uc1.userChoice();
		
	}

	public static void getUserRegister(String name, String password) {
		UserRegistration ur= new UserRegistration();
		ur.getRegisterUser(name, password);
	}

	public static void welcomeCode() {
		System.out.println("Welcome to E-Shoppingcart");
		System.out.println("1. Admin ");
		System.out.println("2. Old User");
		System.out.println("3. New User(Register)");
		System.out.println("4. Exit");
	}

	public static void main(String[] args) throws Exception {

		welcomeCode();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number>>>");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.print("Enter Admin Name: ");
			String adminName = sc.next();
			System.out.print("Enter Admin Password: ");
			String adminPassword = sc.next();

			admin.setAdmin_name(adminName);
			admin.setAdmin_password(adminPassword);
			getAdmin(adminName, adminPassword);
			break;
		case 2:
			System.out.println("Enter User Name: ");
			String userName = sc.next();
			System.out.println("Enter User Password: ");
			String userPassword = sc.next();
			getUser(userName, userPassword);
			break;
		case 3:
			System.out.println("Enter User Name: ");
			String newName = sc.next();
			System.out.println("Enter User Pass: ");
			String newPassword = sc.next();
			getUserRegister(newName, newPassword);

			break;
		case 4:

			System.out.println("Exit From application");
			System.out.println();
			System.out.println("Thank for visiting Store !!! visit again...");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid User input");
		}
	}
}
