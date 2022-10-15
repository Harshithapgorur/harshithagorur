package com.xworkz.copy.boot;

public class PassPort {
	
	public char number;
	public String name;
	public float expirydate;
	public String country;
	public double issuedate;
	public char doofleafeo;
	public char dooleafeo;
	
	public PassPort() {
		System.out.println("passport yyy");
	}
	public PassPort(char number) {
		this.number=number;
		System.out.println("passport for");
	}
	public PassPort(char number,String name) {
		this.number=number;
		this.name=name;
	}
	public PassPort(char number,String name,float expirydate) {
		this.number=number;
		this.name=name;
		this.expirydate=expirydate;
	}
	public PassPort(char number,String name,float expirydate,String country) {
		this.number=number;
		this.name=name;
		this.expirydate=expirydate;
		this.country=country;
	}
	public PassPort(double issuedate,char doofleafeo) {
		this.issuedate=issuedate;
		this.doofleafeo=doofleafeo;
	}
	public PassPort(double issuedate,char doofleafeo,char number) {
		this.issuedate=issuedate;
		this.doofleafeo=doofleafeo;
		this.number=number;
		
	}
	public PassPort(char number,String name,float expirydate,double issuedate) {
		this.number=number;
		this.name=name;
		this.expirydate=expirydate;
		this.issuedate=issuedate;
	
	}
	public PassPort(double issuedate,char doofleafeo,char number,String name,float expirydate,String country) {
		this.number=number;
		this.name=name;
		this.expirydate=expirydate;
		this.country=country;
		this.issuedate=issuedate;
		this.doofleafeo=doofleafeo;
	}

}
