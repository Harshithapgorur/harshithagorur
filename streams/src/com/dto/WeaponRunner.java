package com.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.dto.constant.Weapontype;

public class WeaponRunner {

	public static void main(String[] args) {

		Collection<WeaponDTO> application=new ArrayList<WeaponDTO>();
		application.add(new WeaponDTO("Pistol", "JHG", "IUY", Weapontype.ARTILLERY));	
		application.add(new WeaponDTO("SIG", "HGF", "vcx", Weapontype.BIOLOGICAL));	
		application.add(new WeaponDTO("FN", "gfd", "jhgf", Weapontype.CHEMICAL));	
		application.add(new WeaponDTO("FranchiSPAS", "hgf", "kjh", Weapontype.COMBAT));	
		application.add(new WeaponDTO("SAF", "jhg", "fvb", Weapontype.RANGED));	
		application.add(new WeaponDTO("MICRO", "jhg", "fvb", Weapontype.HAND_TO_HAND));	
		application.add(new WeaponDTO("HECKLER", "jhg", "fvb", Weapontype.COMBAT));	
		application.add(new WeaponDTO("BRUGGER","jhg", "fvb",  Weapontype.HAND_TO_HAND));	
		application.add(new WeaponDTO("FN90", "jhg", "fvb", Weapontype.RANGED));	
		application.add(new WeaponDTO("IMI", "jhg", "fvb", Weapontype.BIOLOGICAL));	
		application.add(new WeaponDTO("SIG", "jhg", "fvb", Weapontype.ARTILLERY));	
		application.add(new WeaponDTO("AKM", "jhg", "fvb", Weapontype.COMBAT));	
		application.add(new WeaponDTO("AK203","jhg", "fvb", Weapontype.COMBAT));	
		application.add(new WeaponDTO("M4A1", "jhg", "fvb", Weapontype.COMBAT));	
		System.out.println("weaponmane");
		application.stream().sorted().collect(Collectors.toList()).forEach(e->System.out.println(e));
		System.out.println(System.lineSeparator());
		
		
		System.out.println(System.lineSeparator());
		System.out.println("name is sorted by decending");
		application
		.stream()
		.sorted((p1,p2)->p2.getName().compareTo(p1.getMadeBy()))
		.forEach(e->System.out.println(e));
		System.out.println("Print all made by and made on");
		application.stream()
				.forEach(e -> System.out.println("Weapon made by " + e.getMadeBy() + " and made on " + e.getMadeOn()));

		System.out.println("Print all weapon by desc order");
		application.stream().sorted((e1, e2) -> e2.getName().compareTo(e1.getName()))
				.forEach(e -> System.out.println(e.getName()));

		System.out.println("Print all weapon made_By by asce order");
		application.stream().sorted((e1, e2) -> e1.getMadeBy().compareTo(e2.getMadeBy()))
				.forEach(e -> System.out.println(e.getMadeBy()));

		System.out.println("Print all weapon made_On by asce order");
		application.stream().sorted((e1, e2) -> e1.getMadeOn().compareTo(e2.getMadeOn()))
				.forEach(e -> System.out.println(e.getMadeOn()));

		System.out.println("Print all weapon price by asce order");
		application.stream().sorted((e1, e2) -> e1.getType().compareTo(e2.getType()))
				.forEach(e -> System.out.println(e.getType()));

		System.out.println("Print all weapon price by desc order");
		application.stream().sorted((e1, e2) -> e2.getType().compareTo(e1.getType()))
				.forEach(e -> System.out.println(e.getType()));

		System.out.println("Print all weapon name and madeOn by asc order");
		application.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.sorted((e1, e2) -> e1.getMadeOn().compareTo(e2.getMadeOn())).forEach(
						e -> System.out.println("Sorted name: " + e.getName() + " and sorted madeOn:" + e.getMadeOn()));

		System.out.println("Print all weapon type, madeBy, name in dese order");
		application.stream().sorted((e1, e2) -> e1.getType().compareTo(e1.getType()))
				.sorted((e1, e2) -> e2.getMadeBy().compareTo(e1.getMadeBy()))
				.sorted((e1, e2) -> e2.getName().compareTo(e1.getName()))
				.forEach(e -> System.out.println("Sorted Type: " + e.getType() + " and sorted madeBy:"
						+ e.getMadeBy() + "and Name is: " + e.getName()));

	}

}
