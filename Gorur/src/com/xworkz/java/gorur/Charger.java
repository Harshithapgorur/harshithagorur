package com.xworkz.java.gorur;

public class Charger {
	public String name;
	public float quality;
	public int price;
	public boolean nice;
	
	public String[] color;
	public String[] brand;
	public String[] company;
	public String[] chargertype;
	public long[] Numbers;
	public String[] ownername;
	
	public Charger (String name,float quality , int price, boolean nice, String[] color,
			String[] brand, String[] company , String[]chargertype ,
			String[] ownername, long[] Numbers) {
		
		this.name = name; 
		this.quality = quality;
		this.price = price;
		this.nice = nice;
		this.color = color;
		this.brand = brand;
		this.company = company;
		this.chargertype = chargertype;
		this.ownername=ownername;
		this.Numbers=Numbers;
		
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
			for (int i = 0; i < this.chargertype.length; i++) {
				
			
				System.out.println(this.chargertype[i]);
			}
			for (int i = 0; i < ownername.length; i++) {
				System.out.println(this.ownername[i]);
			}
			for (int i = 0; i < Numbers.length; i++) {
				System.out.println(this.Numbers[i]);
				
			}
			
			

	
	
}


}




