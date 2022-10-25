package com.xworkz.java.programs.instanceMethod;

	import com.xworkz.java.gorur.constent.SweetColor;


	public class Sweet {
		
		public static String shopNama="Tree";//block
		public String name;//const
		public double price;//method
		public SweetColor sweetColor=SweetColor.RED_YELLOW;//literal
		public double quantity;//ref
		
		
		public void displayTotalPrice() {
			double total=quantity* this.price;
			System.out.println("total price of flower is "+total);
			
			
			
			
		}
		
		
		public Sweet(String name) {
			this.name=name;
	}
		public void setPrice(double price) {
			this.price=price;
			
	}
		public void sweetoff() {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.sweetColor);
		System.out.println(this.quantity);
		System.out.println(Sweet.shopNama);
		
	}
		
	}

