package com.xworkz.association.boot;

import com.xworkz.association.encapsulation.Pendrive;
import com.xworkz.association.encapsulation.PendriveType;

public class PendriveRunner {

	

		public static void main(String[] args) {
			 Pendrive  pendrive=new  Pendrive();
			 PendriveType type=new  PendriveType();
			
			System.out.println(pendrive.getcolor());
			
			System.out.println(pendrive.getfrequency());
			System.out.println(pendrive.getprice());
			System.out.println(pendrive.getnice());
			System.out.println(pendrive.gettype());
			System.out.println(pendrive.getnetwork());
			System.out.println(pendrive.getcolor());
			System.out.println(pendrive.getBrand());
			
			System.out.println(pendrive.getconnentedDevices());
			
			System.out.println(pendrive.getpassword());
			type.funPendrive(pendrive);

}
}