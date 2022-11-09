package com.xworkz.inheritance.boot;


import com.xworkz.inheritance.childclass.PoliticalChild;
import com.xworkz.inheritance.overclass.PoliticalParty;



public class PoliticalRunner {

	public static void main(String[] args) {
		PoliticalParty child =new PoliticalChild("BJP",1000,"BJ Nagara");
		child.over();
	}

}
