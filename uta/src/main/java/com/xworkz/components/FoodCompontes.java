package com.xworkz.components;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.ToString;
@Component
@RequestMapping("\food")
public  class FoodCompontes{
	public FoodCompontes() {
	System.out.println("created"+getClass().getSimpleName());	
	}
	@PostMapping
	public String onSend(@RequestParam String name, @RequestParam String type, @RequestParam int quantity,
			@RequestParam double price) {
		System.out.println("Running onSend");
		System.out.println("Food name :" + name);
		System.out.println("Food Type :" + type);
		System.out.println("Quantity :" + quantity);
		System.out.println("Price :" + price);
		return "fooditem.jsp";
	}
}
