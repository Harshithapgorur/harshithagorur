package com.xworkz.annotation.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	@Autowired
	@Qualifier("nataraj")
	private String name;
	@Autowired
	@Qualifier("withrubber")
	private String type;
	@Autowired
	@Qualifier("withoutrubber")
	private double price;
	@Autowired
	@Qualifier("red")
	private String color;
	@Autowired
	@Qualifier("round")
	private boolean sharp;
	
	private boolean stolen;
	
	

}
