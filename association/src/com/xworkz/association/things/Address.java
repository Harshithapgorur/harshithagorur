package com.xworkz.association.things;

public class Address {
	public static Location location;

	public Address(Location location) {
		super();
		this.location = location;
	}
	public void Showoff() {
		System.out.println(this.location);
	}

}
