package com.xworkz.mainproject.boot;

import java.util.ArrayList;

import javax.swing.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.xworkz.mainproject.configure.SpringConfiguration;
import com.xworkz.mainproject.type.Laptop;

public class ConfiguratonRunner {

	public static void main(String[] args) {
	ApplicationContext application =new AnnotationConfigApplicationContext(SpringConfiguration.class);
	Laptop lp=application.getBean(Laptop.class);
	System.out.println(lp);
	
	}

}
