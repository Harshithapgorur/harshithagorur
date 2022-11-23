package com.xworkz.equals;

public class VehicalRunner {

	public static void main(String[] args) {
		 Vehical  vehical = new  Vehical();
		 vehical.setBrand("Asian_paint");
		 vehical.setColor("green");
		 vehical.setCompany("Asian2504");
		 vehical.setExDate("2022March");
		 vehical.setMfg("2021April");
		 vehical.setName("tryit");
		 vehical.setPrice(2400);
		 vehical.setQuality(true);
		 vehical.setQuantity("nice");
		 vehical.setType("color paint");
		System.out.println("=======================================");

		Vehical vehical2 = new Vehical("Nippon", "pink", "Nippon4567", "2023March", "2021April", "trynot", "colorpaint", 4400,
				"nice", false);
		System.out.println(vehical2);
		boolean ref=vehical2.equals(vehical2);
		System.out.println(ref);

	}


	}


