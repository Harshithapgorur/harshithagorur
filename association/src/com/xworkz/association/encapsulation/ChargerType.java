package com.xworkz.association.encapsulation;

public class ChargerType {
public  Charger  charger;
	
	public void funCharger( Charger  charger) {

		System.out.println( charger.getcolor());
		charger.setcolor("blue");
		System.out.println("modified color"+ charger.getcolor());
		
		
		System.out.println(charger.getfrequency());
		charger.setfrequency(2.98);
		System.out.println("modified frequency"+charger.getfrequency());
		
		System.out.println(charger.getprice());
		charger.setprice(200);
		System.out.println("modified price"+charger.getprice());
		
		System.out.println(charger.getnice());
		charger.setnice(true);
		System.out.println("modified nice"+charger.getnice());
		
		System.out.println(charger.gettype());
		charger.settype("2dk");
		System.out.println("modified type"+charger.gettype());
		

		System.out.println(charger.getnetwork());
		charger.setnetwork("13.0");
		System.out.println("modified network"+charger.getnetwork());
		
		System.out.println(charger.getcolor());
		charger.setcolor("blue");
		System.out.println("modified color"+charger.getcolor());
		
		System.out.println(charger.getBrand());
		charger.setBrand("tata");
		System.out.println("modified Brand"+charger.getBrand());
		
		System.out.println(charger.getPhonecompany());
		charger.setBrand("yee");
		System.out.println("modified bluetoothcompany"+charger.getPhonecompany());
		
		System.out.println(charger.getconnentedDevices());
		charger.setBrand("2");
		System.out.println("modified connentedDevices"+charger.getconnentedDevices());
		
		
		System.out.println(charger.getpassword());
		charger.setBrand("200uygd");
		System.out.println("modified password"+charger.getpassword());
		
	}


}
