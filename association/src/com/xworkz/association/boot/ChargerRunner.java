package com.xworkz.association.boot;

import com.xworkz.association.encapsulation.Charger;
import com.xworkz.association.encapsulation.ChargerType;

public class ChargerRunner {

	public static void main(String[] args) {
		Charger charger=new Charger();
		ChargerType type=new ChargerType();
		
		System.out.println(charger.getcolor());
		
		System.out.println(charger.getfrequency());
		System.out.println(charger.getprice());
		System.out.println(charger.getnice());
		System.out.println(charger.gettype());
		System.out.println(charger.getnetwork());
		System.out.println(charger.getcolor());
		System.out.println(charger.getBrand());
		System.out.println(charger.getPhonecompany());
		System.out.println(charger.getconnentedDevices());
		
		System.out.println(charger.getpassword());
		type.funCharger(charger);
		
	}

	
}
