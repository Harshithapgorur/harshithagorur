package com.xworkz.rain;

public class PanCardImpl implements PanCard {
	private String[] numbers = new String[12];
	private int numberIndex = 0;

	@Override
	public boolean create(String number) {
		System.out.println("Running creating the pancard number");
		this.numbers[numberIndex] = number;
		this.numberIndex++;
		return false;
	}

}
