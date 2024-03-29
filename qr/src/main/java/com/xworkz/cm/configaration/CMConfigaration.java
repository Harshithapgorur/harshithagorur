package com.xworkz.cm.configaration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.cm")
public class CMConfigaration {
	public CMConfigaration() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@Bean
	public ViewResolver viewResolver() {
	System.out.println("registering custom view resolver");
	return new InternalResourceViewResolver("/",".jsp");
	}
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("running the LocalContainerEntityManagerFactoryBean");
		return  new LocalContainerEntityManagerFactoryBean();
	}
	
}
