package com.xworkz.crud.boot;

import java.time.LocalDateTime;


import com.xworkz.crud.constant.TeamName;
import com.xworkz.crud.dto.IplDTO;
import com.xworkz.crud.exception.ArraylengthiIsFull;
import com.xworkz.crud.repository.IplRepository;
import com.xworkz.crud.repository.IplRepositoryIml;

public class IplRunner {

	public static void main(String[] args) throws ArraylengthiIsFull {
		IplRepository repository = new IplRepositoryIml();
		IplDTO dto = new IplDTO();
		dto.setCapainName("virat");
		dto.setWins("133");
		dto.setLose("23");
		dto.setTeamcolor("Red");
		dto.setTeamcolor("pink");
		dto.setTeamcolor("blue");
		dto.setCreatedBy("system");
		dto.setCreatedDate(LocalDateTime.now());
		System.out.println("\n");

		repository.create(dto);
		dto.setCapainName("rohit sharam");
		dto.setWins("133jc");
		dto.setLose("23po");
		dto.setTeamcolor("Red");
		dto.setTeamcolor("pink");
		dto.setTeamcolor("blue");
		dto.setCreatedBy("system");
		dto.setCreatedDate(LocalDateTime.now());
		System.out.println("\n");
		
		repository.create(dto);
		dto.setCapainName("dhoni");
		dto.setWins("133jc");
		dto.setLose("23po");
		dto.setTeamcolor("Red");
		dto.setTeamcolor("pink");
		dto.setTeamcolor("blue");
		dto.setCreatedBy("system");
		dto.setCreatedDate(LocalDateTime.now());
		System.out.println("\n");
		
		repository.create(dto);
		dto.setCapainName("karthik");
		dto.setWins("133jc");
		dto.setLose("23po");
		dto.setTeamcolor("Red");
		dto.setTeamcolor("pink");
		dto.setTeamcolor("blue");
		dto.setCreatedBy("system");
		dto.setCreatedDate(LocalDateTime.now());
		System.out.println("\n");
		
		repository.create(dto);
		dto.setCapainName("rishabh");
		dto.setWins("133jc");
		dto.setLose("23po");
		dto.setTeamcolor("Red");
		dto.setTeamcolor("pink");
		dto.setTeamcolor("blue");
		dto.setCreatedBy("system");
		dto.setCreatedDate(LocalDateTime.now());
		System.out.println("\n");
		
		repository.create(dto);
		dto.setCapainName("miank agarvall");
		dto.setWins("133jc");
		dto.setLose("23po");
		dto.setTeamcolor("Red");
		dto.setTeamcolor("pink");
		dto.setTeamcolor("blue");
		dto.setCreatedBy("system");
		dto.setCreatedDate(LocalDateTime.now());
		System.out.println("\n");
		
		repository.create(dto);
		dto.setCapainName("JD");
		dto.setWins("133jc");
		dto.setLose("23po");
		dto.setTeamcolor("Red");
		dto.setTeamcolor("pink");
		dto.setTeamcolor("blue");
		dto.setCreatedBy("system");
		dto.setCreatedDate(LocalDateTime.now());
		System.out.println("\n");
		
		repository.create(dto);
		dto.setCapainName("rohit");
		dto.setWins("133jc");
		dto.setLose("23po");
		dto.setTeamcolor("Red");
		dto.setTeamcolor("pink");
		dto.setTeamcolor("blue");
		dto.setCreatedBy("system");
		dto.setCreatedDate(LocalDateTime.now());
		System.out.println("\n");
		
		repository.create(dto);
		dto.setCapainName(" sharam");
		dto.setWins("133jc");
		dto.setLose("23po");
		dto.setTeamcolor("Red");
		dto.setTeamcolor("pink");
		dto.setTeamcolor("blue");
		dto.setCreatedBy("system");
		dto.setCreatedDate(LocalDateTime.now());
		System.out.println("\n");
		
		repository.create(dto);
		dto.setCapainName("pandy");
		dto.setWins("133jc");
		dto.setLose("23po");
		dto.setTeamcolor("Red");
		dto.setTeamcolor("pink");
		dto.setTeamcolor("blue");
		dto.setCreatedBy("system");
		dto.setCreatedDate(LocalDateTime.now());
		System.out.println("\n");
		
		repository.create(dto);
		dto.setCapainName("rohit sharam");
		dto.setWins("133jc");
		dto.setLose("23po");
		dto.setTeamcolor("Red");
		dto.setTeamcolor("pink");
		dto.setTeamcolor("blue");
		dto.setCreatedBy("system");
		dto.setCreatedDate(LocalDateTime.now());
		System.out.println("\n");
	}
	
	
	
	}

