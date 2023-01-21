package com.xworkz.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PgRunner {

	public static void main(String[] args) {
		Map<String, Double> gun=new HashMap<String, Double>();
		gun.put("Icecream", 40.98);
		gun.put("Icecream", 40.98);
		gun.put("boomer", 89.98);
		System.out.println(gun.size());
		if(gun.isEmpty()) {
			System.out.println("is empty");
		}
		else {
			System.out.println("is not empty");
		}
		System.out.println("==========================================");
		Set<String> set=gun.keySet();
		set.forEach(e->System.out.println(e));
		Collection<Double> values=gun.values();
		values.forEach(e->System.out.println(e));

	}

}
