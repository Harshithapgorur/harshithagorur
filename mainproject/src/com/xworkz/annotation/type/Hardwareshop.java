package com.xworkz.annotation.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hardwareshop {
	@Autowired
	@Qualifier("id")
	private int id;
	@Autowired
	@Qualifier("phone")
	private String name;
	@Autowired
	@Qualifier("gstNo")
	private int gstNo;
	@Autowired
	@Qualifier("bharathi")
	private String ownerName;
	@Autowired
	@Qualifier("gorur")
	private String address;

}
