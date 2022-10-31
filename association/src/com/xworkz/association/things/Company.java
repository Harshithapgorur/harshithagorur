package com.xworkz.association.things;

public class Company {
	public String name;
	public String ownerName;
	public Address address;
	public Company(String name, String ownerName, Address address) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.address = address;
	}
	public void showOff() {
		System.out.println(this.name);
		System.out.println(this.ownerName);
		System.out.println(this.address);
	}
	public void company(String company1, String company2) {
		
		
	}

}
