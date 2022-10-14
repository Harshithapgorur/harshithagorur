package com.xworkz.boot;

public class Fish {
	public String name;
	public String type;
	public double price;
	public float weight;
	public double length;
	
	
	public Fish() {
		System.out.println("entered fish name");
		
	
	}
	public Fish(String name) {
		this.name=name;
		System.out.println("================");
		
	}
	public Fish(String name,double price) {
		this.name=name;
		this.price=price;
		
	}
	public Fish(String name,double price,double length) {
		this.name=name;
		this.price=price;
		this.length=length;
	}

}
