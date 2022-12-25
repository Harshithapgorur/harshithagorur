package com.xworkz.collections.collectionwithdto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SanitizerBoot {

	public static void main(String[] args) {
		SanitizerDTO dto1=new SanitizerDTO("AUS954", "Himalaya", "red", 40);
		SanitizerDTO dto2=new SanitizerDTO("AUS9587", "Dettol", "white", 150);
		SanitizerDTO dto3=new SanitizerDTO("AUS9548", "Savlon", "green", 25);
		SanitizerDTO dto4=new SanitizerDTO("AUS95489", "Lifebuoy", "red", 89);
		SanitizerDTO dto5=new SanitizerDTO("AUS9540", "GoodVibes", "gree", 30);
		SanitizerDTO dto6=new SanitizerDTO("AUS95467", "Tri-Activ", "pink", 250);
		SanitizerDTO dto7=new SanitizerDTO("AUS95478", "Fabia", "blue", 67);
		SanitizerDTO dto8=new SanitizerDTO("AUS954123", "Riyo", "watere", 500);
		SanitizerDTO dto9=new SanitizerDTO("AUS95455", "ayurvedMaster", "wredtere", 350);
		SanitizerDTO dto10=new SanitizerDTO("AUS954875", "zexa", "blue", 180);
		Collection<SanitizerDTO> collection=new ArrayList<SanitizerDTO>();
		collection.add(dto10);
		collection.add(dto9);
		collection.add(dto8);
		collection.add(dto7);
		collection.add(dto6);
		collection.add(dto5);
		collection.add(dto4);
		collection.add(dto3);
		collection.add(dto2);
		collection.add(dto1);
		Iterator<SanitizerDTO> element =collection.iterator();
		while(element.hasNext()) {
			SanitizerDTO ref=element.next();
			if(ref.getPrice()>50) {
				System.out.println("samitizer price "+ref);
				
			}
		}
		Iterator<SanitizerDTO> element1 =collection.iterator();
		while(element.hasNext()) {
			SanitizerDTO ref1=element1.next();
           if(ref1!=null) {
	System.out.println("No one of the element is null in the given pro"+ref1);
}
	
		
		

	}
		Iterator<SanitizerDTO>element2=collection.iterator();
		while(element.hasNext()) {
			SanitizerDTO ref2=element2.next();
			if(ref2.getColor().matches("green")) {
				((Iterator<SanitizerDTO>) ref2).remove();
				System.out.println("Removed element is "+ref2);
			}
			
		}
Iterator<SanitizerDTO>element3=collection.iterator();
while(element.hasNext()) {
	SanitizerDTO ref3=element3.next();
	if(ref3.getPrice()<=50) {
		System.out.println("lesser price of sanitizer"+ref3);
	}
}
Iterator<SanitizerDTO>element4=collection.iterator();
while(element.hasNext()) {
	SanitizerDTO ref4=element4.next();
	if(ref4.getPrice()>=350) {
		System.out.println("Max  price of sanitizer"+ref4);
	}
}
Iterator<SanitizerDTO>element5=collection.iterator();
while(element.hasNext()) {
	SanitizerDTO ref5=element5.next();
	if(ref5.getPrice()<350) {
		System.out.println(" 2nd Max  price of sanitizer"+ref5);
	}
}


	}
}
