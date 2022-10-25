package com.xworkz.java.programs.instanceMethod;

public class FlowerRunner {

	public static void main(String[] args) {
		
		Flower flower= new Flower();
		flower.setPrice(60);
		flower.quantity=50;
		flower.displayTotalPrice();
		flower.floweroff();
		
		
	}

}
