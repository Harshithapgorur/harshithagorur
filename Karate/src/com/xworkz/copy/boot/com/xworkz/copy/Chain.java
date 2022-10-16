package com.xworkz.copy.boot.com.xworkz.copy;

public class Chain {
	public String type;
	public double price;
	public double length;
	public String meterial;
	public boolean stolen;
	public String usedFor;
	public boolean fresh;
	
	public Chain() {
		System.out.println( "chain for dog" );
		
	}
	public Chain(String type,double price) {
	this();
	System.out.println("uses of chain");
	}
	
	public Chain( double length,double price) {
		this();
		System.out.println("chain earring");
		}
	
	public Chain( double weight, boolean meteria) {
		this();
		System.out.println("nice chain");
		}
	
	public Chain(  boolean stolen,boolean fresh) {
		this();
		System.out.println("data type for boolean is t/f");
		
		}
	public Chain(  String usedFor,boolean fresh) {
		this();
		System.out.println("data type");
		
	}
	public Chain(String type,boolean meterial,String usedFor) {
		this();
		System.out.println("data type");
		
	}
	public Chain(  String usedFor,boolean fresh,double price) {
		this();
		System.out.println("data type");
		
	}
	
	
	
	

}
