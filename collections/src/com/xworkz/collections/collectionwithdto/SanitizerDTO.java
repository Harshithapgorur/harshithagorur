package com.xworkz.collections.collectionwithdto;

public class SanitizerDTO {
	private String id;
	private String brand;
	private String color;
	private double price;
	public SanitizerDTO() {
		super();
	
	}
	public SanitizerDTO(String id, String brand, String color, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "SanitizerDTO [id=" + id + ", brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}
	

}
