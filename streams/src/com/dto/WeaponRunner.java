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
		System.out.println("madeOn is sorted by ascending");
		Comparator<WeaponDTO> comparator=(p1,p2)->String.compare(p1.getMadeBy(), p2.getMadeOn());
		application.stream().sorted(comparator).forEach(e->System.out.println(e));
		
		
		System.out.println(System.lineSeparator());
		System.out.println("name is sorted by decending");
		application
		.stream()
		.sorted((p1,p2)->p2.getName().compareTo(p1.getMadeBy()))
		.forEach(e->System.out.println(e));

	}

}
