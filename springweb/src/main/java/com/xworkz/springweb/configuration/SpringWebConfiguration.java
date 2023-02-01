package com.xworkz.springweb.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springweb")
public class SpringWebConfiguration {
public SpringWebConfiguration() {
	System.out.println("Created SpringWebConfiguration");
}
}
