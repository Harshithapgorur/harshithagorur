package com.xworkz.association.things;

public class Country {
	public String name;
	public int numberOfState;
	public String Countrymusic;
	public int CountryCode;

	public Country(String name, int numberOfState, String countrymusic, int CountryCode) {
		super();
		this.name = name;
		this.numberOfState = numberOfState;
		this.Countrymusic = countrymusic;
		this.CountryCode = CountryCode;
	}

	public void Showoff() {
		System.out.println(this.name);
		System.out.println(this.numberOfState);
		System.out.println(this.Countrymusic);
		System.out.println(this.CountryCode);
	}

}
