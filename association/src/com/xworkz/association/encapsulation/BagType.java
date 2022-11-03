package com.xworkz.association.encapsulation;

public class BagType {
public Bag bag;
	
	public void funBag( Bag bag) {

		System.out.println(bag.getcolor());
		bag.setcolor("blue");
		System.out.println("modified color"+bag.getcolor());
		
		System.out.println(bag.getname());
		bag.setname("apple ");
		System.out.println("modified name"+bag.getname());
		
		System.out.println(bag.getprice());
		bag.setprice(200);
		System.out.println("modified price"+bag.getprice());
		
		System.out.println(bag.getnice());
		bag.setnice(true);
		System.out.println("modified nice"+bag.getnice());
		
		System.out.println(bag.gettype());
		bag.settype("2dk");
		System.out.println("modified type"+bag.gettype());
		
		System.out.println(bag.getcolor());
		bag.setcolor("blue");
		System.out.println("modified color"+bag.getcolor());
		
		System.out.println(bag.getBrand());
		bag.setBrand("tata");
		System.out.println("modified Brand"+bag.getBrand());
		
}
}