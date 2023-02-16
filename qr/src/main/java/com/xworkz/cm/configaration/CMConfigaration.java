package com.xworkz.cm.configaration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@ComponentScan("com.xworkz.cm")
public class CMConfigaration {
	public CMConfigaration() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("running the LocalContainerEntityManagerFactoryBean");
		return  new LocalContainerEntityManagerFactoryBean();
	}
	
}
