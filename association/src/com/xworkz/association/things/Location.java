package com.xworkz.association.things;

public class Location {
	public int number;
	public String street;
	public State state;
	public City city;
	public Country country;
	public Location(int number, String street, State state, City city, Country country) {
		super();
		this.number = number;
		this.street = street;
		this.state = state;
		this.city = city;
		this.country = country;
	}
	public void Showoff() {
	System.out.println(this.number);
	System.out.println(this.street);
	System.out.println(this.state);
	System.out.println(this.city);
	System.out.println(this.country);

}
}

