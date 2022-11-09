package com.xworkz.inheritance.childclass;

import com.xworkz.inheritance.overclass.PoliticalParty;

public class PoliticalChild  extends PoliticalParty{
	public  String location;

	public PoliticalChild(String partyName, long partyMember,String location) {
		super(partyName, partyMember);
		this.location=location;
		
		
	}
	public void over() {
		super.over();
		System.out.println(this.location);
		
	}
	

}
