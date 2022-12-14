package com.xworkz.java.gorur;

public class Bus {
	public String name;
	public String source;
	public String destination;
	public int price;
	public boolean running;

	public String[] color;
	public String[] compartmentsName;
	public int[] distance;
	public String[] stationsName;
	public String[] stationManagerNames;
	public long[] stationManagerNumbers;

	public Bus(String name, String source, String destination, int price, boolean running, String[] color,
			String[] compartmentsName, int[] distance, String[] stationsName, String[] stationManagerNames,
			long[] stationManagerNumbers) {

		this.name = name;
		this.source = source;
		this.destination = destination;
		this.price = price;
		this.running = running;
		this.color = color;
		this.compartmentsName = compartmentsName;
		this.distance = distance;
		this.stationManagerNames = stationManagerNames;
		this.stationManagerNumbers = stationManagerNumbers;
		this.stationsName = stationsName;

	}

	
	public void display() {
		System.out.println("Name : " +this.name);
		System.out.println(this.source);
		System.out.println(this.destination);
		System.out.println(this.price);
		System.out.println(this.running);
		
		System.out.println(System.lineSeparator() + "Colours : ");
		for (int i = 0; i < color.length; i++) {
			System.out.println(this.color[i]);
		}
		
		System.out.println(System.lineSeparator() + "Compartments Names: ");	
		for (int i = 0; i < this.compartmentsName.length; i++) {
			System.out.println(this.compartmentsName[i]);
		}
		
		
		for (int i = 0; i < this.distance.length; i++) {
			System.out.println(this.distance[i]);
		}
		
		for (int i = 0; i < this.stationsName.length; i++) {
			System.out.println(this.stationsName[i]);
		}
		for (int i = 0; i < this.stationManagerNames.length; i++) {
			String string = this.stationManagerNames[i];
			System.out.println(string);
		}
		for (int i = 0; i < stationManagerNumbers.length; i++) {
			System.out.println(this.stationManagerNumbers[i]);
		}
		
		
	}
}



