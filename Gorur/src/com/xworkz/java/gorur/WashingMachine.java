package com.xworkz.java.gorur;

import com.xworkz.java.gorur.constent.WashingMachinetype;

public class WashingMachine {
	
	public String name;
	public float quality;
	public int price;
	public boolean nice;
	public  WashingMachine washingMachine=WashingMachine.SEMI_AUTOMATIC;

	

	public String[] color;
	public String[] brand;
	public String[] company;
	public String[] Washing;
	public long[] icNumbers;
	public String[] ownername;
	
	public WashingMachine (String name,float quality , int price, boolean nice, String[] color,
			String[] brand, String[] company , String[] Washing ,
			String[] ownername, long[] icNumbers) {
		
		this.name = name; 
		this.quality = quality;
		this.price = price;
		this.nice = nice;
		this.color = color;
		this.brand = brand;
		this.company = company;
		this.Washing = Washing;
		this.ownername=ownername;
		this.icNumbers=icNumbers;
		
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
			for (int i = 0; i < this.Washing.length; i++) {
				
			
				System.out.println(this.Washing[i]);
			}
			for (int i = 0; i < ownername.length; i++) {
				System.out.println(this.ownername[i]);
			}
			for (int i = 0; i < icNumbers.length; i++) {
				System.out.println(this.icNumbers[i]);
				
			}
			
			

	
	
}


}




