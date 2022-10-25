package com.xworkz.java.programs.instanceMethod;

import com.xworkz.java.programs.constent.ShirtType;

public class ShirtBrand {
	public static String brand="ArrowShirt";//block
	public String size;//const
	public double price;//method
	public ShirtType shirtType=ShirtType.COLLAR;//literal
	public  boolean quality;//ref

	public ShirtBrand(String size) {
		this.size=size;
}
	public  void setPrice(double price) {
		this.price=price;
	}
		
		public void ShirtBrandfun() {
			System.out.println(this.size);
			System.out.println(this.price);
			System.out.println(this.shirtType);
			System.out.println(this.quality);
			System.out.println(ShirtBrand.brand);
			
		
}
		public void size(String size) {
			this.size=size;
			
			
		}
		
}