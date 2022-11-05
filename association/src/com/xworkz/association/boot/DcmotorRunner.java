package com.xworkz.association.boot;

import com.xworkz.association.encapsulation.Dcmotor;
import com.xworkz.association.encapsulation.DcmotorType;


public class DcmotorRunner {

	public static void main(String[] args) {
		Dcmotor dcmotor=new Dcmotor();
		DcmotorType type=new DcmotorType();
		
		System.out.println(dcmotor.getcolor());
		
		System.out.println(dcmotor.getvottage());
		System.out.println(dcmotor.getprice());
		System.out.println(dcmotor.getnice());
		System.out.println(dcmotor.gettype());
		System.out.println(dcmotor.getnetwork());
		System.out.println(dcmotor.getcolor());
		System.out.println(dcmotor.getBrand());
		System.out.println(dcmotor.getpassword());
		type.funDcmotor(dcmotor);


	}

}
