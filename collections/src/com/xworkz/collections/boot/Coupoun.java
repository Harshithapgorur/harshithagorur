package com.xworkz.collections.boot;

import java.util.Collection;
import java.util.TreeSet;

public class Coupoun {

	public static void main(String[] args) {
		String coupoun1="JHGFVXB1231";
		String coupoun2="JHGFVXB1232";
		String coupoun3="JHGFVXB1233";
		String coupoun4="JHGFVXB1234";
		String coupoun5="JHGFVXB1235";
		String coupoun6="JHGFVXB1236";
		String coupoun7="JHGFVXB1237";
		String coupoun8="JHGFVXB1238";
		String coupoun9="JHGFVXB1239";
		String coupoun10="JHGFVXB12310";
		String coupoun11="JHGFVXB12311";
		String coupoun12="JHGFVXB12312";
		Collection<String> collection=new TreeSet();
		collection.add(coupoun12);
		collection.add(coupoun11);
		collection.add(coupoun10);
		collection.add(coupoun1);
		collection.add(coupoun2);
		collection.add(coupoun3);
		collection.add(coupoun4);
		collection.add(coupoun5);
		collection.add(coupoun6);
		collection.add(coupoun7);
		collection.add(coupoun8);
		collection.add(coupoun9);
		System.out.println(collection.size());
		collection.clear();
		System.out.println(collection.size());
		
		

	}

}
