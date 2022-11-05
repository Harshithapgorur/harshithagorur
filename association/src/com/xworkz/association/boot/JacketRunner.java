package com.xworkz.association.boot;

import com.xworkz.association.encapsulation.Jacket;
import com.xworkz.association.encapsulation.JacketTYpe;

public class JacketRunner {
	public static void main(String[] args) {
		Jacket jacket=new Jacket();
		JacketTYpe type=new JacketTYpe();
		
		System.out.println(jacket.getcolor());
		
		System.out.println(jacket.getprice());
		System.out.println(jacket.getnice());
		System.out.println(jacket.gettype());
		
		System.out.println(jacket.getcolor());
		System.out.println(jacket.getBrand());
		
		System.out.println(jacket.getconnentedDevices());
		
		System.out.println(jacket.getpassword());
		type.funjacket(jacket);
	}


}
