package com.xworkz.inheritance.subclass;

import com.xworkz.inheritance.Catering;

public class CateringType  extends Catering {

	public CateringType(String serviceType, int noOfStrength, String foodName) {
		super(serviceType, noOfStrength, foodName);
		
		
		CateringType subcatering =new CateringType("buffet",24,"dontno") ;
		
	}
	
}
