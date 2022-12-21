package com.xworkz.collections.boot1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animal {

	public static void main(String[] args) {
	String animal1="Dog";
	String animal2="cat";
	String animal3="leopard";
	String animal4="polarbear";
	String animal5="rabbit";
	String animal6="cow";
	String animal7="pigeon";
	String animal8="hen";
	String animal9="fish";
	String animal10="cheetash";
	Collection<String> collection=new ArrayList<String>();
	collection.add(animal10);
	collection.add(animal9);
	collection.add(animal8);
	collection.add(animal7);
	collection.add(animal6);
	collection.add(animal5);
	collection.add(animal4);
	collection.add(animal3);
	collection.add(animal2);
	collection.add(animal1);
	for(String element :collection) {
		System.out.println(element);
	}
	System.out.println("----------Iterator------------");
	Iterator<String> ref=collection.iterator();
	
	
	
	while(ref.hasNext())
	{
		String element=ref.next();
		System.out.println(element);
	}
	System.out.println(collection.size());
	
	
	

	}

}
