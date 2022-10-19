package com.xworkz.java.boot;

import com.xworkz.java.gorur.Phone;

public class PhoneRunner {

	public static void main(String[] args) {
		
		
				String[] colors= {"gray", "blue","black"};
				String [] brands= {"samsung", "sony"};
				String[] phonecompany= {"oneplus","mivi"};
				long[] ownersNumbers= {78198089990l, 98202801837l};
				String[] password= {"ah877hs"};
				String[] phoneconnentedDevices= {"In98723"};
				Phone phone= new Phone("sony", 69, 10000, true, colors, brands, phonecompany, phoneconnentedDevices, ownersNumbers, password, null);
				
				
				
		
				 phone.display();
					
				
			}

			




			

	}


