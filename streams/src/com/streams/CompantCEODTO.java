package com.streams;

public class CompantCEODTO {
	private String name;
	private String company;
	private int age;
	private String conutry;
	private boolean qualification;
	private boolean married;

	public CompantCEODTO() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getConutry() {
		return conutry;
	}

	public void setConutry(String conutry) {
		this.conutry = conutry;
	}

	public boolean isQualification() {
		return qualification;
	}

	public void setQualification(boolean qualification) {
		this.qualification = qualification;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public CompantCEODTO(String name, String company, int age, String conutry, boolean qualification, boolean married) {
		super();
		this.name = name;
		this.company = company;
		this.age = age;
		this.conutry = conutry;
		this.qualification = qualification;
		this.married = married;
	}

	@Override
	public String toString() {
		return "CompantCEODTO [name=" + name + ", company=" + company + ", age=" + age + ", conutry=" + conutry
				+ ", qualification=" + qualification + ", married=" + married + "]";
	}

}
