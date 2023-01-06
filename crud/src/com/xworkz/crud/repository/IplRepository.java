package com.xworkz.crud.repository;

import com.xworkz.crud.dto.IplDTO;
import com.xworkz.crud.exception.ArraylengthiIsFull;

public interface IplRepository {
	boolean create(IplDTO dto) throws ArraylengthiIsFull;

	default int total() {
		return 0;
	}
	
	}

