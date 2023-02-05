package comm.xworkzz.casino;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.xworkzz.casino")
public class CasinoConfigaration {
	public CasinoConfigaration() {
		System.out.println("created"+getClass().getSimpleName());
	}

}
