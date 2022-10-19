package com.xworkz.java.gorur;

public class Bag {
	public String name;
public String source;
public int price;
public boolean nice;

public String[] color;
public String[] items;
public String[] bagscompany;
public String[] ownerNames;
public long[] ownersNumbers;
public Bag(String name, String source, int price, boolean nice, String[] color,
		String[] item, String[] bagscompany, String[]ownerNames ,
		long[] ownersNumber, String[] items, long[] ownersNumbers) {
	
	this.name = name;
	this.source = source;
	this.price = price;
	this.nice = nice;
	this.color = color;
	this.items = items;
	this.bagscompany = bagscompany;
	this.ownerNames = ownerNames;
	this.ownersNumbers = ownersNumbers;
}
	
	public void display() {
		System.out.println("Name : " +this.name);
		System.out.println(this.source);
		System.out.println(this.price);
		System.out.println(this.nice);
		
		System.out.println(System.lineSeparator() + "Colours : ");
		for (int i = 0; i < color.length; i++) {
			System.out.println(this.color[i]);
		}
		
		System.out.println(System.lineSeparator() + "Compartments Names: ");	
		for (int i = 0; i < this.items.length; i++) {
			System.out.println(this.items[i]);
		}
		
		
		for (int i = 0; i < this.bagscompany.length; i++) {
			System.out.println(this.bagscompany[i]);
		}
		
		for (int i = 0; i < this.ownerNames.length; i++) {
			System.out.println(this.ownerNames[i]);
		}
		for (int i = 0; i < this.ownersNumbers.length; i++) {
			long string = this.ownersNumbers[i];
			System.out.println(string);
		}
		
		
		

}
}