package com.xworkz.association.boot;

import com.xworkz.association.encapsulation.Bag;
import com.xworkz.association.encapsulation.BagType;

public class BagRunner {

	public static void main(String[] args) {
		Bag bag=new Bag();
		BagType type=new BagType();
		
		System.out.println(bag.getcolor());
		System.out.println(bag.getname());
		
		System.out.println(bag.getprice());
		System.out.println(bag.getnice());
		System.out.println(bag.gettype());
	
		System.out.println(bag.getcolor());
		System.out.println(bag.getBrand());
		System.out.println(bag.getbagcompany());
		System.out.println(bag.getconnentedDevices());
		System.out.println(bag.getownersNumbers());
		System.out.println(bag.getpassword());
		type.funBag(bag);
	}

}
