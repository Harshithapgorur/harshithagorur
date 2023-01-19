package com.xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configaration.SpringConfiguration;
import com.xworkz.dto.FirstAidDTO;
import com.xworkz.serves.FirstAidServes;

public class FirstAidRunner {

	public static void main(String[] args) {
		ApplicationContext container=new  AnnotationConfigApplicationContext(SpringConfiguration.class);
		FirstAidServes server=container.getBean(FirstAidServes.class);
		boolean save=server.validateAndSave(new FirstAidDTO());
		System.out.println("saved"+save);

	}

}
