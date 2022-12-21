package com.xworkz.collections.boot1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSize {

	public static void main(String[] args) {
		Integer shoes1=32;
		Integer shoes2=33;
		Integer shoes3=34;
		Integer shoes4=35;
		Integer shoes5=36;
		Integer shoes6=37;
		Integer shoes7=38;
		Integer shoes8=39;
		Integer shoes9=39;
		Integer shoes10=42;
		Integer shoes11=42;
		Integer shoes12=45;
		Integer shoes13=39876;
		Integer shoes14=32;
		Integer shoes15=32;
		Collection<Integer> tree=new ArrayList<Integer>();
		tree.add(shoes15);
		tree.add(shoes14);
		tree.add(shoes13);
		tree.add(shoes12);
		tree.add(shoes11);
		tree.add(shoes10);
		tree.add(shoes9);
		tree.add(shoes8);
		tree.add(shoes7);
		tree.add(shoes6);
		tree.add(shoes5);
		tree.add(shoes4);
		tree.add(shoes3);
		tree.add(shoes2);
		tree.add(shoes1);
		System.out.println(tree.size());
		for (Integer happy : tree) {
			System.out.println(happy);
			
		}
		System.out.println("--------------Iterator--------------------");
		Iterator<Integer> done=tree.iterator();
		while (done.hasNext()) {
			Integer ok =done.next();
			System.out.println(ok);
			
			
		}
		

	}

}
