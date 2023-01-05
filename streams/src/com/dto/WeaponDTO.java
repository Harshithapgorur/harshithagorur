package com.dto;

import com.dto.constant.Weapontype;

public class WeaponDTO {
	private String name;
	private String madeBy;
	private String madeOn;
	private Weapontype type;
	public WeaponDTO() {
		super();
	}
	public WeaponDTO(String name, String madeBy, String madeOn, Weapontype type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.type = type;
	}
	@Override
	public int hashCode() {
		return 30;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			 if (obj instanceof WeaponDTO) {
				 WeaponDTO casted=(WeaponDTO) obj;
				if(casted.name.equals(this.name) && casted.madeBy==(this.madeBy)) {
					return true;
				}
				
			}
			
		}
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", type=" + type + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMadeBy() {
		return madeBy;
	}
	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}
	public String getMadeOn() {
		return madeOn;
	}
	public void setMadeOn(String madeOn) {
		this.madeOn = madeOn;
	}
	public Weapontype getType() {
		return type;
	}
	public void setType(Weapontype type) {
		this.type = type;
	}

}
