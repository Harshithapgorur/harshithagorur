package com.xworkz.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.xworkz.annotation")
public class Configation {

	@Bean
	public int id() {
		System.out.println("Registering the id");
		return 98765;

	}

	@Bean
	public String phone() {
		System.out.println("Registering the name");
		return "Alexa";

	}

	@Bean
	public int gstNo() {
		System.out.println("Registering the gstNo");
		return 987659876;

	}

	@Bean
	public String bharathi() {
		System.out.println("Registering the ownerName");
		return "venshuu";

	}

	@Bean
	public String gorur() {
		System.out.println("Registering the address");
		return "hassan";

	}

	@Bean
	public String google() {
		System.out.println("Registering the name2");
		return "mac";

	}

	@Bean
	public String version() {
		System.out.println("Registering the version");
		return "45.98";

	}

	@Bean
	public String google123() {
		System.out.println("Registering the google123");
		return "google123";

	}

	@Bean
	public String ranjitha() {
		System.out.println("Registering the ranjitha");
		return "ranjitha";

	}

	@Bean
	public String TR() {
		System.out.println("Registering the TR");
		return "TR";

	}

	@Bean
	public String nataraj() {
		System.out.println("Registering the nataraj");
		return "nataraj";

	}

	@Bean
	public String withrubber() {
		System.out.println("Registering the withrubber");
		return "withrubber";

	}

	@Bean
	public String withoutrubber() {
		System.out.println("Registering the withoutrubber");
		return "withoutrubber";

	}

	@Bean
	public String red() {
		System.out.println("Registering the red");
		return "red";

	}

	@Bean
	public String round() {
		System.out.println("Registering the round");
		return "true";

	}

	@Bean
	public String white() {
		System.out.println("Registering the white");
		return "white";

	}
	@Bean
	public String ksrtc() {
		System.out.println("Registering the ksrts");
		return "ksrtc";

	}
	@Bean
	public String price() {
		System.out.println("Registering the  price");
		return " price";

	}
	@Bean
	public String hassan() {
		System.out.println("Registering the  hassan");
		return " hassan";

	}
	@Bean
	public String mysore() {
		System.out.println("Registering the  mysore");
		return " mysore";

	}
	@Bean
	public String red1() {
		System.out.println("Registering the  red");
		return " red";

	}
	@Bean
	public int size() {
		System.out.println("Registering the  size");
		return 98765;

	}
	@Bean
	public String ramanathpura() {
		System.out.println("Registering the  ramanathpura");
		return " ramanathpura";

	}
	@Bean
	public String publictrc() {
		System.out.println("Registering the  publictrc");
		return "publictrc";

	}
	
	

}
