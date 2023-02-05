package com.xworkz.components;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FoodInfin extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running the getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running the getServletConfigClasses");
		Class[] ref = { FoodConfi.class };
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running the getServletMappings");

		String[] ref = { "/" };
		System.out.println("getServletMappings :" + Arrays.toString(ref));
		return ref;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running the configureDefaultServletHandling");
		configurer.enable();
	}
}
