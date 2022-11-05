package com.xworkz.association.boot;

import com.xworkz.association.things.Email;
import com.xworkz.association.things.Person;

public class PersonRunner {

	public static void main(String[] args) {
		
		Email mail = new Email();
		mail.email(2345678998765L,76557,89766543456L);
		
		Email mail1 = new Email();
		mail1.email(2345678998765L,76557,89766543456L);
		
		Email[] mai = {mail,mail1};
		
		Person person = new Person();
		person.person("Harshitha",mai);
		
		person.showOff();
		
		
		
		
		
		
	}


	

}
