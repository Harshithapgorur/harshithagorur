package com.xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configaration.SpringConfiguration;
import com.xworkz.dto.ResortDTO;
import com.xworkz.serves.ResortServers;

public class ResortRunner {

	public static void main(String[] args) {
		ApplicationContext container=new  AnnotationConfigApplicationContext(SpringConfiguration.class);
		ResortServers server=container.getBean(ResortServers.class);
		boolean save=server.validateAndSave(new ResortDTO());
		System.out.println("saved"+save);


		
	}

}



