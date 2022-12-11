package pattren;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner net =new Scanner(System.in);
		System.out.println("enter the number");
		int n;
		n=net.nextInt();
		
		if(n%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}
	
	}
		