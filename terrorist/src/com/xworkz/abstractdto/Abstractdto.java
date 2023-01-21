package com.xworkz.abstractdto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Abstractdto implements Serializable{
	
	private String createdBy;
	private LocalDateTime createdDate;
	private String updateBy;
	private LocalDateTime updateDate;
	public Abstractdto() {
		super();
		System.out.println("calling the no-argument cont");
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}


}
