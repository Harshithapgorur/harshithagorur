package com.xworkz.crud.repository;

import java.time.LocalDateTime;
import java.util.Iterator;

import com.xworkz.crud.dto.WarDTO;
import com.xworkz.crud.exception.WarSizeExeededException;

public class WarRepositoryImp implements WarRepository {
	private WarDTO[] wars = new WarDTO[8];
	private int warIndex = 0;



	@Override
	public WarDTO findByStartedByAndStartedWith(String startWith, String startBy) {
		
		return null;
	}

	@Override
	public WarDTO findByStartedGreaterThenOrEqualTo(LocalDateTime date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WarDTO findByStartedLesserThenOrEqualTo(LocalDateTime date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WarDTO findByStartDateAndEndDate(LocalDateTime Start, LocalDateTime End) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean creat(WarDTO warDTO) throws WarSizeExeededException {
		System.out.println("Running the WarDTO");
		for (WarDTO warDTO1 : wars) {//WarDTo custemdatetype warDTO ref war arrayindex
			if(this.warIndex>=this.wars.length) {
				System.out.println("Running the warindex");
				throw new WarSizeExeededException();
				
		}
			this.wars[this.warIndex]=warDTO1;
			System.out.println("Save:"+warDTO1+"save"+this.warIndex);
			warIndex++;
			
			
			}
		return false;
	
	

	
}

	@Override
	public boolean creat(WarDTO[] warDTOS) throws WarSizeExeededException {
		// TODO Auto-generated method stub
		return false;
	}

}
