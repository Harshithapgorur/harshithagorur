package com.xworkz.association.things;

public class State {
	public String name;
	public int numberOfDistricts;
	public  String Statemusic;
	public  int Literacy;
	public State(String name, int numberOfDistricts, String statemusic, int literacy) {
		super();
		this.name = name;
		this.numberOfDistricts = numberOfDistricts;
		Statemusic = statemusic;
		Literacy = literacy;
	}
	public void Showoff() {
		System.out.println(this.name);
		System.out.println(this.numberOfDistricts);
		System.out.println(this.Statemusic);
		System.out.println(this.Literacy);
}
}
