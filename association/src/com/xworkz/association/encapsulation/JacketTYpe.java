package com.xworkz.association.encapsulation;

public class JacketTYpe {
public Jacket jacket;
	
	public void funjacket(Jacket jacket) {

		System.out.println(jacket.getcolor());
		jacket.setcolor("blue");
		System.out.println("modified color"+jacket.getcolor());
		
		
		
		
		System.out.println(jacket.getprice());
		jacket.setprice(200);
		System.out.println("modified price"+jacket.getprice());
		
		System.out.println(jacket.getnice());
		jacket.setnice(true);
		System.out.println("modified nice"+jacket.getnice());
		
		System.out.println(jacket.gettype());
		jacket.settype("2dk");
		System.out.println("modified type"+jacket.gettype());
		

		System.out.println(jacket.getcolor());
		jacket.setcolor("blue");
		System.out.println("modified color"+jacket.getcolor());
		
		System.out.println(jacket.getBrand());
		jacket.setBrand("tata");
		System.out.println("modified Brand"+jacket.getBrand());
		
		System.out.println(jacket.getJacketcompany());
		jacket.setBrand("yee");
		System.out.println("modified bluetoothcompany"+jacket.getJacketcompany());
		
		System.out.println(jacket.getconnentedDevices());
		jacket.setBrand("2");
		System.out.println("modified connentedDevices"+jacket.getconnentedDevices());
		
		
		
		
		System.out.println(jacket.getpassword());
		jacket.setBrand("200uygd");
		System.out.println("modified password"+jacket.getpassword());
		
	}
}
