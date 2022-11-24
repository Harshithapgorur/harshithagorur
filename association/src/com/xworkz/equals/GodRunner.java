package com.xworkz.equals;

public class GodRunner {

	public static void main(String[] args) {
	
		God god = new God();
		god.setName("tryit");
		god.setType("color paint");
		god.setBrand("Asian_paint");
		god.setGender("female");
		god.setLamp(true);
		god.setLocation("2022March");
		god.setPugariiName("2022March");
		god.setPinNumber(573120);
		System.out.println(god);
		System.out.println("=======================================");

		God god2 = new God("kjhgfdx","iuyh","uytg","yuyh",null, 766669,false,"point","male");
		System.out.println(god2);
		boolean ref=god2.equals(god2);
		System.out.println(ref);
		
	}
	}


