package com.xworkz.java.programs.instanceMethod;

import com.xworkz.java.gorur.constent.LampType;

public class Lamp {
	public static String brand="Lamps_plus";//block
	public String name;//const
	public double price;//method
	public LampType lampType=LampType.SLOW_ELECTRIC;//literal
	public  boolean quality;//ref

	public Lamp(String name) {
		this.name=name;
}
	public  void setPrice(double price) {
		this.price=price;
		
}
	public void lamptype() {
	System.out.println(this.name);
	System.out.println(this.price);
	System.out.println(this.lampType);
	System.out.println(this.quality);
	System.out.println(Lamp.brand);
	
	}

}
