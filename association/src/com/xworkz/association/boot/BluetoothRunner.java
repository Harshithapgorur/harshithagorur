package com.xworkz.association.boot;

import com.xworkz.association.encapsulation.Bluetooth;
import com.xworkz.association.encapsulation.BluetoothType;

public class BluetoothRunner {

	public static void main(String[] args) {
		
		Bluetooth bluetooth=new Bluetooth();
		BluetoothType type=new BluetoothType();
		
		System.out.println(bluetooth.getcolor());
		System.out.println(bluetooth.getname());
		System.out.println(bluetooth.getfrequency());
		System.out.println(bluetooth.getprice());
		System.out.println(bluetooth.getnice());
		System.out.println(bluetooth.gettype());
		System.out.println(bluetooth.getnetwork());
		System.out.println(bluetooth.getcolor());
		System.out.println(bluetooth.getBrand());
		System.out.println(bluetooth.getbluetoothcompany());
		System.out.println(bluetooth.getconnentedDevices());
		System.out.println(bluetooth.getownersNumbers());
		System.out.println(bluetooth.getpassword());
		type.funBluetooth(bluetooth);
	}

}
