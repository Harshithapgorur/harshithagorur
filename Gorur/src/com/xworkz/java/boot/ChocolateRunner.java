package com.xworkz.java.boot;

import com.xworkz.java.gorur.Chocolate;

public class ChocolateRunner {

	public static void main(String[] args) {
		String[] companyNames= {"Chocs Ahoy","Cheeky,Sugar and Smiles","Terrific Treats"};
        String[] colors= {"browen","black"};
        int[] custamerNumbers= {878997,5437654,432376};
        String[]  materials= {"Cocoa beans", "pure cocoa butter", "cocoa nibs", "cocoa powder"};
        float[] rawmaterials= {456,654,765};
       
         String[] managerName= {"manu","ramu"};
        
         Chocolate chocolate25=new Chocolate("chocs Ahoy", true, 234, "shop", "help", colors, companyNames, materials, rawmaterials, managerName, custamerNumbers);
         
		//Chocolate chocolate25=new Chocolate(, false, 234, "shop", "help", companyNames, colors, materials, custamerNumbers, rawmaterials, managerName);
		
		
		chocolate25.display();
		
        
}
}
