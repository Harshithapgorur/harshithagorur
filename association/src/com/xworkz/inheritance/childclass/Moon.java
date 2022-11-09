package com.xworkz.inheritance.childclass;

import com.xworkz.inheritance.overclass.Satellite;

public class Moon extends Satellite {
	public long Radius;
	

	public Moon(int density, double distanceToEarth,long Radius) {
		super(density, distanceToEarth);
		this.Radius=Radius;
		
	}
	public void laptop() {
		super.laptop();
		System.out.println(this.Radius);
		
	}
	

}
