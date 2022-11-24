package com.xworkz.equals;

public class God {
	private String name;
	private String place;
	private String location;
	private String pugariiName;
	private String brand;
	private double pinNumber;
	private boolean Lamp;
	private String type;
	private String gender;
	public God() {
		System.out.println("calling default constructor");;
		
	}
	
	public God(String name, String place, String location, String pugariiName, String brand, double pinNumber,
			boolean lamp, String type, String gender) {
		super();
		this.name = name;
		this.place = place;
		this.location = location;
		this.pugariiName = pugariiName;
		this.brand = brand;
		this.pinNumber = pinNumber;
		Lamp = lamp;
		this.type = type;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "God [name=" + name + ", place=" + place + ", location=" + location + ", pugariiName=" + pugariiName
				+ ", brand=" + brand + ", pinNumber=" + pinNumber + ", Lamp=" + Lamp + ", type=" + type + ", gender="
				+ gender + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof God) { //checking about instance of
	    	 System.out.println("obj is the instance of waterbottle ");
	    	 God god=(God)obj; //casting 
	    	 if(this.name.equals(god.name)&&(this.place.equals(god.place) &&(this.location.equals(god.location)))) {
	    		 System.out.println("name is same");
	    		 return true;
	    	 }else {
	    		 System.err.println("name is not same ");
	    		 return false;
	    	 }
		}
		else {
			 System.err.println("obj is not a instance of the object");
		}
			return super.equals(obj);
			        
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPugariiName() {
		return pugariiName;
	}

	public void setPugariiName(String pugariiName) {
		this.pugariiName = pugariiName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(double pinNumber) {
		this.pinNumber = pinNumber;
	}

	public boolean isLamp() {
		return Lamp;
	}

	public void setLamp(boolean lamp) {
		Lamp = lamp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	

}
