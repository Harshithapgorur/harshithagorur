package com.xworkz.association.boot;

import com.xworkz.association.encapsulation.Keyboard;
import com.xworkz.association.encapsulation.KeyboardType;

public class KayboardRunner {

	public static void main(String[] args) {
		Keyboard kayboard=new Keyboard();
		KeyboardType type=new KeyboardType();
		
		System.out.println(kayboard.getcolor());
		
		System.out.println(kayboard.getfrequency());
		System.out.println(kayboard.getprice());
		System.out.println(kayboard.getnice());
		System.out.println(kayboard.gettype());
		System.out.println(kayboard.getnetwork());
		System.out.println(kayboard.getcolor());
		System.out.println(kayboard.getBrand());
		
		System.out.println(kayboard.getconnentedDevices());
		
		System.out.println(kayboard.getpassword());
		type.funKeyboard(kayboard);

	}

}
