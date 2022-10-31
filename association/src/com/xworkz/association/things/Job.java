package com.xworkz.association.things;

public class Job {
	public double salary;
	public String role;
	public double bond;
	public Company company;
	public Job(double salary, String role, double bond, Company company) {
		super();
		this.salary = salary;
		this.role = role;
		this.bond = bond;
		this.company = company;
	}
	public void Showoff() {
		System.out.println(this.salary);
		System.out.println(this.role);
		System.out.println(this.bond );
		System.out.println(this.company);
	}
	
	

}
