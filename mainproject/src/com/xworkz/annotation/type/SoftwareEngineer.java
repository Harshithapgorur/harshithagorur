package com.xworkz.annotation.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {
	@Autowired
	@Qualifier("ranjitha")
	private String name;
	@Autowired
	@Qualifier("TR")
	private String companyname;
	@Autowired
	private boolean salary;
	@Autowired
	private int exp;
	
	
	

}
