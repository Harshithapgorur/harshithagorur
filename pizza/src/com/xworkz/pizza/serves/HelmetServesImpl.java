package com.xworkz.pizza.serves;

import com.xworkz.pizza.constant.HelmetType;
import com.xworkz.pizza.constant.Typecolor;
import com.xworkz.pizza.dto.HelmetDTO;
import com.xworkz.pizza.repository.HelmetRepository;

public class HelmetServesImpl implements HelmetServes{
	private HelmetRepository halmetRepository;
	public HelmetServesImpl(HelmetRepository halmetRepository) {
		this.halmetRepository=halmetRepository;
	}

	@Override
	public boolean validationSave(HelmetDTO dto) {
		System.out.println("Running the helmetdto"+dto);
	
	
	String company=dto.getCompany();
	Double price=dto.getPrice();
	Typecolor color=dto.getColor();
	HelmetType type=dto.getType();
	
	boolean validCompany=false;
	boolean validColor=false;
	boolean validType=false;
	boolean validPrice=false;
	if(company!=null && company.length()>=4&&company.length()<=20) {
		System.out.println("valid company"+company);
		validCompany=true;
		
	}
	else {
		System.err.println("Invalid company"+company);
		
	}
	if(color!=null ) {
		System.out.println("valid color"+color);
		validColor=true;
	}
	else {
		System.err.println("Invalid color"+color);
	}
	if(type!=null) {
		System.out.println("valid Type"+type);
		validType=true;
	}
	else {
		System.out.println("Invalid Type"+type);
		
	}
	if(price!=0&&price>=900&&price<=100000) {
		System.out.println("Running the valid price"+price);
	validPrice=true;
	}
	else {
		System.out.println("Invalid price"+price);
	}
	if(validCompany&&validColor&&validType&&validPrice) {
		System.out.println("HelmetDTO is valid can save using repository");
		boolean saved =this.halmetRepository.save(dto);
		System.out.println("Helmet DTO is save"+saved);
		return saved;
		
		
	}
	return true;
	

}
	
}
