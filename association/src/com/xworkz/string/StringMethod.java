package com.xworkz.string;

public class StringMethod {


	public static void main(String[] args) {
		
		String n="harshitha";
		n.charAt(2);
		System.out.println(n.charAt(2));
		
		n.toUpperCase();
		System.out.println(n.toUpperCase());
		
		String h="sahana";
		//System.out.println(n.concat());
		String a=n.concat(h);
		System.out.println(a);
		
		String c="tree";
		System.out.println("tree formated");
		String b=n.formatted(c);
		System.out.println(b);
		
		n.length();
		System.out.println(n.length());
		
		String t=" ";
		t.isBlank();
		System.out.println(t.isBlank());
		n.isBlank();
		System.out.println(n.isBlank());
		
		String z="      Karate is my life       ";
		String y=z.stripLeading();
		System.out.println("-----------------"+y);
	z.stripTrailing();
	System.out.println(z.stripTrailing());//out
	
	n.intern();
	System.out.println(n.intern());//out
	
	String q="KARATE IS MY LIFE";
	q.toLowerCase();
	System.out.println(q.toLowerCase());
	
	String x="manjula";
	
	String m="manu";
	      String v="man";
	boolean same= x.startsWith(v);
//	System.out.println(x.startsWith(sahana));
		System.out.println(same);
		x.endsWith("anu");
		System.out.println(x.endsWith("anu"));
	}
	
	
}
