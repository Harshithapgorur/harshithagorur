package com.xworkz.inheritance;

public class City extends Capital {
	public void cityMethod() {
		System.out.println("City is a child of capital,capital is a child of place,place is a child of object,object is the parent of class");
		System.out.println("----------------------");
		Object object =new Object();
		Place place= new Place();
		Object place2= new Place();
		Capital capital=new Capital();
		
		Capital place3=new Capital();
		Object capital2=new Capital();
		City city=new City();
		
		Object city2=new City();
		Capital city3=new City();
		Place city4=new City();
		
		
		
		
		
	}

}
