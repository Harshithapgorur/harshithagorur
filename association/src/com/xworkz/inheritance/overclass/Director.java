package com.xworkz.inheritance.overclass;

public class Director {
	public String filmMovie ;
	public double filmBudgets;
	public Director(String filmMovie, double filmBudgets) {
		super();
		this.filmMovie = filmMovie;
		this.filmBudgets = filmBudgets;
	}
	public void Cat() {
		System.out.println(this.filmBudgets);
		System.out.println(this.filmMovie);


		
	}
	
}
