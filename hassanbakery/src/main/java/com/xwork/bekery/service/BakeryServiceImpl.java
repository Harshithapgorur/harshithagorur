package com.xwork.bekery.service;

import org.springframework.stereotype.Service;

import com.xwork.bekery.dto.BakeryDTO;
import com.xwork.bekery.repository.BakeryRepository;

@Service
public class BakeryServiceImpl implements BakeryService {
	private BakeryRepository repo;
public BakeryServiceImpl() {
System.out.println("created "+this.getClass().getSimpleName());
}
	@Override
	public boolean validateAndSave(BakeryDTO dto) {
		System.out.println("running validate and save " +dto);
	 boolean saved=repo.save(dto);
	 System.out.println("saved in repo "+saved);
		return false;
	}
	

}
