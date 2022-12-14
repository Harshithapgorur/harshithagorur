
package com.xworkz.pizza.boot;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDTO;
import com.xworkz.pizza.serves.PizzServesImpl;
import com.xworkz.pizza.serves.PizzaServes;

public class PizzaRunner {

	public static void main(String[] args) {
		PizzaDTO pizzadto=new PizzaDTO();
		pizzadto.setName("conechees");
		pizzadto.setCompany("dominos");
		pizzadto.setPrice(27);
		pizzadto.setCheese(false);
		pizzadto.setSize(PizzaSize.SMALL);
		pizzadto.setFlavour("spicy");
		pizzadto.setType("VEG");
		
		
		pizzadto.setCreatedBy("SYSTEM");
		pizzadto.setCreatedDate(LocalDateTime.now());
		
		
		
		PizzaServes pizzaServes=new PizzServesImpl();
		boolean saved=pizzaServes.validation(pizzadto);
		System.out.println(saved);
	}

}
