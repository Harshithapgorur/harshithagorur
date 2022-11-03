package com.xworkz.association.encapsulation;

public class KeyboardType {
public Keyboard keyboard;
	
	public void funKeyboard(Keyboard keyboard) {

		System.out.println(keyboard.getcolor());
		keyboard.setcolor("blue");
		System.out.println("modified color"+keyboard.getcolor());
		
		
		
		System.out.println(keyboard.getfrequency());
		keyboard.setfrequency(2.98);
		System.out.println("modified frequency"+keyboard.getfrequency());
		
		System.out.println(keyboard.getprice());
		keyboard.setprice(200);
		System.out.println("modified price"+keyboard.getprice());
		
		System.out.println(keyboard.getnice());
		keyboard.setnice(true);
		System.out.println("modified nice"+keyboard.getnice());
		
		System.out.println(keyboard.gettype());
		keyboard.settype("2dk");
		System.out.println("modified type"+keyboard.gettype());
		

		System.out.println(keyboard.getnetwork());
		keyboard.setnetwork("13.0");
		System.out.println("modified network"+keyboard.getnetwork());
		
		System.out.println(keyboard.getcolor());
		keyboard.setcolor("blue");
		System.out.println("modified color"+keyboard.getcolor());
		
		System.out.println(keyboard.getBrand());
		keyboard.setBrand("tata");
		System.out.println("modified Brand"+keyboard.getBrand());
		
		System.out.println(keyboard.getcompany());
		keyboard.setBrand("yee");
		System.out.println("modified bluetoothcompany"+keyboard.getcompany());
		
		System.out.println(keyboard.getconnentedDevices());
		keyboard.setBrand("2");
		System.out.println("modified connentedDevices"+keyboard.getconnentedDevices());
		
		
		
		
		System.out.println(keyboard.getpassword());
		keyboard.setBrand("200uygd");
		System.out.println("modified password"+keyboard.getpassword());
		
	}



}
