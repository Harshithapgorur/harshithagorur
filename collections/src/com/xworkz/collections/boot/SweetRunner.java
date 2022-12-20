package com.xworkz.collections.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class SweetRunner {

	public static void main(String[] args) {
		String sweet1="peda";
		String sweet2="carrotHalwa";
		String sweet3="kajiKatli";
		String sweet4="gulabJamun";
		String sweet5="Ladoo";
		String sweet6="kulfi";
		String sweet7="jalebi";
		String sweet8="kheer";
		String sweet9="rasgulla";
		String sweet10="barfi";
		String sweet11="sutarFeni";
		String sweet12="sohanPapdi";
		String sweet13="mysorePak";
		
		Collection<String> collection=new TreeSet();
		collection.add(sweet13);
		collection.add(sweet12);
		collection.add(sweet11);
		collection.add(sweet10);
		collection.add(sweet9);
		collection.add(sweet8);
		collection.add(sweet7);
		collection.add(sweet6);
		collection.add(sweet5);
		collection.add(sweet4);
		collection.add(sweet3);
		collection.add(sweet2);
		collection.add(sweet1);
		System.out.println(collection.size());
		
		collection.clear();
		System.out.println("after clear...........");
		System.out.println(collection.size());
		
		
		

	}

}
