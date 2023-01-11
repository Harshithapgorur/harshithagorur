package com.xworkz.Spring.boot;

import java.awt.Desktop.Action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Spring.bean.Rocket;
import com.xworkz.Spring.bean.Season;
import com.xworkz.Spring.cofiguration.SpringConfiguration;

public class SpringRunner {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Rocket refrocket=context.getBean("country",Rocket.class);
		System.out.println(refrocket);
		System.out.println(refrocket.getCountry());
		System.out.println(refrocket.getBudget());
		System.out.println(refrocket.getName());
		Rocket refrocket1=context.getBean("name",Rocket.class);
		System.out.println(refrocket1);
		System.out.println(refrocket1.getCountry());
		System.out.println(refrocket1.getBudget());
		System.out.println(refrocket1.getName());
Season refseason=context.getBean("duration",Season.class);
System.out.println(refseason);
Season refseason2=context.getBean("startingMonth",Season.class);
System.out.println(refseason);

	}

}
