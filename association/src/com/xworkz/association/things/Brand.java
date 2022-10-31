package com.xworkz.association.things;

import com.xworkz.association.constent.Location;

public class Brand {
	public String name;
	public int gatno;
	public Location location;
	public int rating;

	public Brand(String name, int gatno, Location location, int rating) {
		super();
		this.name = name;
		this.gatno = gatno;
		this.location = location;
		this.rating = rating;
	}

	public void showoff() {

		System.out.println(this.name);
		System.out.println(this.gatno);
		System.out.println(this.location);
		System.out.println(this.rating);

	}
}
