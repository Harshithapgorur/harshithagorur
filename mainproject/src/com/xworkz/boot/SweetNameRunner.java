package com.xworkz.boot;

import com.xworkz.rain.SweetName;
import com.xworkz.rain.SweetNameImpl;

public class SweetNameRunner {

	public static void main(String[] args) {
	SweetName  sweetName=new SweetNameImpl();
	sweetName.create("aamras");
	sweetName.create("peda");
	sweetName.create("halwa");
	sweetName.create("ladoo");
	sweetName.create("kulfi");
	sweetName.create("jalebi");
	sweetName.create("kheer");
	sweetName.create("rasgulla");
	sweetName.create("barfi");

	}

}
