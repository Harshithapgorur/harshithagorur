package com.xworkz.collections.boot;

import java.util.Collection;
import java.util.TreeSet;

public class BikeRunner {
	public static void main(String[] args) {
	String bike="yamahaMt15";
	String bike1="royalenfildclassic";
	String bike2="royalenfildhunter";
	String bike3="herosplendorplus";
	String bike4="tvsapache";
	String bike5="royalenfildbullet";
	String bike6="kawasakininijah2";
	String bike7="bajajpulsar";
	String bike8="yamahaR15V4";
	String bike9="ktm390duke";
	String bike10="tvsapacheRTR160";
	String bike11="ktm200Duke";
	String bike12="bajajPulsar";
	String bike13="suzukihayabusa";
	String bike14="honda";
	String bike15="hero";
	String bike16="tvsapacheRR";
	String bike17="royalenfieldhimalayan";
	String bike18="S1";
	Collection<String>collection=new TreeSet<String>();
	collection.add(bike18);
	collection.add(bike17);
	collection.add(bike16);
	collection.add(bike15);
	collection.add(bike14);
	collection.add(bike13);
	collection.add(bike12);
	collection.add(bike11);
	collection.add(bike10);
	collection.add(bike9);
	collection.add(bike8);
	collection.add(bike7);
	collection.add(bike6);
	collection.add(bike5);
	collection.add(bike4);
	collection.add(bike3);
	collection.add(bike2);
	collection.add(bike1);
	collection.add(bike);
	System.out.println(collection.size());
	collection.clear();
	System.out.println(collection.size());
	}
	
}
