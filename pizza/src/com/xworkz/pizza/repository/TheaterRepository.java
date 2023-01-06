package com.xworkz.pizza.repository;

import com.xworkz.pizza.dto.TheaterDTO;
import com.xworkz.pizza.exception.InvalidTheaterDataExceptio;


public interface TheaterRepository {
	boolean smart(TheaterDTO dto) throws InvalidTheaterDataExceptio ;

}
