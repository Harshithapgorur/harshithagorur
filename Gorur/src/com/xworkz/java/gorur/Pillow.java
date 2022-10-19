package com.xworkz.java.gorur;

public class Pillow {
	public String name;
	public String source;
	public int price;
	public boolean nice;

	public String[] color;
	public String[] metireal;
	public String[] pillowcompany;
	public String[] ownerNames;
	public long[] ownersNumbers;
	public Pillow(String name, String source, int price, boolean nice, String[] color,
			String[] item, String[] pillowcompany, String[]ownerNames ,
			long[] ownersNumber, long[] ownersNumbers, String[] metireal) {
		this.name = name;
		this.source = source;
		this.price = price;
		this.nice = nice;
		this.color = color;
		this.metireal = metireal;
		this.pillowcompany = pillowcompany;
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
			
			System.out.println(System.lineSeparator() + " Metireals");	
			for (int i = 0; i < this.metireal.length; i++) {
				System.out.println(this.metireal[i]);
			}
			
			
			for (int i = 0; i < this.pillowcompany.length; i++) {
				System.out.println(this.pillowcompany[i]);
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
