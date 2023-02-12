package com.xworkz.egg.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.xworkz")
public class EggConfiguration {
	public EggConfiguration() {
System.out.println("created"+this.getClass().getSimpleName());
	}


}
