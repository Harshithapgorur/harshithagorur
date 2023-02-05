package comm.xworkzz.casino;

import java.util.Arrays;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CasinoInfin  extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{
public CasinoInfin() {
	System.out.println("created"+getClass().getSimpleName());
}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses");
		Class[] configClass = {CasinoConfigaration.class};
		return configClass;
	}

	@Override
	protected String[] getServletMappings() {
		String[] ref= {"/"};
		System.out.println("getServletMappings :" +Arrays.toString(ref));
		return ref;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		
		System.out.println("running configureDefaultServletHandling");
		configurer.enable();
	}

}
