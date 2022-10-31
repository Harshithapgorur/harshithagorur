package com.xworkz.association.things;

import com.xworkz.association.constent.Type;

public class Fuel {
	public Brand brand= new Brand("Bharath petroleum",455678987654l,"Rajajinagara",5);
	public boolean special;
	public Type type;
	public double price;
	public double quantity;

	public Fuel(Brand brand, boolean special, Type type, double price, double quantity) {
		super();
		this.brand = brand;
		this.special = special;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}

	public void showoff() {
		System.out.println(this.special);
		System.out.println(this.price);
		System.out.println(this.brand);
		System.out.println(this.type);
		System.out.println(this.quantity);
	}

}
