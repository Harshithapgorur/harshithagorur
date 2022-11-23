package com.xworkz.equals;

public class WaterBottleRunner {
	public static void main(String[] args) {
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



	}

}
