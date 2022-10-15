package com.xworkz.copy.boot;

public class BreadRunner {

	public static void main(String[] args) {
		
Bread bread =new Bread();

System.out.println( bread.type1);
System.out.println( bread.shape);
System.out.println( bread.price);
System.out.println( bread.quantity);
System.out.println( bread.CompanyName);
bread.type1="SOFT ROLLS";
bread.shape="box";
System.out.println( bread.type1);
System.out.println( bread.shape);
System.out.println( bread.price);
System.out.println( bread.quantity);
System.out.println( bread.CompanyName);

bread.price=25;
bread.quantity=250;
System.out.println( bread.type1);
System.out.println( bread.shape);
System.out.println( bread.price);
System.out.println( bread.quantity);
System.out.println( bread.CompanyName);

bread.CompanyName="foody";
System.out.println( bread.type1);
System.out.println( bread.shape);
System.out.println( bread.price);
System.out.println( bread.quantity);
System.out.println( bread.CompanyName);

bread.type1="mint";
bread.shape="shape less";
bread.price=254;
System.out.println( bread.type1);
System.out.println( bread.shape);
System.out.println( bread.price);
System.out.println( bread.quantity);
System.out.println( bread.CompanyName);

}
}