package com.xworkz.serves;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.FirstAidDTO;
import com.xworkz.dto.Soldierdto;
import com.xworkz.repository.FirstAidRepository;

@Component
public class FirstAidServersImp implements FirstAidServes {
	@Autowired
	private Validator validator;
	private FirstAidRepository firstAidRepository;

	

	@Override
	public boolean validateAndSave(FirstAidDTO dto) {
		System.out.println("running validate and save");
		System.out.println("firstdto" + dto);

		Set<ConstraintViolation<FirstAidDTO>> violations = this.validator.validate(dto);
		return false;
	}

}
