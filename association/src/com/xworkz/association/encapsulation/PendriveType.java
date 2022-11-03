package com.xworkz.association.encapsulation;

public class PendriveType {
public Pendrive pendrive;
	
	public void funPendrive(Pendrive pendrive) {

		System.out.println(pendrive.getcolor());
		pendrive.setcolor("blue");
		System.out.println("modified color"+pendrive.getcolor());
		
		
		
		System.out.println(pendrive.getfrequency());
		pendrive.setfrequency(2.98);
		System.out.println("modified frequency"+pendrive.getfrequency());
		
		System.out.println(pendrive.getprice());
		pendrive.setprice(200);
		System.out.println("modified price"+pendrive.getprice());
		
		System.out.println(pendrive.getnice());
		pendrive.setnice(true);
		System.out.println("modified nice"+pendrive.getnice());
		
		System.out.println(pendrive.gettype());
		pendrive.settype("2dk");
		System.out.println("modified type"+pendrive.gettype());
		

		System.out.println(pendrive.getnetwork());
		pendrive.setnetwork("13.0");
		System.out.println("modified network"+pendrive.getnetwork());
		
		System.out.println(pendrive.getcolor());
		pendrive.setcolor("blue");
		System.out.println("modified color"+pendrive.getcolor());
		
		System.out.println(pendrive.getBrand());
		pendrive.setBrand("tata");
		System.out.println("modified Brand"+pendrive.getBrand());
		
		System.out.println(pendrive.getcompany());
		pendrive.setBrand("yee");
		System.out.println("modified bluetoothcompany"+pendrive.getcompany());
		
		System.out.println(pendrive.getconnentedDevices());
		pendrive.setBrand("2");
		System.out.println("modified connentedDevices"+pendrive.getconnentedDevices());
		
		
		
		
		System.out.println(pendrive.getpassword());
		pendrive.setBrand("200uygd");
		System.out.println("modified password"+pendrive.getpassword());
		
	}

}
