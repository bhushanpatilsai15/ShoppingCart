package com.velocity.shoppingcart.products;

import java.util.Objects;

public class Product {
private int prod_id;
private String prod_description;
private String prod_price;
private String prod_name;
private int prod_quantity;




public Product(int prod_id, String prod_description, String prod_price, String prod_name, int prod_quantity) {
	super();
	this.prod_id = prod_id;
	this.prod_description = prod_description;
	this.prod_price = prod_price;
	this.prod_name = prod_name;
	this.prod_quantity = prod_quantity;
}
public int getProd_id() {
	return prod_id;
}
public void setProd_id(int prod_id) {
	this.prod_id = prod_id;
}
public String getProd_description() {
	return prod_description;
}
public void setProd_description(String prod_description) {
	this.prod_description = prod_description;
}
public String getProd_price() {
	return prod_price;
}
public void setProd_price(String prod_price) {
	this.prod_price = prod_price;
}
public String getProd_name() {
	return prod_name;
}
public void setProd_name(String prod_name) {
	this.prod_name = prod_name;
}



public int getProd_quantity() {
	return prod_quantity;
}
public void setProd_quantity(int prod_quantity) {
	this.prod_quantity = prod_quantity;
}
@Override
public int hashCode() {
	return Objects.hash(prod_description, prod_id, prod_name, prod_price, prod_quantity);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	return Objects.equals(prod_description, other.prod_description) && prod_id == other.prod_id
			&& Objects.equals(prod_name, other.prod_name) && Objects.equals(prod_price, other.prod_price)
			&& prod_quantity == other.prod_quantity;
}
@Override
public String toString() {
	return "Product [prod_id=" + prod_id + ", prod_description=" + prod_description + ", prod_price=" + prod_price
			+ ", prod_name=" + prod_name + ", prod_quantity=" + prod_quantity + "]";
}

}
