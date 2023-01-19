package com.xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configaration.SpringConfiguration;

import com.xworkz.dto.MissileDTO;

import com.xworkz.serves.MissileServers;

public class MissileRunner {

	public static void main(String[] args) {
		ApplicationContext container=new  AnnotationConfigApplicationContext(SpringConfiguration.class);
		MissileServers server=container.getBean(MissileServers.class);
		boolean save=server.validateAndSave(new MissileDTO());
		System.out.println("saved"+save);

	}


	}


