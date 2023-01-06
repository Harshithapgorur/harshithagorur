package com.xworkz.collections.collectionwithdto;

public class HolidayDTO {

	private String holidayPlan;
	private Integer noOfHoliday;
	private Integer noOfSunday;
	
	public HolidayDTO(String holidayPlan, Integer noOfHoliday, Integer noOfSunday) {
		super();
		this.holidayPlan = holidayPlan;
		this.noOfHoliday = noOfHoliday;
		this.noOfSunday = noOfSunday;
	}

	public String getHolidayPlan() {
		return holidayPlan;
	}

	public void setHolidayPlan(String holidayPlan) {
		this.holidayPlan = holidayPlan;
	}

	public Integer getNoOfHoliday() {
		return noOfHoliday;
	}

	public void setNoOfHoliday(Integer noOfHoliday) {
		this.noOfHoliday = noOfHoliday;
	}

	public Integer getNoOfSunday() {
		return noOfSunday;
	}

	public void setNoOfSunday(Integer noOfSunday) {
		this.noOfSunday = noOfSunday;
	}

	@Override
	public String toString() {
		return "HolidayDTO [holidayPlan=" + holidayPlan + ", noOfHoliday=" + noOfHoliday + ", noOfSunday=" + noOfSunday
				+ "]";
	}

	public HolidayDTO() {
		super();	
		System.out.println("calling no-argument cont");}
	 @Override
		public boolean equals(Object obj) {
		System.out.println("calling the equals method");
		if(obj!=null) {
			if(obj instanceof HolidayDTO) {
				HolidayDTO dto=(HolidayDTO)obj;
				if(dto.noOfSunday.equals(this.noOfSunday)){
					System.out.println("not match the gamename");
					
				}
			}
		}
		return false;
	
	 }
}

