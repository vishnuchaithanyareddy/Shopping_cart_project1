package com.vishnu.niit;

public class Product {
	private String username;
	private String id;
	private String color;
	private String size;
	private double price;
	 public Product(String id,String username)
	 {
		 this.id=id;
		 this.username=username;
	 }
	 public Product(String id,String username,String color)
	 {
		 this.id=id;
		 this.username=username;
		 this.color=color;
	 }
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
