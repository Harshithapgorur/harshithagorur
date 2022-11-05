package com.xworkz.association.boot;

import com.xworkz.association.encapsulation.Mouse;
import com.xworkz.association.encapsulation.MouseType;

public class MouseRunner {

	public static void main(String[] args) {
		Mouse mouse=new Mouse();
		MouseType type=new MouseType();
		
		System.out.println(mouse.getcolor());
		
		System.out.println(mouse.getfrequency());
		System.out.println(mouse.getprice());
		System.out.println(mouse.getnice());
		System.out.println(mouse.gettype());
		System.out.println(mouse.getnetwork());
		System.out.println(mouse.getcolor());
		System.out.println(mouse.getBrand());
		
		System.out.println(mouse.getconnentedDevices());
		
		System.out.println(mouse.getpassword());
		type.funmouse(mouse);

	}

}
