package com.xworkz.association.encapsulation;

public class PhoneType {
public Phone phone;
	
	public void funPhone(Phone phone) {

		System.out.println(phone.getcolor());
		phone.setcolor("blue");
		System.out.println("modified color"+phone.getcolor());
		
		System.out.println(phone.getname());
		phone.setname("apple ");
		System.out.println("modified name"+phone.getname());
		
		
		System.out.println(phone.getfrequency());
		phone.setfrequency(2.98);
		System.out.println("modified frequency"+phone.getfrequency());
		
		System.out.println(phone.getprice());
		phone.setprice(200);
		System.out.println("modified price"+phone.getprice());
		
		System.out.println(phone.getnice());
		phone.setnice(true);
		System.out.println("modified nice"+phone.getnice());
		
		System.out.println(phone.gettype());
		phone.settype("2dk");
		System.out.println("modified type"+phone.gettype());
		

		System.out.println(phone.getnetwork());
		phone.setnetwork("13.0");
		System.out.println("modified network"+phone.getnetwork());
		
		System.out.println(phone.getcolor());
		phone.setcolor("blue");
		System.out.println("modified color"+phone.getcolor());
		
		System.out.println(phone.getBrand());
		phone.setBrand("tata");
		System.out.println("modified Brand"+phone.getBrand());
		
		System.out.println(phone.getPhonecompany());
		phone.setBrand("yee");
		System.out.println("modified bluetoothcompany"+phone.getPhonecompany());
		
		System.out.println(phone.getconnentedDevices());
		phone.setBrand("2");
		System.out.println("modified connentedDevices"+phone.getconnentedDevices());
		
		
		System.out.println(phone.getownersNumbers());
		phone.setownersNumbers(20056);
		System.out.println("modified ownersNumbers"+phone.getownersNumbers());
		
		System.out.println(phone.getpassword());
		phone.setBrand("200uygd");
		System.out.println("modified password"+phone.getpassword());
		
	}

}
