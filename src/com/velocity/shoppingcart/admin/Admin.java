package com.velocity.shoppingcart.admin;

import java.util.Objects;

public class Admin {
	

	private int admin_id ;
	private String admin_name; 
	private String admin_password;
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(int admin_id, String admin_name, String admin_password) {
		super();
		this.admin_id = admin_id;
		this.admin_name = admin_name;
		this.admin_password = admin_password;
	}
	
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(admin_id, admin_name, admin_password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		return admin_id == other.admin_id && Objects.equals(admin_name, other.admin_name)
				&& Objects.equals(admin_password, other.admin_password);
	}
	
	
}
