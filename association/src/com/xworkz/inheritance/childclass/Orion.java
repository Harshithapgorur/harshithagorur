package com.xworkz.inheritance.childclass;

import com.xworkz.inheritance.overclass.ShoppingMall;

public class Orion  extends ShoppingMall{
	public  String shopgstNo;
	public Orion(String location, double income,String shopgstNo) {
		super(location,income);
		this.shopgstNo=shopgstNo;
	}
		
	

	public void display() {
		super.display();
		System.out.println( this.shopgstNo);
		
		
		
		
		
	}
	
}
