package com.xworkz.java.programs.instanceMethod;

import com.xworkz.java.gorur.constent.Flowercolor;

public class Flower {
	
public  static String flowerName="Dahlia";//block
public double price;//method
public boolean quality;
public double quantity;//ref
public Flowercolor flowercolor=Flowercolor.DARK_PINK_DAHLIAS;

public void displayTotalPrice() {
	double total=quantity* this.price;
	System.out.println("total price of Sweet is "+total);
	
	
	
	
}

public void setPrice(double price) {
	this.price=price;
	
}
public void floweroff() {
	System.out.println(Flower.flowerName);
	System.out.println(this.price);
	System.out.println(this.quality);
	System.out.println(this.quantity);
	System.out.println(this.flowercolor);
}


}
