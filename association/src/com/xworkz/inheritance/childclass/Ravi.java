package com.xworkz.inheritance.childclass;

import com.xworkz.inheritance.overclass.Criminal;

public class Ravi extends Criminal{
	public double firNumber;
	public Ravi(String nameOfCrime, boolean jail, double firNumber) {
		super(nameOfCrime, jail);
		this.firNumber=firNumber;
		
	}
	public void Dog() {
		super.Dog();
		
		System.out.println(this.firNumber);
		
		
	}


	
	

}
