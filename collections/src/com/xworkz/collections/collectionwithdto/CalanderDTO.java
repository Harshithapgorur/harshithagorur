package com.xworkz.collections.collectionwithdto;

public class CalanderDTO {

	private Integer noOfDays;
	private Integer noOfSundays;
	private Integer noOfMonths;

	public CalanderDTO() {
		super();
		System.out.println("calling the no-argument cont");
	}

	public CalanderDTO(Integer noOfDays, Integer noOfSundays, Integer noOfMonths) {
		super();
		this.noOfDays = noOfDays;
		this.noOfSundays = noOfSundays;
		this.noOfMonths = noOfMonths;
	}

	@Override
	public String toString() {
		return "CalanderDTO [noOfDays=" + noOfDays + ", noOfSundays=" + noOfSundays + ", noOfMonths=" + noOfMonths
				+ "]";
	

}

@Override
public boolean equals(Object obj) {
System.out.println("calling the equals method");
if(obj!=null) {
	if(obj instanceof CalanderDTO) {
		CalanderDTO dto=(CalanderDTO)obj;
		if(dto.noOfSundays.equals(this.noOfSundays)){
			System.out.println("not match the gamename");
			
		}
	}
}
return false;
}
}