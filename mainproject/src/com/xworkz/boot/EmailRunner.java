package com.xworkz.boot;

import com.xworkz.rain.EmailRepository;
import com.xworkz.rain.EmailRepositoryImpl;

public class EmailRunner {

	public static void main(String[] args) {
		EmailRepository emailRepository=new EmailRepositoryImpl();
		emailRepository.create("harshithagorur@gmail.com");
		emailRepository.create("karthikgorur@gmail.com");
		emailRepository.create("bharathiprashantha@gmail.com");
		emailRepository.create("aishuxworkz@gmail.com");
		emailRepository.create("venshiamma@gmail.com");
		emailRepository.create("shreya@gmail.com");
		emailRepository.create("jeevekaxworkz@gmail.com");
		emailRepository.create("manuspxworkz@gmail.com");
		emailRepository.create("shashankxworkz@gmail.com");
		emailRepository.create("abcd@gmail.com");
		System.out.println(emailRepository.total());

	}

}
