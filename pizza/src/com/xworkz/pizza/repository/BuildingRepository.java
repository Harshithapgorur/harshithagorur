package com.xworkz.pizza.repository;

import com.xworkz.pizza.dto.BuildingDTO;
import com.xworkz.pizza.exception.InvalidBuildingDataException;

public interface BuildingRepository {
	boolean tree(BuildingDTO dto) throws InvalidBuildingDataException;

}
