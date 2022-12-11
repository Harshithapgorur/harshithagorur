package pattren;

import java.util.Scanner;

public class Countspace {
	public static void main(String args[]) {
		String str;// variable declaration
		int space = 0;// variable declaration and initialization
		Scanner scan = new Scanner(System.in);// create a scanner object for input
		System.out.println("Enter the string ");
		str = scan.nextLine();
		int i = 0;
		while (i < str.length()) {
			char ch = str.charAt(i);
			if (ch == ' ') {
				space++;

			}
			i++;
		}
		System.out.println("total white space:" + space);

	}

}
