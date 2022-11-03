package com.xworkz.association.encapsulation;

public class DcmotorType {
public Dcmotor dcmotor;
	
	public void funDcmotor(Dcmotor dcmotor) {

		System.out.println(dcmotor.getcolor());
		dcmotor.setcolor("blue");
		System.out.println("modified color"+dcmotor.getcolor());
		
		
		
		System.out.println(dcmotor.getvottage());
		dcmotor.setvottage(2.98);
		System.out.println("modified frequency"+dcmotor.getvottage());
		
		System.out.println(dcmotor.getprice());
		dcmotor.setprice(200);
		System.out.println("modified price"+dcmotor.getprice());
		
		System.out.println(dcmotor.getnice());
		dcmotor.setnice(true);
		System.out.println("modified nice"+dcmotor.getnice());
		
		System.out.println(dcmotor.gettype());
		dcmotor.settype("2dk");
		System.out.println("modified type"+dcmotor.gettype());
		

		System.out.println(dcmotor.getnetwork());
		dcmotor.setnetwork("13.0");
		System.out.println("modified network"+dcmotor.getnetwork());
		
		System.out.println(dcmotor.getcolor());
		dcmotor.setcolor("blue");
		System.out.println("modified color"+dcmotor.getcolor());
		
		System.out.println(dcmotor.getBrand());
		dcmotor.setBrand("tata");
		System.out.println("modified Brand"+dcmotor.getBrand());
		
		System.out.println(dcmotor.getcompany());
		dcmotor.setBrand("yee");
		System.out.println("modified bluetoothcompany"+dcmotor.getcompany());
		
		
		
		
		
		System.out.println(dcmotor.getpassword());
		dcmotor.setBrand("200uygd");
		System.out.println("modified password"+dcmotor.getpassword());
		

}
}
