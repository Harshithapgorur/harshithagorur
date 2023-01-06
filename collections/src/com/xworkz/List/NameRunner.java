package com.xworkz.List;

import java.util.ArrayList;
import java.util.List;

public class NameRunner {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(2);//Adding the 1 index value is 5
		list.add(0, 1);//Adding the 0 index value is 1
		list.set(1, 5);//Modifying the value 5 
		list.remove(1);	//Removing th8h=999kim-p
		for (Integer integer : list) {
			System.out.println(integer);
		}
	
	}

}

