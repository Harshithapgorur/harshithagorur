package com.xworkz.java.programs.instanceMethod;

import com.xworkz.java.gorur.constent.MilkType;

public class Milk {
	public static String brand=" Nandini";//block
	public String variantsOfMilk;//const
	public double price;//method
	public MilkType milkType=MilkType.NADINI_GOOD_LIFE;//literal
	public  double quantity;//ref

	public Milk(String variantsOfMilk) {
		this.variantsOfMilk=variantsOfMilk;
}
	public  void setPrice(double price) {
		this.price=price;
		
}
	public void Milkq() {
		System.out.println(Milk.brand);
	System.out.println(this.variantsOfMilk);
	System.out.println(this.price);
	System.out.println(this.milkType);
	System.out.println(this.quantity);
	
	
	}
	

}


