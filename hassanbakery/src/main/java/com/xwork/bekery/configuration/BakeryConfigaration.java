package com.xwork.bekery.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.xwork")
public class BakeryConfigaration {
	public BakeryConfigaration() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

}
