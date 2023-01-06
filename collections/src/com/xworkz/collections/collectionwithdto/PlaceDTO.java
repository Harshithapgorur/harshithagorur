package com.xworkz.collections.collectionwithdto;

public class PlaceDTO {
	private Integer noOfPlace;
	private String location;
	private Integer pinCode;
	public PlaceDTO() {
		super();
		System.out.println("calling the no argument cont");
	}
	public PlaceDTO(Integer noOfPlace, String location, Integer pinCode) {
		super();
		this.noOfPlace = noOfPlace;
		this.location = location;
		this.pinCode = pinCode;
	}
	 @Override
		public boolean equals(Object obj) {
		System.out.println("calling the equals method");
		if(obj!=null) {
			if(obj instanceof PlaceDTO) {
				PlaceDTO dto=(PlaceDTO)obj;
				if(dto.noOfPlace.equals(this.noOfPlace)){
					System.out.println("not match the gamename");
					
				}
			}
		}
		return true;
	 }
	@Override
	public String toString() {
		return "PlaceDTO [noOfPlace=" + noOfPlace + ", location=" + location + ", pinCode=" + pinCode + "]";
	}
	public Integer getNoOfPlace() {
		return noOfPlace;
	}
	public void setNoOfPlace(Integer noOfPlace) {
		this.noOfPlace = noOfPlace;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	

}
