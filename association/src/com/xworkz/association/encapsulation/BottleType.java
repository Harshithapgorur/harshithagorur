package com.xworkz.association.encapsulation;

public class BottleType {
public Bottle bottle;
	
	public void funbottle(Bottle bottle) {

		System.out.println(bottle.getcolor());
		bottle.setcolor("blue");
		System.out.println("modified color"+bottle.getcolor());
		
		
		
		System.out.println(bottle.getfrequency());
		bottle.setfrequency(2.98);
		System.out.println("modified frequency"+bottle.getfrequency());
		
		System.out.println(bottle.getprice());
		bottle.setprice(200);
		System.out.println("modified price"+bottle.getprice());
		
		System.out.println(bottle.getnice());
		bottle.setnice(true);
		System.out.println("modified nice"+bottle.getnice());
		
		System.out.println(bottle.gettype());
		bottle.settype("2dk");
		System.out.println("modified type"+bottle.gettype());
		

		System.out.println(bottle.getnetwork());
		bottle.setnetwork("13.0");
		System.out.println("modified network"+bottle.getnetwork());
		
		System.out.println(bottle.getcolor());
		bottle.setcolor("blue");
		System.out.println("modified color"+bottle.getcolor());
		
		System.out.println(bottle.getBrand());
		bottle.setBrand("tata");
		System.out.println("modified Brand"+bottle.getBrand());
		
		System.out.println(bottle.getcompany());
		bottle.setBrand("yee");
		System.out.println("modified bluetoothcompany"+bottle.getcompany());
		
		System.out.println(bottle.getconnentedDevices());
		bottle.setBrand("2");
		System.out.println("modified connentedDevices"+bottle.getconnentedDevices());
		
		
		
		
		System.out.println(bottle.getpassword());
		bottle.setBrand("200uygd");
		System.out.println("modified password"+bottle.getpassword());
		
	}


}
