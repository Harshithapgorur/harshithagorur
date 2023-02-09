package com.xwork.bekery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xwork.bekery.dto.BakeryDTO;
import com.xwork.bekery.service.BekeryService;

@Component
@RequestMapping("/bake")
public class BakeryController {
	@Autowired
	private BekeryService  service;
	
public BakeryController() {
	System.out.println("cerated"+this.getClass().getSimpleName());
}
@PostMapping
public String onBekery(BakeryDTO dto,Model model) {
	System.out.println("running onBekery"+dto);
	model.addAttribute("name",dto.getBakeryName());
	model.addAttribute("ownername",dto.getOwnerName());
	model.addAttribute("wifeName",dto.getWifeName());
	model.addAttribute("married",dto.isMarried());
	model.addAttribute("famousFor",dto.getFamousFor());
	model.addAttribute("sinece",dto.getBakerySince());
	
	return "bakerysuccess.jsp";
	
}
}
