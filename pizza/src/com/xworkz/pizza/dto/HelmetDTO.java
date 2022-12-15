package com.xworkz.pizza.dto;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.HelmetType;
import com.xworkz.pizza.constant.Typecolor;

public class HelmetDTO extends AbstractAuditPizza{
	private String company;
	private Double price;
	private Typecolor color;
	private HelmetType type;
	public HelmetDTO() {
		super();
		System.out.println("Running the defult cont");
	}
	public HelmetDTO(String company, Double price, Typecolor color, HelmetType type) {
		super();
		this.company = company;
		this.price = price;
		this.color = color;
		this.type = type;
	}
	@Override
	public String toString() {
		return "HelmetDTO [company=" + company + ", price=" + price + ", color=" + color + ", type=" + type
				+ ", getCreatedBy()=" + getCreatedBy() + ", getCreatedDate()=" + getCreatedDate() + "]";
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Typecolor getColor() {
		return color;
	}
	public void setColor(Typecolor color) {
		this.color = color;
	}
	public HelmetType getType() {
		return type;
	}
	public void setType(HelmetType type) {
		this.type = type;
	}
	

}
