package com.xworkz.interfaces;

public class TrafficRules implements Institute,DevelopmentInstitute,TestingInstitute  {
	boolean werhelmet() {
		return false;
	}
	String tripleRidding() {
		return null;
	}
	@Override
	public String training() {
	System.out.println("running the training");
		return null;
	}
	@Override
	public boolean placement() {
		System.out.println("running the placement");
		return false;
	}
	@Override
	public boolean interview() {
		System.out.println("running the interview");
		return false;
	}

}
