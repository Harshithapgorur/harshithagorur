package com.xworkz.java.gorur;

import com.xworkz.java.gorur.constent.PhoneType;

public class Phone {
	
	
		public String name;
		public float quality;
		public int price;
		public boolean nice;
		public  PhoneType type=PhoneType.SETTING;

		public String[] color;
		public String[] brand;
		public String[]phonecompany;
		public String[] phoneconnentedDevices;
		public long[] ownersNumbers;
		public String[] password;
		
		public Phone (String name,float quality , int price, boolean nice, String[] color,
				String[] brand, String[] phonecompany , String[]phoneconnentedDevices ,
				long[] ownersNumber,String[] password,PhoneType type) {
			
			this.name = name; 
			this.quality = quality;
			this.price = price;
			this.nice = nice;
			this.color = color;
			this.brand = brand;
			this.phonecompany = phonecompany;
			this.phoneconnentedDevices = phoneconnentedDevices;
			
			this.password=password;
			this.type=type;
		}
			
			

		

			public  void display() {
				System.out.println("Name : " +this.name);
				System.out.println(this.quality);
				System.out.println(this.price);
				System.out.println(this.nice);
				System.out.println(this.type) ;
				System.out.println(System.lineSeparator() + "Colours : ");
				for (int i = 0; i < color.length; i++) {
					System.out.println(this.color[i]);
				}
				
				for (int i = 0; i < this.brand.length; i++) {
					System.out.println(this.brand[i]);
				}
				
				for (int i = 0; i < this.phonecompany.length; i++) {
					System.out.println(this.phonecompany[i]);
				}
				for (int i = 0; i < this.ownersNumbers.length; i++) {
					long string = this.ownersNumbers[i];
					System.out.println(string);
				}
				for (int i = 0; i < phoneconnentedDevices.length; i++) {
					System.out.println(this.phoneconnentedDevices[i]);
				}
				for (int i = 0; i < password.length; i++) {
					System.out.println(this.password[i]);
					
				}
				
				

		
		
	}


	}



