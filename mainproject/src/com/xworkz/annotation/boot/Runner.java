package com.xworkz.annotation.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.xworkz.annotation.configuration.Configation;
import com.xworkz.annotation.type.Hardwareshop;


public class Runner {

	public static void main(String[] args) {
		ApplicationContext application =new AnnotationConfigApplicationContext(Configation.class);
		String[] beanid=application.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanid));
		Hardwareshop refhardwareshop=application.getBean(Hardwareshop.class);
		System.out.println(refhardwareshop);
	}

}
