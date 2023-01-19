package com.xworkz.boot;

import com.xworkz.dto.Soldierdto;
import com.xworkz.serves.SoldierServesImpl;

public class SoldierRunner {

	public static void main(String[] args) {
Soldierdto dto=new Soldierdto("Navy", "India", 20, "karthikgowda24@gmail.com", "karthik");
SoldierServesImpl serves=new SoldierServesImpl();
serves.setRepo(null);
serves.validateAndSave(dto);
	}

}

