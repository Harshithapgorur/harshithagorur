package com.xworkz.annotation.type;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Software {
	@Autowired
	@Qualifier("google")
	private String name;
	
	@Autowired
	@Qualifier("version")
	private double version;
	
	@Autowired
	@Qualifier("google123")
	private String developer;
	@Autowired

	private LocalDate date;
	@Autowired

	private boolean free;

}
