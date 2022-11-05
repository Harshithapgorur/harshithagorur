package com.xworkz.association.boot;

import com.xworkz.association.encapsulation.Bottle;
import com.xworkz.association.encapsulation.BottleType;

public class BottleRunner {

	public static void main(String[] args) {
		Bottle bottle=new Bottle();
		BottleType type=new BottleType();
		
		System.out.println(bottle.getcolor());
		
		System.out.println(bottle.getfrequency());
		System.out.println(bottle.getprice());
		System.out.println(bottle.getnice());
		System.out.println(bottle.gettype());
		System.out.println(bottle.getnetwork());
		System.out.println(bottle.getcolor());
		System.out.println(bottle.getBrand());
		
		System.out.println(bottle.getconnentedDevices());
		
		System.out.println(bottle.getpassword());
		type.funbottle(bottle);
	}

	}

