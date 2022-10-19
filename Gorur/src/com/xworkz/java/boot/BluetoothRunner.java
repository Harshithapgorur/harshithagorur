package com.xworkz.java.boot;

import com.xworkz.java.gorur.Bluetooth;


public class BluetoothRunner {

	public static void main(String[] args) {
		String[] colors= {"gray", "blue","pink"};
		String [] brands= {"samsung", "sony"};
		String[] bluetoothcompany= {"oneplus","mivi"};
		long[] ownersNumbers= {78198089990l, 98202801837l};
		String[] password= {"ahhs"};
		String[] connentedDevices= {"In23"};
		 Bluetooth bluetooth= new Bluetooth("sony",56, 200, true, colors, brands, bluetoothcompany, connentedDevices, ownersNumbers, password, null, ownersNumbers);
		
		
		bluetooth.display();
		 
			
		
	}

	




	}


