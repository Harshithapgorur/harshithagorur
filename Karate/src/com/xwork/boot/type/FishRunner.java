package com.xwork.boot.type;

public class FishRunner {

	public static void main(String[] args) {
		
			Fish Fish1 =new Fish();//const, inta
			System.out.println(Fish1.name);
			System.out.println(Fish1.price);
			System.out.println(Fish1.type);
			System.out.println(Fish1.weight);
			System.out.println(Fish1.length);
			
		
			Fish1.name="star Fish";
			Fish1.price=100;
			System.out.println(Fish1.name);
			System.out.println(Fish1.price);
			System.out.println(Fish1.type);
			System.out.println(Fish1.weight);
			System.out.println(Fish1.length);
			

			Fish1.type="gold fish";
			Fish1.weight=5;
			System.out.println(Fish1.name);
			System.out.println(Fish1.price);
			System.out.println(Fish1.type);
			System.out.println(Fish1.weight);
			System.out.println(Fish1.length);
			
			Fish1.length=10;
			Fish1.weight=5;
			System.out.println(Fish1.name);
			System.out.println(Fish1.price);
			System.out.println(Fish1.type);
			System.out.println(Fish1.weight);
			System.out.println(Fish1.length);
			
		
		
		
		
		

	}

}
