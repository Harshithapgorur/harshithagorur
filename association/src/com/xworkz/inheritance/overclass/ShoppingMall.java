package com.xworkz.inheritance.overclass;

public class ShoppingMall {
	public  String location;
	public  double income;
	public ShoppingMall(String location, double income) {
		super();
		this.location = location;
		this.income = income;
	}
	public void display() {
		System.out.println(this.location);
		System.out.println(this.income);
		
		
	}
	

}
