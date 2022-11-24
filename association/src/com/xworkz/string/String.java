package com.xworkz.string;

import com.xworkz.equals.Paint;
import com.xworkz.equals.Vehical;
import com.xworkz.equals.WaterBottle;

public class String {
	
	boolean equals;
	Paint paint = new Paint();
	paint.setBrand("Asian_paint");
	paint.setColor("green");
	paint.setCompany("Asian2504");
	paint.setExDate("2022March");
	paint.setMfg("2021April");
	paint.setName("tryit");
	paint.setPrice(2400);
	paint.setQuality(true);
	paint.setQuantity("nice");
	paint.setType("color paint");
	System.out.println("=======================================");
	System.out.println(paint);
	Paint paint2 = new Paint("Nippon", "pink", "Nippon4567", "2023March", "2021April", "trynot", "colorpaint", 4400,
			"nice", false);
	System.out.println(paint2);
	boolean ref=paint2.equals(paint2);
	System.out.println(ref);

	System.out.println("------------------------------------------------------------------------------------");
	// instance of class vechile
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

	System.out.println("------------------------------------------------------------------------------------");
	// instance of waterbottel
	WaterBottle bottel = new WaterBottle();
	bottel.setBrand("kjhgfc");
	bottel.setCode('w');
	bottel.setLifeSpan(25);
	bottel.setName("kit");
	bottel.setPrice(65);
	bottel.setQuantity(22);
	bottel.setQuality(true);
	bottel.setHeight(200.3);
	bottel.setType("drinkings");
	System.out.println(bottel);

	WaterBottle bottel2 = new WaterBottle("energydrink", 56.3, 'h', 20, false, "bisleri", 40, "abc", 30);
	System.out.println(bottel2);
	boolean ref=bottel.equals(bottel2);
	System.out.println(ref);
	System.out.println("------------------------------------------------------------------------------------");
	Currency currency1 = new Currency("doller", "US", 50, '$', true, 81.71d, "paper",
			"Ecuador, El Salvador, Zimbabwe,..");
	currency1.setValue(10);
	currency1.setColour("brown");
	System.out.println(currency1);
	Currency currency2 = new Currency("doller", "US", 10, '$', true, 71.71d, "paper",
			"Ecuador, El Salvador, Zimbabwe,..");
	currency2.setValue(100);
	currency2.setColour("lavender");
	System.out.println(currency2);

	boolean same = currency1.equals(currency2);
	System.out.println(same);
	// instance of god
	System.out.println("------------------------------------------------------------------------------------");
	God god1 = new God("shiva", "parvathi", "kill evil", "nandi", "rudra", "kedarnath", "trisula", 2, "ladak",
			"ganesha");
	System.out.println(god1);
	God god2 = new God("shiva", "parvathi", "kill evil", "nandi", "rudra", "kashi", "trisula", 2, "kashi",
			"ganesha");
	System.out.println(god2);
	equals = god1.equals(god2);
	System.out.println(equals);
	System.out.println("------------------------------------------------------------------------------------");
	// instance of institution
	Institution inst1 = new Institution("xworkz", "omkar", 2018, "rajajinagar", "BTM", "akshara", "xworkz.com",
			9886971483l, 500, 5);
	System.out.println(inst1);
	Institution inst2 = new Institution("xworkz", "omkar", 2018, "rajajinagar", "BTM", "akshara", "xworkz.com",
			9886971483l, 500, 5);
	System.out.println(inst2);
	equals = inst1.equals(inst2);
	System.out.println(equals);
	// instance of hospital
	System.out.println("------------------------------------------------------------------------------------");
	Hospital hospital1 = new Hospital("appolo", "banglore", "dhanush", 10, 20, 5, 60, "appolo.com", 9449498848l);
	System.out.println(hospital1);
	Hospital hospital2 = new Hospital("appolo", "banglore", "dhanush", 10, 20, 5, 60, "appolo.com", 9449498848l);
	System.out.println(hospital2);
	equals = hospital1.equals(hospital2);
	System.out.println(equals);
	// instance of hospital
	System.out.println("------------------------------------------------------------------------------------");
	Lipstick lipstick1 = new Lipstick("l18", "pink", "peach", 1, 200, 4, true, "mate", 6);
	System.out.println(lipstick1);
	Lipstick lipstick2 = new Lipstick("l18", "pink", "peach", 1, 200, 4, true, "mate", 6);
	System.out.println(lipstick2);
	equals = lipstick1.equals(lipstick2);
	System.out.println(equals);

} 
	
			
	

}
