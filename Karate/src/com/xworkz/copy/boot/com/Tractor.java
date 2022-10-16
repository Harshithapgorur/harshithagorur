package com.xworkz.copy.boot.com;

public class Tractor {
	
	public String ownerName;
	public String brand;
	public int price;
	public String color;
	public double hp;
	public String model;
	
	public Tractor() {
		System.out.println("Rule of constructer");
		
	}
	public Tractor( String ownerName) {
		this();
		System.out.println("using this constructer");
	}
	public Tractor( String ownerName,int price,String brand) {
		this();
		System.out.println("constructer name= class name");
	}
	public Tractor( String ownerName,int price,double hp) {
		this();
		System.out.println("constructer doesnot have return type");
	}
	
	public Tractor( int price,double hp) {
		this();
		System.out.println("constructer-initialize the object");
	}
	
	public Tractor( int price,String model) {
		this();
		System.out.println("constructer-initialize the object");
	}
	public Tractor(double hp,String model) {
		this();
		System.out.println("new -create an instance(object)");
	}
	
	
	

}
