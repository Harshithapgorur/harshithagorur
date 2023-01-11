package com.xworkz.annotation.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bus {
	@Autowired
	@Qualifier("ksrtc")
	private String name;
	@Autowired
	@Qualifier("publictrc")
	private String type;
	@Autowired
	private double price;
	@Autowired
	private boolean isthere;
	@Autowired
	@Qualifier("hassan")
	private String directionFrom;
	@Autowired
	@Qualifier("mysore")
	private String directionto;
	@Autowired
	@Qualifier("red1")
	private String color;
	@Autowired
	@Qualifier("76")
	private int size;
	@Autowired
	@Qualifier("ramanathpura")
	private String busstop;

}
