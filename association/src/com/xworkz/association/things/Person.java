package com.xworkz.association.things;

public class Person {
	public String name;
	public Email[] email;
	public Job     job = new Job(0, name, 0, null);
	
	
	
	public void person(String name, Email[] email) 
	{
		
		this.name = name;
		this.email = email;
	
	}
	
	
	public void showOff() {
		
		if(email!=null)
		{
			
			for(int i=0;i<email.length;i++)
			{
				Email mail = email[i];
			
			
			if(mail!=null)
			
				mail.Showoff();		
			}
			
		if(job!=null)
		{
			
			job.Showoff();
		}
		else 
		{
			System.out.println("happy");
		}
		}
		
		System.out.println(this.name);
		
	}


	
	
	
	

}
