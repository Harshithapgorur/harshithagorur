package com.xworkz.java.programs.instanceMethod;

import com.xworkz.java.gorur.constent.CrackerType;


public class Cracker {
	public static String shopNama="Super Cracker";//block
	public String name;//const
	public double price;//method
	public CrackerType crackerType=CrackerType.FLOWER_POTS;//literal
	public  double quantity;//ref

	public Cracker(String name) {
		this.name=name;
}
	public  void setPrice(double price) {
		this.price=price;
		
}
	public void displayTotalPrice() {
		double total=quantity* this.price;
		System.out.println("total price of Cracker is "+total);
		
		
		
		
	}
	public void Crackeroff() {
	System.out.println(this.name);
	System.out.println(this.price);
	System.out.println(this.crackerType);
	System.out.println(this.quantity);
	System.out.println(Cracker.shopNama);
	
}
	

}
