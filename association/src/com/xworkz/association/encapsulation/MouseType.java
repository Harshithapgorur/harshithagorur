package com.xworkz.association.encapsulation;

public class MouseType {
public Mouse mouse;
	
	public void funmouse(Mouse mouse) {

		System.out.println(mouse.getcolor());
		mouse.setcolor("blue");
		System.out.println("modified color"+mouse.getcolor());
		
		
		
		System.out.println(mouse.getfrequency());
		mouse.setfrequency(2.98);
		System.out.println("modified frequency"+mouse.getfrequency());
		
		System.out.println(mouse.getprice());
		mouse.setprice(200);
		System.out.println("modified price"+mouse.getprice());
		
		System.out.println(mouse.getnice());
		mouse.setnice(true);
		System.out.println("modified nice"+mouse.getnice());
		
		System.out.println(mouse.gettype());
		mouse.settype("2dk");
		System.out.println("modified type"+mouse.gettype());
		

		System.out.println(mouse.getnetwork());
		mouse.setnetwork("13.0");
		System.out.println("modified network"+mouse.getnetwork());
		
		System.out.println(mouse.getcolor());
		mouse.setcolor("blue");
		System.out.println("modified color"+mouse.getcolor());
		
		System.out.println(mouse.getBrand());
		mouse.setBrand("tata");
		System.out.println("modified Brand"+mouse.getBrand());
		
		System.out.println(mouse.getcompany());
		mouse.setBrand("yee");
		System.out.println("modified bluetoothcompany"+mouse.getcompany());
		
		System.out.println(mouse.getconnentedDevices());
		mouse.setBrand("2");
		System.out.println("modified connentedDevices"+mouse.getconnentedDevices());
		
		
		
		
		System.out.println(mouse.getpassword());
		mouse.setBrand("200uygd");
		System.out.println("modified password"+mouse.getpassword());
		
	}


}



