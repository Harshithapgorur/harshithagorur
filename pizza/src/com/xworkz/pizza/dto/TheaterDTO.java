package com.xworkz.pizza.dto;

import java.time.LocalDateTime;

public class TheaterDTO extends AbstractAuditPizza{
	private String name;
	private String brand;
	private long seats;
	private long id;
	public TheaterDTO() {
		super();
		System.out.println("claaing the deflut cont");
	}
	public TheaterDTO(String name, String brand, long seats, long id) {
		super();
		this.name = name;
		this.brand = brand;
		this.seats = seats;
		this.id = id;
	}
	@Override
	public String toString() {
		return "TheaterDTO [name=" + name + ", brand=" + brand + ", seats=" + seats + ", id=" + id + ", getCreatedBy()="
				+ getCreatedBy() + ", getCreatedDate()=" + getCreatedDate() + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public long getSeats() {
		return seats;
	}
	public void setSeats(long seats) {
		this.seats = seats;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
}
