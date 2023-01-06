
package com.xworkz.pizza.serves;

import com.xworkz.pizza.dto.TheaterDTO;
import com.xworkz.pizza.repository.TheaterRepository;

public class TheaterServersImp implements TheaterServes{
	private TheaterRepository theaterRepository;
	public TheaterServersImp(TheaterRepository theaterRepository) {
		this.theaterRepository=theaterRepository;
	}

	@Override
	public boolean validationSave(TheaterDTO dto) {
		System.out.println("Running the theater"+dto);
		String name=dto.getName();
		String brand=dto.getBrand();
		long seats=dto.getSeats();
		long id=dto.getId();
		boolean validName=false;
		boolean validBrand=false;
		boolean validSeats=false;
		boolean validId=false;
		
		if(name!=null&&name.length()>=4&&name.length()<=20) {
			System.out.println("valid theater name");
			validName=true;
		}
		else {
			System.err.println("Invalid theater name");
			
			
		}
		if(brand!=null&&brand.length()>=5&&brand.length()<=20 ) {
			System.out.println("valid brand name");
		}
		else {
			System.err.println("Invalid brand name");
		}
		if(seats!=null&&seats.length()>=&&seats.length()<=20) {
		
		return false;
	}

}
