
package com.xworkz.association.encapsulation;

public class BluetoothType {
	
public Bluetooth bluetooth;
	
	public void funBluetooth(Bluetooth bluetooth) {

		System.out.println(bluetooth.getcolor());
		 bluetooth.setcolor("blue");
		System.out.println("modified color"+bluetooth.getcolor());
		
		System.out.println(bluetooth.getname());
		bluetooth.setname("apple ");
		System.out.println("modified name"+bluetooth.getname());
		
		
		System.out.println(bluetooth.getfrequency());
		bluetooth.setfrequency(2.98);
		System.out.println("modified frequency"+bluetooth.getfrequency());
		
		System.out.println(bluetooth.getprice());
		bluetooth.setprice(200);
		System.out.println("modified price"+bluetooth.getprice());
		
		System.out.println(bluetooth.getnice());
		bluetooth.setnice(true);
		System.out.println("modified nice"+bluetooth.getnice());
		
		System.out.println(bluetooth.gettype());
		bluetooth.settype("2dk");
		System.out.println("modified type"+bluetooth.gettype());
		

		System.out.println(bluetooth.getnetwork());
		bluetooth.setnetwork("13.0");
		System.out.println("modified network"+bluetooth.getnetwork());
		
		System.out.println(bluetooth.getcolor());
		bluetooth.setcolor("blue");
		System.out.println("modified color"+bluetooth.getcolor());
		
		System.out.println(bluetooth.getBrand());
		bluetooth.setBrand("tata");
		System.out.println("modified Brand"+bluetooth.getBrand());
		
		System.out.println(bluetooth.getbluetoothcompany());
		bluetooth.setBrand("yee");
		System.out.println("modified bluetoothcompany"+bluetooth.getbluetoothcompany());
		
		System.out.println(bluetooth.getconnentedDevices());
		bluetooth.setBrand("2");
		System.out.println("modified connentedDevices"+bluetooth.getconnentedDevices());
		
		
		System.out.println(bluetooth.getownersNumbers());
		bluetooth.setownersNumbers(20056);
		System.out.println("modified ownersNumbers"+bluetooth.getownersNumbers());
		
		System.out.println(bluetooth.getpassword());
		bluetooth.setBrand("200uygd");
		System.out.println("modified password"+bluetooth.getpassword());
		
	}
}
