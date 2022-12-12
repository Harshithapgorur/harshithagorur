package com.xworkz.crud.repository;

import com.xworkz.crud.dto.IplDTO;

public class IplRepositoryIml implements IplRepository {
	private IplDTO[] iplDtos= new IplDTO[10];
	private int catIndex =0;
	

	@Override
	public boolean create(IplDTO dto) {
		System.out.println("running the IplDTO"+dto);
		if(this.catIndex >= this.iplDtos.length) {
		System.out.println("size exceeded");
		return false;
	}
	this.iplDtos[this.catIndex]= dto;
	System.out.println("don"+dto+"index"+ this.catIndex);
	this.catIndex++;
	return true;
	
	
	}
}
