package com.xworkz.association.things;

public class City {
	public String name;
	public int numberofplan;
	public  String CityGovernment;
	public  String CityCouncil;
	public City(String name, int numberofplan, String cityGovernment, String cityCouncil) {
		super();
		this.name = name;
		this.numberofplan = numberofplan;
		CityGovernment = cityGovernment;
		CityCouncil = cityCouncil;
	}
	public void Showoff() {
		System.out.println(this.name);
		System.out.println(this.numberofplan);
		System.out.println(this.CityGovernment);
		System.out.println(this.CityCouncil);
	}
}


