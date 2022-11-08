package com.xworkz.association.things;

public class Email {

	public long id;
	public int password;
	public long mobileNo;

	State state = new State("KAR", 30, "JAYA KARNTAKA", 567890);
	City city = new City("Bengaluru", 78, "BBMP", "Metro-politon");
	Country country = new Country("INDIA", 28, "JANA GANA MANA", 91);
	Location location = new Location(890778078, "JP NAGAR", state, city, country);
	Address address = new Address(location);
	public Company company = new Company("Google", "Larry", address);

	public void email(long id, int password, long mobileNo) {

		this.id = id;
		this.password = password;
		this.mobileNo = mobileNo;
	}

	public void Showoff() {
		if (company != null) {
			company.company("Gmail", "zoho mail");
			company.showOff();
		} else {
			System.out.println("company is not showoff");
		}

		System.out.println(System.lineSeparator());
		System.out.println("********************************");
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.mobileNo);

	}

}