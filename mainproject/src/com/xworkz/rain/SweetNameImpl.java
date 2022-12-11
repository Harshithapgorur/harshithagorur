package com.xworkz.rain;

public class SweetNameImpl implements SweetName {
	private String[] names=new String [7];
	private int nameIndex=0;


	@Override
	public boolean create(String name) {
		System.out.println("Running creating the sweetname");
		this.names[nameIndex]=name;
		this.nameIndex++;
		return false;
		
	}

}
