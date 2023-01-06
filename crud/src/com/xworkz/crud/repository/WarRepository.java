package com.xworkz.crud.repository;

import java.time.LocalDateTime;

import com.xworkz.crud.dto.WarDTO;
import com.xworkz.crud.exception.WarSizeExeededException;

public  interface WarRepository {
	boolean creat(WarDTO warDTO) throws WarSizeExeededException;
	default int total() {
		return 0;
		
	}
	boolean creat(WarDTO[] warDTOS) throws WarSizeExeededException;
	
	default WarDTO findByStartedBy(String startedBy)
			 {
		return null;
		
	}
	
	
	 WarDTO findByStartedByAndStartedWith(String startWith,String startBy) ;
	 WarDTO findByStartedGreaterThenOrEqualTo(LocalDateTime date);
	 WarDTO findByStartedLesserThenOrEqualTo(LocalDateTime date);
	 WarDTO findByStartDateAndEndDate(LocalDateTime Start ,LocalDateTime End);

}
