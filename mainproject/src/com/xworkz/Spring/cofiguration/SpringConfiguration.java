
package com.xworkz.Spring.cofiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.Spring.bean.Actor;
import com.xworkz.Spring.bean.Rocket;
import com.xworkz.Spring.bean.Season;

@Configuration
@ComponentScan("com.xworkz.Spring")

public class SpringConfiguration {

	public SpringConfiguration() {

System.out.println("calling the no-argument cont");
	}

	@Bean
	public Rocket country() {
		System.out.println("Registering another country in spring");
		Rocket country=new Rocket();
		return country;
	}
	@Bean
	public Rocket name() {
		System.out.println("Registering another country in spring");
		Rocket name=new Rocket();
		return name;
	}
	@Bean
	public Actor lang() {
		System.out.println("Registering another country in spring");
		Actor lang=new Actor();
		return lang;
}
	@Bean
	public Actor age() {
		System.out.println("Registering another country in spring");
		Actor age=new Actor();
		age.setAge(34);
		age.setLang("kannada");
		age.setName("Rahshith shetty");
		return age;
}
	@Bean
	public Season duration() {
		System.out.println("Registering another country in spring");
		Season duration=new Season("Winter", "five", "December");
		return duration;
}
	
}


