package com.workz.valentine.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Service;

import com.workz.valentine.dto.ValentineDTO;
import com.workz.valentine.entity.ValentineEntity;
import com.workz.valentine.repository.ValentineRepository;

@Service
public class ValentineServiceImpl implements ValentineService {
	private  ValentineRepository valeneRepository;

	public ValentineServiceImpl() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto) {
		System.out.println("running validate and save in cm service");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		Set<ConstraintViolation<ValentineDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("ConstraintViolatios exists,return ConstraintViolation");
			return violations;
		} else {
			System.out.println("ConstraintViolation does not exists data can be saved");
			//repo
			ValentineEntity entity=new ValentineEntity();
			entity.setName(dto.getName());
			entity.setValentineName(dto.getValentineName());
			entity.setPlaces(dto.getPlaces());
			entity.setGifts(dto.getGifts());
			boolean saved=this.valeneRepository.save(entity);
		System.out.println("Entity data is saved"+saved);
		return Collections.emptySet();
	}
	}

}
