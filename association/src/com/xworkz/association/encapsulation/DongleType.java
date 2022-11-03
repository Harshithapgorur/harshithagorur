package com.xworkz.association.encapsulation;

public class DongleType {
public Dongle dongle;
	
	public void funDongle(Dongle dongle) {

		System.out.println(dongle.getcolor());
		dongle.setcolor("blue");
		System.out.println("modified color"+dongle.getcolor());
		
		
		
		System.out.println(dongle.getfrequency());
		dongle.setfrequency(2.98);
		System.out.println("modified frequency"+dongle.getfrequency());
		
		System.out.println(dongle.getprice());
		dongle.setprice(200);
		System.out.println("modified price"+dongle.getprice());
		
		System.out.println(dongle.getnice());
		dongle.setnice(true);
		System.out.println("modified nice"+dongle.getnice());
		
		System.out.println(dongle.gettype());
		dongle.settype("2dk");
		System.out.println("modified type"+dongle.gettype());
		

		System.out.println(dongle.getnetwork());
		dongle.setnetwork("13.0");
		System.out.println("modified network"+dongle.getnetwork());
		
		System.out.println(dongle.getcolor());
		dongle.setcolor("blue");
		System.out.println("modified color"+dongle.getcolor());
		
		System.out.println(dongle.getBrand());
		dongle.setBrand("tata");
		System.out.println("modified Brand"+dongle.getBrand());
		
		System.out.println(dongle.getcompany());
		dongle.setBrand("yee");
		System.out.println("modified bluetoothcompany"+dongle.getcompany());
		
		System.out.println(dongle.getconnentedDevices());
		dongle.setBrand("2");
		System.out.println("modified connentedDevices"+dongle.getconnentedDevices());
		
		
		
		
		System.out.println(dongle.getpassword());
		dongle.setBrand("200uygd");
		System.out.println("modified password"+dongle.getpassword());
		
	}


}
