package com.xworkz.rain;

public class EmailRepositoryImpl implements EmailRepository {
	private String[] emails= new String [10];
	private int emailIndex=0;

	@Override
	public boolean create(String email) {
		System.out.println("Running creating the email");
		this.emails[emailIndex]=email;
		this.emailIndex++;
		return false;
	}
	@Override
	public int total() {
		System.out.println("running totalGmails");
		return EmailRepository.super.total();

	}

}
