package com.trial.beans;

public class Product {
	String name = "micromax";
	String category;
	int id;
	boolean status;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(String name, String category, int id, boolean status) {
		super();
		this.name = name;
		this.category = category;
		this.id = id;
		this.status = status;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void purchase() {
		System.out.println("The product name: " + name + " id: " + id + " has been sold");
	}
	public void returnitem() {
		System.out.println("The product name: " + name + " id: " + id + " has been returned");
	}
	
	

}
