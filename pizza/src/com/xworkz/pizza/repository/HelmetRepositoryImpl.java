package com.xworkz.pizza.repository;


import com.xworkz.pizza.dto.HelmetDTO;


public class HelmetRepositoryImpl implements HelmetRepository {
	private HelmetDTO[] helmetDTOs= new HelmetDTO[10];
	private int dogIndex =0;
	
	

	@Override
	public boolean save(HelmetDTO dto) {
		System.out.println("Running the HelmetDTO");
		if(this.dogIndex>=this.helmetDTOs.length) {
			System.out.println("size exceeded");
			
	}
		this.helmetDTOs[this.dogIndex]=dto;
		System.out.println("tea"+dto+"index"+this.dogIndex);
this.dogIndex++;
return true;
	
	
	}

}



