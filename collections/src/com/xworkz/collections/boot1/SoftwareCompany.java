package com.xworkz.collections.boot1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompany {

	public static void main(String[] args) {
		String company1="SEEKNEO";
		String company2="RENDER INFOTECH";
		String company3="ZINAVO";
		String company4="INDGLOBAL";
		String company5="HONEYCOMB";
		String company6="AARUSYS";
		String company7="VIJANAT";
		String company8="NEXTWEBI";
		String company9="AARUSYS";
		String company10="ZINAVO";
		String company11="VIJANAT";
		String company12="NEXTWEBI";
		String company13="VISTAS";
		String company14="WEBSHARK";
		String company15="VIBRANT";
		String company16="WEBSHARK";
		String company17="WEBBAZAAR";
		String company18="WEBCHILY";
		String company19="SEODIGITZ";
		String company20="VIJANAT";
		Collection<String> company=new ArrayList<String>();
		company.add(company20);
		company.add(company18);
		company.add(company17);
		company.add(company19);
		company.add(company16);
		company.add(company15);
		company.add(company14);
		company.add(company13);
		company.add(company12);
		company.add(company11);
		company.add(company10);
		company.add(company9);
		company.add(company8);
		company.add(company7);
		company.add(company6);
		company.add(company5);
		company.add(company4);
		company.add(company3);
		company.add(company1);
		company.add(company2);
		company.add(company5);
		System.out.println(company.size());
		for (String tree : company) {
			System.out.println(tree);
			
		}
		System.out.println("--------------Iterator--------------------");
		Iterator<String> done=company.iterator();
		while (done.hasNext()) {
			String ok =done.next();
			System.out.println(ok);
			
			
		}
		

		

	}

}
