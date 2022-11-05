package com.xworkz.association.boot;

import com.xworkz.association.encapsulation.Dongle;
import com.xworkz.association.encapsulation.DongleType;

public class DongleRunner {
	public static void main(String[] args) {
		Dongle dongle=new Dongle();
		DongleType type=new DongleType();
		
		System.out.println(dongle.getcolor());
		
		System.out.println(dongle.getfrequency());
		System.out.println(dongle.getprice());
		System.out.println(dongle.getnice());
		System.out.println(dongle.gettype());
		System.out.println(dongle.getnetwork());
		System.out.println(dongle.getcolor());
		System.out.println(dongle.getBrand());
		
		System.out.println(dongle.getconnentedDevices());
		
		System.out.println(dongle.getpassword());
		type.funDongle(dongle);

}
}
