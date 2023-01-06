package com.xworkz.pizza.dto;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.BuildingType;

public class BuildingDTO extends AbstractAuditPizza {
	private int number;
	private String name;
	private byte floors;
	private boolean lift;
	private char parking;
	private BuildingType type;
	public BuildingDTO() {
		super();
		
	}
	public BuildingDTO(int number, String name, byte floors, boolean lift, char parking, BuildingType type) {
		super();
		this.number = number;
		this.name = name;
		this.floors = floors;
		this.lift = lift;
		this.parking = parking;
		this.type = type;
	}
	@Override
	public String toString() {
		return "BuildingDTO [number=" + number + ", name=" + name + ", floors=" + floors + ", lift=" + lift
				+ ", parking=" + parking + ", type=" + type + ", getCreatedBy()=" + getCreatedBy()
				+ ", getCreatedDate()=" + getCreatedDate() + "]";
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getFloors() {
		return floors;
	}
	public void setFloors(byte floors) {
		this.floors = floors;
	}
	public boolean getLift() {
		return lift;
	}
	public void setLift(boolean lift) {
		this.lift = lift;
	}
	public char getParking() {
		return parking;
	}
	public void setParking(char parking) {
		this.parking = parking;
	}
	public BuildingType getType() {
		return type;
	}
	public void setType(BuildingType type) {
		this.type = type;
	}
	
	

}
