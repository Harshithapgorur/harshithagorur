package com.xworkz.Spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Season {
	private String name;
	private String duration;
	private String startingMonth;
	
	public Season(@Value("Rain")String name, @Value("four_months")String duration,@Value("july") String startingMonth) {
		
		this.name = name;
		this.duration = duration;
		this.startingMonth = startingMonth;
	}

	
	
	public String getDuration() {
		return duration;
	}
	
	public String getName() {
		return name;
	}
	
	public String getStartingMonth() {
		return startingMonth;
	}

}
