package com.xworkz.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;





public class Pincode {

	public static void main(String[] args) {
Map<String,Integer> map=new HashMap<String, Integer>();
map.put("Hassan",570202);
map.put("gouru", 573120);	
System.out.println(map.size());
if (map.isEmpty()) {
	System.out.println("is empty");
	
} else {
	System.out.println("is not empty");

}

Set<String> tree=map.keySet();
tree.forEach(e->System.out.println(e));
Collection<Integer> values=map.values();
values.forEach(e->System.out.println(e));
}

}
