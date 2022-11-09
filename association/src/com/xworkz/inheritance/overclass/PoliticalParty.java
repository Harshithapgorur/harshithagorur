package com.xworkz.inheritance.overclass;

public class PoliticalParty {
	public String partyName;
	public long partyMember;
	public PoliticalParty(String partyName, long partyMember) {
		super();
		this.partyName = partyName;
		this.partyMember = partyMember;
	}
	public void over() {
		System.out.println(this.partyMember);
		System.out.println(this.partyName);
		
	}

}
