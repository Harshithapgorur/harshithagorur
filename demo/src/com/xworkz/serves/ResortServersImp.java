package com.xworkz.serves;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.MissileDTO;
import com.xworkz.dto.ResortDTO;
import com.xworkz.repository.FirstAidRepository;
@Component
public class ResortServersImp implements ResortServers{
	@Autowired
	private Validator validator;
	private FirstAidRepository firstAidRepository;


	@Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("validate the validateAndSave ");
		System.out.println("ResortDTO"+dto);
		Set<ConstraintViolation<ResortDTO>> violations = this.validator.validate(dto);
		return false;
	}

}
