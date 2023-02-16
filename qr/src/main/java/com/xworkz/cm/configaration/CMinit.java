package com.xworkz.cm.configaration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class CMinit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{
public CMinit() {
	System.out.println("created "+this.getClass().getSimpleName());
}
	@Override
	protected Class<?>[] getRootConfigClasses() {
	System.out.println("running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses");
		Class[] ref= {CMConfigaration.class};
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings   ");
		return new String[] {"/"};
	
	}
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running configureDefaultServletHandling");
		configurer.enable();
	}
}
 


