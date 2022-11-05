package com.xworkz.association.boot;

import com.xworkz.association.encapsulation.WashingMachine;
import com.xworkz.association.encapsulation.WashingMachineType;

public class WashingMachineRunner {

	public static void main(String[] args) {
		WashingMachine washingMachine=new WashingMachine();
		WashingMachineType type=new WashingMachineType();
		
		System.out.println(washingMachine.getcolor());
		System.out.println(washingMachine.name);
		System.out.println(washingMachine.getfrequency());
		System.out.println(washingMachine.getprice());
		System.out.println(washingMachine.getnice());
		System.out.println(washingMachine.gettype());
		System.out.println(washingMachine.getvottage());
		System.out.println(washingMachine.getcolor());
		System.out.println(washingMachine.getBrand());
		
		System.out.println(washingMachine.getconnentedDevices());
		System.out.println(washingMachine. getwashingMachinecompany());
		System.out.println(washingMachine.getpassword());
		type.funWashingMachineType(washingMachine);
	}

	}


