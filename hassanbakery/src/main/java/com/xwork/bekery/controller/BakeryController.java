package com.xwork.bekery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xwork.bekery.dto.BakeryDTO;
import com.xwork.bekery.service.BakeryService;

@Controller
@RequestMapping("/bake")
public class BakeryController {
	@Autowired
	private BakeryService service;
public BakeryController() {
	System.out.println("created "+this.getClass().getSimpleName());
}
@PostMapping
public String onBake(BakeryDTO dto,Model model) {
	System.out.println("running on bake "+dto );
	model.addAttribute("bakeryName",dto.getBakeryName());
	model.addAttribute("ownerName",dto.getOwnerName());
	model.addAttribute("wifeName",dto.getWifeName());
	model.addAttribute("married",dto.isMarried());
	model.addAttribute("bakerySince",dto.getBakerySince());
	model.addAttribute("famousFor",dto.getFamousFor());
	return "bakerySucess.jsp";
	
}
}