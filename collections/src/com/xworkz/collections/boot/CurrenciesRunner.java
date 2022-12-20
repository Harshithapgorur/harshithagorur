package com.xworkz.collections.boot;

import java.util.Collection;
import java.util.TreeSet;

public class CurrenciesRunner {
	public static void main(String[] args) {
	String currencies1="afghani";
	String currencies2="lek";
	String currencies3="dinar";
	String currencies4="enro";
	String currencies5="newkwanza";
	String currencies6="eastCaribbeandollar";
	String currencies7="peso";
	String currencies8="dram";
	String currencies9="australiandollar";
	String currencies10="manat";
	String currencies11="bahamiandollar";
	String currencies12="taka";
	String currencies13="bahrainDinar";
	String currencies14="ngultrum";
	String currencies15="pula";
	String currencies16="Afghani";
	String currencies17="real";
	String currencies18="lev";
	String currencies19="cfa";
	String currencies20="franc";
	String currencies21="colon";
	String currencies22="euro";
	String currencies23="koruna";
	String currencies24="usDollar";
	String currencies25="birr";
	String currencies26="fiji";
	Collection<String>collection=new TreeSet();
	collection.add(currencies26);
	collection.add(currencies25);
	collection.add(currencies24);
	collection.add(currencies23);
	collection.add(currencies22);
	collection.add(currencies21);
	collection.add(currencies20);
	collection.add(currencies19);
	collection.add(currencies18);
	collection.add(currencies17);
	collection.add(currencies16);
	collection.add(currencies15);
	collection.add(currencies14);
	collection.add(currencies13);
	collection.add(currencies12);
	collection.add(currencies11);
	collection.add(currencies10);
	collection.add(currencies9);
	collection.add(currencies8);
	collection.add(currencies7);
	collection.add(currencies6);
	collection.add(currencies5);
	collection.add(currencies4);
	collection.add(currencies3);
	collection.add(currencies2);
	collection.add(currencies1);
	System.out.println(collection.size());
	collection.clear();
	System.out.println(collection.size());
	}

}
