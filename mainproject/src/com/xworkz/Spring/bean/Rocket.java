package com.xworkz.Spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component


public class Rocket {
	@Value("India")
	private String country;
	@Value("vikram")
	private String name;
	@Value("80.00")
	private double budget;
	public Rocket() {
		System.out.println("calling no-argument cont");
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	
	
	

}
