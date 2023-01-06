package com.xworkz.pizza.serves;

import com.xworkz.pizza.constant.BuildingType;
import com.xworkz.pizza.dto.BuildingDTO;
import com.xworkz.pizza.repository.BuildingRepository;

public class BuildingServerImpl implements BuildingServer {
	private BuildingRepository repository;
	

	public BuildingServerImpl(BuildingRepository repository) {
		this.repository = repository;
	}


	@Override
	public boolean validateAndSave(BuildingDTO dto) {
	System.out.println("Running the validateAndSave"+dto);
	int number=dto.getNumber();
	String name=dto.getName();
	byte floor=dto.getFloors();
	boolean lift=dto.getLift();
	char parking=dto.getParking();
	BuildingType type=dto.getType();
	
	boolean vaildName=false;
	boolean vaildNumber=false;
	boolean vaildfloor=false;
	boolean vaildLift=false;
	boolean vailParking=false;
	boolean vailType=false;
	if(number!=0&&number>=4&&number<=20) {
		System.out.println("valid number"+number);
		vaildNumber=true;
	}
	else {
		System.err.println("Invalid number"+number);
	}
	if(name!=null&&name.length()>=4&&name.length()<=20) {
		System.out.println("valid name"+name);	
		vaildName=true;
	}
	else {
		System.err.println("Invalid name"+name);
	}
	if(floor!=1&&floor>=1&&floor<=19) {
		System.out.println("valid floor"+floor);
		vaildfloor=true;
	}
	else {
		System.err.println("Invalid floor"+floor);
	}
	if(parking!=0&&parking>=4&&parking<=20) {
		System.out.println("valid parking"+parking);
		vailParking=true;
	}
	else {
		System.err.println("Invalid parking"+parking);
	}
	if(type!=null) {
		System.out.println("valid type"+type);
		vailType=true;
		
	}
	else {
		System.err.println("Invalid type"+type );
	}
		return false;
	}

}
