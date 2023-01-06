package com.xworkz.crud.repository;

import com.xworkz.crud.dto.IplDTO;
import com.xworkz.crud.exception.ArraylengthiIsFull;

public class IplRepositoryIml implements IplRepository {
	private IplDTO[] iplDtos= new IplDTO[10];
	private int catIndex =0;
	

	@Override
	public boolean create(IplDTO dto) throws ArraylengthiIsFull {
		System.out.println("running the IplDTO"+dto);
		if(this.catIndex >= this.iplDtos.length) {			
		System.out.println("size exceeded");
		throw new ArraylengthiIsFull();
		
	}
	this.iplDtos[this.catIndex]= dto;
	System.out.println("don"+dto+"index"+ this.catIndex);
	this.catIndex++;
	
	return false;
	}
}
