package com.xworkz.Spring.boot;

import java.awt.Desktop.Action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Spring.bean.Actor;
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
		
		Actor actor=context.getBean("actor",Actor.class);
		System.out.println(actor.getAge());
		System.out.println(actor.getLang());
		System.out.println(actor.getName());
		
		Actor actor2=context.getBean("age",Actor.class);
		System.out.println(actor2.getAge());
		System.out.println(actor2.getLang());
		System.out.println(actor2.getName());
		
	Season season=	context.getBean("season",Season.class);
	System.out.println(season
			
			
			
			);
	System.out.println(season.getDuration());
	System.out.println(season.getName());
	System.out.println(season.getStartingMonth());
	
	Season season2=	context.getBean("duration",Season.class);
	System.out.println(season2);
	System.out.println(season2.getDuration());
	System.out.println(season2.getName());
	System.out.println(season2.getStartingMonth());
		
		
		
		


	}

}
