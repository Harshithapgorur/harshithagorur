package com.xworkz.rain;

public interface EmailRepository {
	
	boolean create (String email);
	default int total() {
		return 0;
		
	}
	

}
