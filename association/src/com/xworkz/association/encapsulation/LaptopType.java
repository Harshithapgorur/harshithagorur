package com.xworkz.association.encapsulation;

public class LaptopType {

	public Laptop laptop;
	
	public void funyLaptop(Laptop laptop) {

		System.out.println(laptop.getcolor());
		laptop.setcolor("blue");
		System.out.println("modified color"+laptop.getcolor());
		
		System.out.println(laptop.getip());
		laptop.setcolor("09876");
			System.out.println(laptop.getip());
			
			System.out.println(laptop.getlaptopcompany());
			laptop.setlaptopcompany("lenovo");
		System.out.println(laptop.getlaptopcompany());
		
		System.out.println(laptop.getname());
		laptop.setname("lenova120");
		System.out.println(laptop.getname());
		
		System.out.println(laptop.getname());
		laptop.setname("mp");
		System.out.println(laptop.getname());
		
		System.out.println(laptop.getprice());
		laptop.setprice(87654);
		System.out.println(laptop.getprice());
		
		System.out.println(laptop.getip());
		laptop.setip(8);
		System.out.println(laptop.getip());
		
		System.out.println(laptop.getsource());
		laptop.setsource("mouse");
		System.out.println(laptop.getsource());
		
		System.out.println(laptop.getBrand());
		laptop.setBrand("Lanovo");
		System.out.println("after modifying:"+laptop.getBrand());
		
		
	}

}
