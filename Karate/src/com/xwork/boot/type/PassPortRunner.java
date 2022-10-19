package com.xwork.boot.type;

public class PassPortRunner {

	public static void main(String[] args) {
		PassPort PassPort1=new PassPort();
		System.out.println( PassPort1.number);
		System.out.println( PassPort1.name);
		System.out.println( PassPort1.expirydate);
		System.out.println( PassPort1.country);
		System.out.println( PassPort1.issuedate);
		System.out.println( PassPort1.dooleafeo);
		PassPort1.number=(char) 1234567;
		PassPort1.name="happy";
		System.out.println( PassPort1.number);
		System.out.println( PassPort1.name);
		System.out.println( PassPort1.expirydate);
		System.out.println( PassPort1.country);
		System.out.println( PassPort1.issuedate);
		System.out.println( PassPort1.dooleafeo);
		PassPort1.expirydate=12/34/67;
		PassPort1.country="India";
		System.out.println( PassPort1.number);
		System.out.println( PassPort1.name);
		System.out.println( PassPort1.expirydate);
		System.out.println( PassPort1.country);
		System.out.println( PassPort1.issuedate);
		System.out.println( PassPort1.dooleafeo);
		PassPort1.issuedate=12/45/78;
		System.out.println( PassPort1.number);
		System.out.println( PassPort1.name);
		System.out.println( PassPort1.expirydate);
		System.out.println( PassPort1.country);
		System.out.println( PassPort1.issuedate);
		System.out.println( PassPort1.dooleafeo);
		PassPort1.number=(char) 8754332;
		PassPort1.name="sad";
		PassPort1.expirydate=18/98/8;
		PassPort1.country="India";
		PassPort1.issuedate=12/45/78;
		PassPort1.dooleafeo=67;
		System.out.println( PassPort1.number);
		System.out.println( PassPort1.name);
		System.out.println( PassPort1.expirydate);
		System.out.println( PassPort1.country);
		System.out.println( PassPort1.issuedate);
		System.out.println( PassPort1.dooleafeo);

	}



	}


