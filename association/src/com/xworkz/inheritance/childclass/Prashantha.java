package com.xworkz.inheritance.childclass;

import com.xworkz.inheritance.overclass.Director;

public class Prashantha extends Director {
	public double filmprofits;

	public Prashantha(String filmMovie, double filmBudgets,double filmprofits) {
		super(filmMovie, filmBudgets);
		this.filmprofits=filmprofits;
			}
	public void Cat() {
		super.Cat();
		System.out.println(this.filmprofits);
		
		
	}
	

}
