package com.xworkz.serves;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.FirstAidDTO;
import com.xworkz.dto.MissileDTO;
import com.xworkz.repository.FirstAidRepository;
@Component
public class MissileServersImp implements MissileServers{
	@Autowired
	private Validator validator;
	private FirstAidRepository firstAidRepository;


	@Override
	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("validate the validateAndSave ");
		System.out.println("MissileDTO"+dto);
		Set<ConstraintViolation<MissileDTO>> violations = this.validator.validate(dto);
		return false;
	}

}
