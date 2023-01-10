package com.xworkz.mainproject.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.mainproject.type")

public class SpringConfiguration {
	@Bean("string")
	public String tree() {
		System.out.println("calling the tree in the bean");
		String string =new String(); 
		return string;
	}
	@Bean("string")
	public String book() {
		System.out.println("calling the book in the bean");
		String string =new String(); 
		return string;
	}
	@Bean("string")
	public String care() {
		System.out.println("calling the care in the bean");
		String string =new String(); 
		return string;
	}
	@Bean("string")
	public String box() {
		System.out.println("calling the box in the bean");
		String string =new String(); 
		return string;
	}
	@Bean("string")
	public String price() {
		System.out.println("calling the price in the bean");
		String string =new String(); 
		return string;
	}
	@Bean("boolean")
	public Boolean run() {
		System.out.println("calling the run in the bean");
		Boolean boo =new Boolean(null);
		return boo;
	}
	@Bean("boolean")
	public Boolean bedsprid() {
		System.out.println("calling the bedsprid in the bean");
		Boolean boo =new Boolean(null);
		return boo;
	}
	@Bean("boolean")
	public Boolean eco() {
		System.out.println("calling the eco in the bean");
		Boolean boo =new Boolean(null);
		return boo;
	}
	@Bean("boolean")
	public Boolean tab() {
		System.out.println("calling the tab in the bean");
		Boolean boo =new Boolean(null);
		return boo;
	}
	@Bean("boolean")
	public Boolean life() {
		System.out.println("calling the life in the bean");
		Boolean boo =new Boolean(null);
		return boo;
	}
	@Bean("float")
	public Float gun() {
		System.out.println("calling  float");
		Float foo =new Float(null);
		return foo;
	}
	@Bean("float")
	public Float eclipse() {
		System.out.println("calling the eclipse in the float");
		Float foo =new Float(null);
		return foo;
	}
	@Bean("float")
	public Float more() {
		System.out.println("calling the more in the float");
		Float foo =new Float(null);
		return foo;
	}
	@Bean("float")
	public Float plus() {
		System.out.println("calling the plus in the float");
		Float foo =new Float(null);
		return foo;
	}
	@Bean("float")
	public Float bun() {
		System.out.println("calling the bun in the float");
		Float foo =new Float(null);
		return foo;
	}
	
	
}
