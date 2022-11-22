package com.xworkz.equals;

public class PaintRunner {

	public static void main(String[] args) {
		
		Paint paint =new  Paint();
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
		
		Paint paint2= new Paint("Nippon", "pink", "Nippon4567", "2023March", "2021April", "trynot", "colorpaint", 4400, "nice", false);
		
	
		
		

	}

}
