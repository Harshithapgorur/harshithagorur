package com.xworkz.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Chocolate {

	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("bakuku", 5000.0);
		map.put("kushi", 7000.0);
		System.out.println(map.size());
		if (map.isEmpty()) {
			System.out.println("map is empty");
		} else {
			System.out.println("map is not empty");
		}
		Set<String> keys = map.keySet();
		keys.forEach(e -> System.out.println(e));
		Collection<Double> values = map.values();
		values.forEach(e -> System.out.println(e));

	}

}
