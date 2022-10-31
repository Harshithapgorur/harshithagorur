package com.xworkz.association.things;

public class Email {
	
	public long id;
	public int password;
	public long mobileNo;
	public Address address;
	public Company company = new Company("Google", "Larry",  address);
	
	
	public void  email(long id, int password, long mobileNo) 
	{
	
		this.id = id;
		this.password = password;
		this.mobileNo = mobileNo;
	}
	
	
	public void Showoff()
	{
		if(company!=null)
		{
			company.company("Gmail","zoho mail");
			company.showOff();
		}
		else
		{
			System.out.println("company is not showoff");
		}
		
		System.out.println(System.lineSeparator());
		System.out.println("********************************");
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.mobileNo);
		
		
	}
	
	
	
	
	
	
	

}