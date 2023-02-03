import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Configaration  extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses ");
		return null;
	}

	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		Class[] ref = { FoodItemConfiguration.class };
		return ref;
	}

	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings");
		String[] ref = { "/" };
		System.out.println("getServletMappings :" + Arrays.toString(ref));
		return ref;
	}
	
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running configureDefaultServletHandling ");
		configurer.enable();
	} 
}

