package com.xworkz.java.programs.instanceMethod;

public class ShirtBrandRunner {

	public static void main(String[] args) {
		ShirtBrand shirtBrand = new ShirtBrand("BlackberryShirt");
		shirtBrand.size("L");
		shirtBrand.price=500;
		shirtBrand.quality=true;
		shirtBrand.ShirtBrandfun();
		
	}

}
