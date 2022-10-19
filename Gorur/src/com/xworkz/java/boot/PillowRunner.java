package com.xworkz.java.boot;

import com.xworkz.java.gorur.Pillow;


public class PillowRunner {

	public static void main(String[] args) {
		String[] colors= {" white", "black"};
		String[] pillowcompany= {" Spa Paragon","GameDay Catering","Exploration Kids."};
		String[] ownerNames= {"you", "me"};
		long[] ownersNumbers= {78198089990l, 98202801837l};
		
		Pillow pillow=new Pillow(null, null, 0, false, colors,pillowcompany, ownerNames, ownerNames, ownersNumbers, ownersNumbers, ownerNames);
		
		
		pillow.display();
		
	}

}
