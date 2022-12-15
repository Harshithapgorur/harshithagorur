package com.xworkz.pizza.boot;

import com.xworkz.pizza.constant.HelmetType;
import com.xworkz.pizza.constant.Typecolor;
import com.xworkz.pizza.dto.HelmetDTO;
import com.xworkz.pizza.repository.HelmetRepository;
import com.xworkz.pizza.repository.HelmetRepositoryImpl;
import com.xworkz.pizza.serves.HelmetServes;
import com.xworkz.pizza.serves.HelmetServesImpl;

public class HelmetRunner {

	public static void main(String[] args) {
		HelmetDTO dto=new HelmetDTO("whatever",new Double(2000),Typecolor.BLACK,HelmetType.FULL);
		
HelmetRepository repository =new HelmetRepositoryImpl();

HelmetServes helmetServes=new HelmetServesImpl(repository);
boolean success=helmetServes.validationSave(dto);
System.out.println("success"+success);
	}

}
