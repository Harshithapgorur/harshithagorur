package com.xworkz.java.boot;

import com.xworkz.java.gorur.Bag;


public class BagRunner {

	public static void main(String[] args) {
		String[] colors= {"Green", "blue"};
		String[] items= {"books", "pen"};
		String [] bagscompany= {"puma", "nte"};
		String[] ownerNames= {"you", "me"};
		long[] ownersNumbers= {78198089990l, 98202801837l};
		
		Bag bag= new Bag(null, null, 0, false, colors, items, bagscompany, ownerNames, ownersNumbers, items, ownersNumbers);
		
		
		bag.display();
		 
			
		
	}



		
	}


