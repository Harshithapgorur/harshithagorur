package com.xworkz.components;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.xworkz.components")
public class FoodConfi {
	public FoodConfi() {
		System.out.println("created"+getClass().getSimpleName());
	}

}
