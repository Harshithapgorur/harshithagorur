package com.xworkz.java.boot;

import com.xworkz.java.gorur.Metro;

public class MetroRunner {

	public static void main(String[] args) {
		String[] colors= {"Green", "Purple"};
		String[] compartmentsNames= {"Ladies Comp", "General Comp"};
		int [] distances= {5, 10, 16};
		String[] stationsNames= {"NagaSandra", "Jalahalli Cross", "Yeshwanthpur"};
		String[] stationManagerNames= {"Ramu", "Lakshman"};
		long[] stationManagerNumbers= {78198089990l, 98202801837l};
		
		Metro metro= new Metro("Namma Metro", "Nagasandra", "Majestic", 38, true, colors, compartmentsNames, distances,
				stationsNames, stationManagerNames, stationManagerNumbers);
		
		
		metro.display();
		 
			
		
	}

}
