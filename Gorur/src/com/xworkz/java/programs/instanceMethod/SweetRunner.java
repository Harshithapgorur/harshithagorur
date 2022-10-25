package com.xworkz.java.programs.instanceMethod;
public class SweetRunner {

	public static void main(String[] args) {
		Sweet sweet = new Sweet("Jilebi");
		sweet.setPrice(60);
		sweet.quantity=50;
		sweet.displayTotalPrice();
		sweet.sweetoff();

	}

}
