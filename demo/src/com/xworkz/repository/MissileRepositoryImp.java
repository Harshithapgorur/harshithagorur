package com.xworkz.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.MissileDTO;
@Component
public class MissileRepositoryImp implements MissileRepository{

	@Override
	public boolean save(MissileDTO dto) {
		System.out.println("MissileDTO is the Running ");
		return false;
	}

}
