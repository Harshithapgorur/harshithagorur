package com.xworkz.serves;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.dto.Soldierdto;
import com.xworkz.repository.SoldierRepository;

public class SoldierServesImpl implements SoldierServes {

	public SoldierRepository repo;
	
public void setRepo(SoldierRepository repo) {
		this.repo = repo;
	}


	@Override
	public boolean validateAndSave(Soldierdto dto) {
		System.out.println("executing the validandsave ");
		System.out.println("DTO is:" + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<Soldierdto>> violations = validator.validate(dto);

		if (!violations.isEmpty()) {
			System.err.println("There are validator erros....");
			violations.forEach(v -> {
				System.out.println("Violating message" + v.getMessage());
			});
			return false;

		} else {
			System.out.println("Data is valid");
			
			return true;
		}
	}
}