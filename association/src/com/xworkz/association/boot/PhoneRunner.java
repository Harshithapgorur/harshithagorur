package com.xworkz.association.boot;


import com.xworkz.association.encapsulation.Phone;
import com.xworkz.association.encapsulation.PhoneType;

public class PhoneRunner {

	public static void main(String[] args) {
		Phone phone=new Phone();
		PhoneType type=new PhoneType();
		
		System.out.println(phone.getcolor());
		System.out.println(phone.getname());
		System.out.println(phone.getfrequency());
		System.out.println(phone.getprice());
		System.out.println(phone.getnice());
		System.out.println(phone.gettype());
		System.out.println(phone.getnetwork());
		System.out.println(phone.getcolor());
		System.out.println(phone.getBrand());
		System.out.println(phone.getPhonecompany());
		System.out.println(phone.getconnentedDevices());
		System.out.println(phone.getownersNumbers());
		System.out.println(phone.getpassword());
		type.funPhone(phone);
	}




	}


