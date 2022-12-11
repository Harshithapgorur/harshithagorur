package pattren;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name and number");
		String name,rev=" ";
		name=sc.nextLine();
		int length=name.length();
		for(int i=length-1;i<=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println("after the rev");
	}
}

	
		