package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.FirstAidDTO;

@Component
public class FirstAidRepositoryImp implements FirstAidRepository {

	public FirstAidRepositoryImp() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(FirstAidDTO dto) {
		System.out.println("Running save");
		System.out.println("DTO" + dto);
		return false;
	}

}
