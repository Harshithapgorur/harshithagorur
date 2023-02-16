package com.workz.valentine.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.workz.valentine.dto.ValentineDTO;

public interface ValentineService {
	Set<ConstraintViolation<ValentineDTO>> validateAndSave(ValentineDTO dto);

}
