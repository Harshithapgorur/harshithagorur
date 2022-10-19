package com.xworkz.java.gorur;

import com.xworkz.java.gorur.constent.Type;

public class Bluetooth {
	public String name;
	public float quality;
	public int price;
	public boolean nice;
	public  Type type=Type.BLUETOOTH_HEADSET;

	public String[] color;
	public String[] brand;
	public String[] bluetoothcompany;
	public String[] connentedDevices;
	public long[] ownersNumbers;
	public String[] password;
	
	public Bluetooth (String name,float quality , int price, boolean nice, String[] color,
			String[] brand, String[] bluetoothcompany , String[]connentedDevices ,
			long[] ownersNumber,String[] password,Type type, long[] ownersNumbers) {
		
		this.name = name; 
		this.quality = quality;
		this.price = price;
		this.nice = nice;
		this.color = color;
		this.brand = brand;
		this.bluetoothcompany = bluetoothcompany;
		this.ownersNumbers = ownersNumbers;
		this.connentedDevices=connentedDevices;
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
			
			for (int i = 0; i < this.bluetoothcompany.length; i++) {
				System.out.println(this.bluetoothcompany[i]);
			}
			for (int i = 0; i < this.ownersNumbers.length; i++) {
				long string = this.ownersNumbers[i];
				System.out.println(string);
			}
			for (int i = 0; i < connentedDevices.length; i++) {
				System.out.println(this.connentedDevices[i]);
			}
			for (int i = 0; i < password.length; i++) {
				System.out.println(this.password[i]);
				
			}
			
			

	
	
}


}
