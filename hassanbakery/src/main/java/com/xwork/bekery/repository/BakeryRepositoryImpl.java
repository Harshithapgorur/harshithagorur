package com.xwork.bekery.repository;

import org.springframework.stereotype.Repository;

import com.xwork.bekery.dto.BakeryDTO;

@Repository
public class BakeryRepositoryImpl implements BakeryRepository {
public BakeryRepositoryImpl() {
	System.out.println("created "+this.getClass().getSimpleName());
}
	@Override
	public boolean save(BakeryDTO dto) {
		System.out.println("running save in BakeryRepository ");
		return false;
	}
	

}