package com.xworkz.egg.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="eggs")
public class EggDTO {
@Column(name="hotelName")
	private String hotelName;
@Column(name="dishName")
	private String dishName;
@Column(name="type")
	private String type;
@Column(name="price")
	private Double price;
@Column(name="quantity")
	private Integer quantity;
	public EggDTO() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	

}
