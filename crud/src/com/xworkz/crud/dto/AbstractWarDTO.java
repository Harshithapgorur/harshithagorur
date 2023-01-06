package com.xworkz.crud.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public abstract class AbstractWarDTO implements Serializable {
	private String createdBy;
	private LocalDateTime createdDate;
	private String updateBy;
	private LocalDateTime updateDate;

	public AbstractWarDTO() {
		System.out.println("calling the defult cont");
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
