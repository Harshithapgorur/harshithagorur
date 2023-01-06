package com.xworkz.pizza.repository;

import com.xworkz.pizza.dto.TheaterDTO;

import com.xworkz.pizza.exception.InvalidTheaterDataExceptio;

public class TheaterRepositoryImpl implements TheaterRepository {
private TheaterDTO[] tree=new TheaterDTO[10];
private int catIndex=0;
	@Override
	public boolean smart(TheaterDTO dtos) throws InvalidTheaterDataExceptio  {
		System.out.println("Running the TheaterDTO"+dtos);
		if(this.catIndex>=this.tree.length) {
			System.out.println("size exceeded");
			throw new InvalidTheaterDataExceptio();
		}
		this.tree[this.catIndex]=dtos;
		System.out.println("happy"+dtos+"index"+this.catIndex);
		this.catIndex++;
		
		return false;
	}

}
