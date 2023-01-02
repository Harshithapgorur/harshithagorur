package com.streams;

import java.io.Serializable;
import java.net.Proxy.Type;

import com.streams.constant.TypeDataBaseVendorDTO;

public class DataBaseVendorDTO implements Serializable {
	private String name;
	private String developedBy;
	private TypeDataBaseVendorDTO type;
	private double size;
	private double liceseCost;

	public DataBaseVendorDTO() {
		super();
	}

	public DataBaseVendorDTO(String name, String developedBy, TypeDataBaseVendorDTO type, double size,
			double liceseCost) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.type = type;
		this.size = size;
		this.liceseCost = liceseCost;
	}

	@Override
	public String toString() {
		return "DataBaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", type=" + type + ", size=" + size
				+ ", liceseCost=" + liceseCost + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public TypeDataBaseVendorDTO getType() {
		return type;
	}

	public void setType(TypeDataBaseVendorDTO type) {
		this.type = type;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getLiceseCost() {
		return liceseCost;
	}

	public void setLiceseCost(double liceseCost) {
		this.liceseCost = liceseCost;
	}

}
