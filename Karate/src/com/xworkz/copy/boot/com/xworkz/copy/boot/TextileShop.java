package com.xworkz.copy.boot.com.xworkz.copy.boot;

public class TextileShop {
	public String ownerName;
	public String ownerwifeName;
	public String ownerDaughterName;
	public int Ownersnoofwife;
	public int contacNo;
	public float shopNo;
	
	public TextileShop() {
		System.out.println( "TextileShop" );
		
	}
	public TextileShop(String ownerName) {
	this();
	System.out.println("Raju");
	
}
	
	public TextileShop(String ownerwifeName,int contacNo) {
		this();
		System.out.println("Rani");
		
	}
	public TextileShop(String ownerwifeName,int contacNo,String ownerDaughterName) {
		this();
		
	}

	public TextileShop(float shopNo,int contacNo) {
		this();
		
		
	}
	public TextileShop(float shopNo,int contacNo,String ownerDaughterName) {
		this();
	
	}
	public TextileShop(float shopNo,int contacNo,String ownerName, int Ownersnoofwife) {
		this();
		
		
	}
	

}
