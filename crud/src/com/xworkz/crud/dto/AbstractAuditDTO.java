package com.xworkz.crud.dto;

import java.io.Serializable;

public class AbstractAuditDTO implements Serializable {

	private String createdBy;
	private String createdDate;
	private String updateBy;
	private String updateDate;

	public AbstractAuditDTO() {
		System.out.println("calling the no-argument const of AbstractAuditDTO");
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

}
