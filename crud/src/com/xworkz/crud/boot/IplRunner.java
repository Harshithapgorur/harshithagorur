package com.xworkz.crud.boot;

import com.xworkz.crud.constant.TeamName;
import com.xworkz.crud.dto.IplDTO;
import com.xworkz.crud.repository.IplRepository;
import com.xworkz.crud.repository.IplRepositoryIml;

public class IplRunner {

	public static void main(String[] args) {
		IplRepository repository=new IplRepositoryIml();
		IplDTO dto=new IplDTO();
		dto.setCapainName("virat");
		dto.setWins("133");
		dto.setLose("23");
		dto.setTeamcolor("Red");
		repository.create(dto);
	}

}
