package com.xworkz.inheritance;

public class SiliconCity extends MetroCity {
	public void SiliconCityMethod() {
		System.out.println(" siliconCity is a child of metro city, metro city is a child of city,city is a child of capital,"
				+ "capital is a child of place,place is a child of object and object is the parent");
		System.out.println("############");
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
		
		
		MetroCity metroCity=new MetroCity();
		City metroCity2= new MetroCity();
		Capital metroCity3=new MetroCity();
		Place metroCity4=new MetroCity();
         Object metroCity5=new MetroCity();
         
		
         SiliconCity siliconCity =new SiliconCity();
         City siliconCity2= new SiliconCity();
 		Capital siliconCity3=new SiliconCity();
 		Place siliconCity4=new SiliconCity();
          Object siliconCity5=new SiliconCity();
          MetroCity siliconCity6 =new SiliconCity();
          
          
         
		
	}	

}
