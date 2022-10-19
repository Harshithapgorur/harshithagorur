package com.xworkz.java.gorur;

import com.xworkz.java.gorur.constent.Bottletype;

public class Bottle {
	
	public String name;
	public float quality;
	public int price;
	public boolean nice;
	public Bottletype bottle=Bottletype.ALUMINUM; 
	public String[] color;
	public String[] brand;
	public String[] company;
	public String[] botelcapcolor;
	public long[] siNumbers;
	public String[] ownername;
	
	public Bottle (String name,float quality , int price, boolean nice, String[] color,
			String[] brand, String[] company , String[]botelcapcolor ,
			String[] ownername, long[] siNumbers) {
		
		this.name = name; 
		this.quality = quality;
		this.price = price;
		this.nice = nice;
		this.color = color;
		this.brand = brand;
		this.company = company;
		this.botelcapcolor = botelcapcolor;
		this.ownername=ownername;
		this.siNumbers=siNumbers;
		
	}
		

		


		public  void display() {
			System.out.println("Name : " +this.name);
			System.out.println(this.quality);
			System.out.println(this.price);
			System.out.println(this.nice);
			
			System.out.println(System.lineSeparator() + "Colours : ");
			for (int i = 0; i < color.length; i++) {
				System.out.println(this.color[i]);
			}
			
			for (int i = 0; i < this.brand.length; i++) {
				System.out.println(this.brand[i]);
			}
			
			for (int i = 0; i < this.company.length; i++) {
				System.out.println(this.company[i]);
			}
			for (int i = 0; i < this.botelcapcolor.length; i++) {
				
			
				System.out.println(this.botelcapcolor[i]);
			}
			for (int i = 0; i < ownername.length; i++) {
				System.out.println(this.ownername[i]);
			}
			for (int i = 0; i < siNumbers.length; i++) {
				System.out.println(this.siNumbers[i]);
				
			}
			
			

	
	
}


}



