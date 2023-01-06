package pattren;

import java.util.Scanner;

public class CouponCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String coupen = sc.next();
		
		
		String str1 = coupen.substring(0, 2);
		System.out.println(str1);
		String str2=coupen.substring(2, 6);
		System.out.println(str2);
		String str3=coupen.substring(6, 9);
		System.out.println(str3);
		String s=String.valueOf(str2);
		int converString=Integer.valueOf(str2);
		System.out.println(converString);
		

	}

}
