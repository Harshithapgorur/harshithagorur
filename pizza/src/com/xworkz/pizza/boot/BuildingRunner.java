package com.xworkz.pizza.boot;

import com.xworkz.pizza.constant.BuildingType;
import com.xworkz.pizza.dto.BuildingDTO;
import com.xworkz.pizza.exception.InvalidBuildingDataException;
import com.xworkz.pizza.repository.BuildingRepository;
import com.xworkz.pizza.repository.BuildingRepositoryImpl;
import com.xworkz.pizza.serves.BuildingServer;
import com.xworkz.pizza.serves.BuildingServerImpl;

public class BuildingRunner {
	public static void main(String[] args) {
BuildingDTO dto=new BuildingDTO (24,"guru",4,true,32,BuildingType.EDUCATIONAL_BUILDING);
BuildingRepository repository=new BuildingRepositoryImpl() ;
	BuildingServer buildingServer =new BuildingServerImpl(repository);
	boolean success=buildingServer.validateAndSave(dto);
	System.out.println("success"+success);

	
	
}
	}
