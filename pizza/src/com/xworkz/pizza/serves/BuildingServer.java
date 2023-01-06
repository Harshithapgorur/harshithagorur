package com.xworkz.pizza.serves;

import com.xworkz.pizza.dto.BuildingDTO;

public interface BuildingServer {
	boolean validateAndSave(BuildingDTO dto);

}
