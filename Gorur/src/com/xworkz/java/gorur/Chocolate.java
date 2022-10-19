package com.xworkz.java.gorur;

public class Chocolate {
	public String name;
	public boolean taste;
	public int price;
	public String Buyfrom;
	public String benefits;

	public String[] color;
	public String[] companyName;
	public String[] materials;
	public float[] rawmaterial;
	public String[] managerName;
	public int[] custamercareNumber;
	


	public Chocolate(String name, boolean taste, int price, String Buyfrom, String benefits, String[] color,
			String[] companyName, String[] materials,  float[] rawmaterial, String[] managerName, int[] custamercareNumber) {
		this.name = name;
		this.taste = taste;
		this.price = price;
		this.Buyfrom = Buyfrom;
		this.benefits = benefits;
		this.color = color;
		this.rawmaterial = rawmaterial;
		this.companyName = companyName;
		this.custamercareNumber = custamercareNumber;
		this.managerName = managerName;

	}

	public void display() {
		System.out.println("Name :" + this.name);
		System.out.println(this.taste);
		System.out.println(this.Buyfrom);
		System.out.println(this.benefits);
		System.out.println(this.price);

		for (int i = 0; i < companyName.length; i++) {
			String string = companyName[i];
			System.out.println(string);

		}
		for (int i = 0; i < color.length; i++) {
			String string = color[i];
			System.out.println(string);
		}
		for (int i = 0; i < rawmaterial.length; i++) {
			float f = rawmaterial[i];
			System.out.println(f);
		}

		for (int i = 0; i < managerName.length; i++) {
			System.out.println(managerName[i]);
		}
		for (int i = 0; i < custamercareNumber.length; i++) {
			i = custamercareNumber[i];
			
		}
	}
}
