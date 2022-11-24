package com.xworkz.equals;

public class Currency {
	private String name;
	private String type;
	private String code;
	private String validity;
	private String meterials;
	private boolean good;
	private double makeingcost;
	private String powerfull;
	public Currency() {
		super();
	}

		public Currency(String name, String type, String code, String validity, String meterials, boolean good,
				double makeingcost, String powerfull) {
			super();
			this.name = name;
			this.type = type;
			this.code = code;
			this.validity = validity;
			this.meterials = meterials;
			this.good = good;
			this.makeingcost = makeingcost;
			this.powerfull = powerfull;
		
		
	}
	@Override
	public String toString() {
		return "Currency [name=" + name + ", type=" + type + ", code=" + code + ", validity=" + validity
				+ ", meterials=" + meterials + ", good=" + good + ", makeingcost=" + makeingcost + ", powerfull="
				+ powerfull + "]";
	}
		@Override
		public boolean equals(Object other) {
			System.out.println("running equals method in Currency");
			if (other instanceof Currency) {
				System.out.println("other in paint, can check the properties");
				Currency casted = (Currency) other;
				if (this.type.equals(casted.type)&& this.code.equals(casted.code)
						&& this.makeingcost==casted.makeingcost && this.meterials.equals(casted.meterials)) {
					System.out.println("meterials is same");
					return true;
				}
			} else {
				System.err.println("other is not meterials");
			}
			return false;

		}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getValidity() {
		return validity;
	}
	public void setValidity(String validity) {
		this.validity = validity;
	}
	public String getMeterials() {
		return meterials;
	}
	public void setMeterials(String meterials) {
		this.meterials = meterials;
	}
	public boolean isGood() {
		return good;
	}
	public void setGood(boolean Good) {
		this.good = Good;
	}
	public double isMakeingcost() {
		return makeingcost;
	}
	public void setMakeingcost(double makeingcost) {
		this.makeingcost = makeingcost;
	}
	public String getPowerfull() {
		return powerfull;
	}
	public void setPowerfull(String powerfull) {
		this.powerfull = powerfull;
	}
	
	
	

}
