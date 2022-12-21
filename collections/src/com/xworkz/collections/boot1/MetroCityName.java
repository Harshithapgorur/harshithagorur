package com.xworkz.collections.boot1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCityName {

	public static void main(String[] args) {
		String metro="Mumbai";
		String metro1="Delhi";
		String metro2="Bangalore";
		String metro3="Chennai";
		String metro4="Hyderabad";
		Collection<String> india=new ArrayList<String>();
		india.add(metro4);
		india.add(metro3);
		india.add(metro2);
		india.add(metro1);
		india.add(metro);
		System.out.println(india.size());
		for (String tree : india) {
			System.out.println(tree);
			
		}
		System.out.println("--------------Iterator--------------------");
		Iterator<String> done=india.iterator();
		while (done.hasNext()) {
			String ok =done.next();
			System.out.println(ok);
			
			
		}
		}
		
		

	}


