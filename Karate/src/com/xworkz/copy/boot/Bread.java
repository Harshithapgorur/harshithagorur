package com.xworkz.copy.boot;

public class Bread {

	public String type1;
	public String shape;
	public double price;
	public float quantity;
	public String CompanyName;
	
	public Bread() {
		System.out.println("enter Bread type ");
		
	
	}
	public Bread(String type1) {
		this.type1=type1;
		System.out.println("diffining the bread type");
	}
	public Bread(String type1,String shape) {
		this.type1=type1;
		this.shape=shape;
	}
	public Bread(String shape,double price) {
		this.shape=shape;
		this.price=price;
	}
	public Bread(float quantity) {
		this.quantity=quantity;
	
	}
	public Bread(String CompanyName,String shape,String type1) {
		this.type1=type1;
		this.shape=shape;
	this.CompanyName=CompanyName;
	
}
	public Bread(String CompanyName,String shape,String type1,double price) {
		this.type1=type1;
		this.shape=shape;
	this.CompanyName=CompanyName;
	this.price=price;
}
	public Bread(String CompanyName,double price,String shape) {
		this.shape=shape;
	this.CompanyName=CompanyName;
	this.price=price;
	
}
	public Bread(String CompanyName,String shape,String type1,double price,float quantity) {
		this.type1=type1;
		this.shape=shape;
	this.CompanyName=CompanyName;
	this.price=price;
	this.quantity=quantity;
	
}
}