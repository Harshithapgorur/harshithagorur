package com.xworkz.collections.collectionwithdto;

public class AirportDTO {

	private String location;
	private Integer noOfAirplan;
	private Integer noOfworkers;
	public AirportDTO() {
		super();
		System.out.println("calling the no-argument cont");
	}
	 @Override
		public boolean equals(Object obj) {
		System.out.println("calling the equals method");
		if(obj!=null) {
			if(obj instanceof AirportDTO) {
				AirportDTO dto=(AirportDTO)obj;
				if(dto.location.equals(this.location)){
					System.out.println("not match the gamename");
					
				}
			}
		}
			return true;
		}
	@Override
	public String toString() {
		return "AirportDTO [location=" + location + ", noOfAirplan=" + noOfAirplan + ", noOfworkers=" + noOfworkers
				+ "]";
	}
	public AirportDTO(String location, Integer noOfAirplan, Integer noOfworkers) {
		super();
		this.location = location;
		this.noOfAirplan = noOfAirplan;
		this.noOfworkers = noOfworkers;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getNoOfAirplan() {
		return noOfAirplan;
	}
	public void setNoOfAirplan(Integer noOfAirplan) {
		this.noOfAirplan = noOfAirplan;
	}
	public Integer getNoOfworkers() {
		return noOfworkers;
	}
	public void setNoOfworkers(Integer noOfworkers) {
		this.noOfworkers = noOfworkers;
	}
	
	
}
