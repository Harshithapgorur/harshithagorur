package com.xworkz.equals;

public class CurrencyRunner {

	public static void main(String[] args) {
		Currency currency = new Currency();
		currency.setName("tryit");
		currency.setType("color paint");
		currency.setCode("Asian_paint");
		currency.setGood(true);
		currency.setMakeingcost(24000);
		currency.setMeterials("2022March");
		currency.setPowerfull("2022March");
		currency.setValidity("valu");
		System.out.println(currency);
		System.out.println("=======================================");

		Currency currency2 = new Currency("tyrjedhf","tyrhf","tyut","trfdh","haes",false,45677,"tgbcn") ;
		System.out.println(currency2);
		boolean ref=currency2.equals(currency2);
		System.out.println(ref);
		
	}
}

	
		

	


