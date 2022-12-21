package com.xworkz.collections.boot1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch {

	public static void main(String[] args) {
		String watch1="Omega";
		String watch2="Rolex";
		String watch3="Patek Phillippe";
		String watch4="Rado";
		String watch5="Bell&Rose";
		Collection<String> watch=new ArrayList<String>();
		watch.add(watch5);
		watch.add(watch4);
		watch.add(watch3);
		watch.add(watch2);
		watch.add(watch1);
		System.out.println(watch.size());
		for (String happy : watch) {
			System.out.println(happy);
		}
		System.out.println("--------------Iterator--------------------");
		Iterator<String> done=watch.iterator();
		while (done.hasNext()) {
			String tree = done.next();
			System.out.println(tree);
			
		}
		
		

	}

}
