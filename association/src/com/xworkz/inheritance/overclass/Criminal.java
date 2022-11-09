package com.xworkz.inheritance.overclass;

public class Criminal {
	public  String nameOfCrimes;
	public boolean jail;
	public Criminal(String nameOfCrime, boolean jail) {
		super();
		this.nameOfCrimes = nameOfCrime;
		this.jail = jail;
	}
	public void Dog() {
		System.out.println(this.jail);
		System.out.println(this.nameOfCrimes);
		
		
	}

}
