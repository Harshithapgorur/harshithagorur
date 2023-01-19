package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.ResortDTO;
@Component
public class ResortRepositoryImp implements ResortRepository {

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("ResortDTO"+dto);
		System.out.println("calling the ResortDTO");
		return false;
	}

}
