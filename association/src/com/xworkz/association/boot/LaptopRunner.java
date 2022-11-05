package com.xworkz.association.boot;

import com.xworkz.association.encapsulation.Laptop;
import com.xworkz.association.encapsulation.LaptopType;

public class LaptopRunner {

	public static void main(String[] args) {
		LaptopType  type =new LaptopType();
		Laptop laptop=new Laptop();
		
		System.out.println(laptop.getcolor());
		System.out.println(laptop.getname());
		System.out.println(laptop.getlaptopcompany());
		System.out.println(laptop.getname());
		System.out.println(laptop.getnice());
		System.out.println(laptop.getownerNames());
		System.out.println(laptop.ownersNumbers);
		System.out.println(laptop.getprice());
		System.out.println(laptop.ram);
		System.out.println(laptop.getsource());
		System.out.println(laptop.getBrand());
		System.out.println(System.lineSeparator());
		type.funyLaptop(laptop);

	}

}
