package com.xworkz.pizza.repository;

import com.xworkz.pizza.dto.BuildingDTO;
import com.xworkz.pizza.exception.InvalidBuildingDataException;
import com.xworkz.pizza.exception.InvalidTheaterDataExceptio;

public class BuildingRepositoryImpl implements BuildingRepository {
private BuildingDTO[] gun=new BuildingDTO[10];
private int Index=0;
	@Override
	public boolean tree(BuildingDTO dto) throws InvalidBuildingDataException {
		System.out.println("Running the BuildingDTO"+dto);
		if(this.Index>=this.gun.length) {
			System.out.println("size exceeded");
			throw new InvalidBuildingDataException();
		}
		this.gun[this.Index]=dto;
		System.out.println("happy"+dto+"index"+this.Index);
		this.Index++;
		return false;
	}

}
