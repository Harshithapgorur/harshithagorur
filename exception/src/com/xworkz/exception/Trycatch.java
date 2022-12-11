package com.xworkz.exception;

public class Trycatch {

	public static void main(String[] args) {
		try {
			System.out.println("Starting to try");
			
			System.out.println("last line of try block");
		}
catch(ClassCastException g) {
	System.out.println("ClassCastException occured,"+g);
	
}
		finally {
			System.out.println("running finally block");
		}
	
	System.out.println("after finally block");
}
}