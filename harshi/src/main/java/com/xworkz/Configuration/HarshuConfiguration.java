package com.xworkz.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.xworkz")
public class HarshuConfiguration {
	public HarshuConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

}
