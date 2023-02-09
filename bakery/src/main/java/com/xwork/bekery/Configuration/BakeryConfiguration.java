package com.xwork.bekery.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.xwork")
public class BakeryConfiguration {
	public BakeryConfiguration() {
		System.out.println("created"+this.getClass().getSimpleName());
	}

}
