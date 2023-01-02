package com.boot;

import java.util.Collection;
import java.util.LinkedList;

import java.util.stream.Collectors;

import com.streams.ApplicationDTO;

public class ApplicationRunner {

	public static void main(String[] args) {
		Collection<ApplicationDTO> application = new LinkedList<ApplicationDTO>();
		application.add(new ApplicationDTO("Instagram", 2.2, true, "kevin systrom", 2.4d));
		application.add(new ApplicationDTO("FaceBook", 5.4, true, "facebook.com", 2.8d));
		application.add(new ApplicationDTO("Google", 9.4, true, "google.com", 0));
		application.add(new ApplicationDTO("FaceBook", 5.4, false, "google.com", 2.8d));
		application.stream()
.filter(ele -> ele.isFree() != false || ele.getDevelopedBy() == "Google" || ele.getVersion() > 5)
.collect(Collectors.toSet()).forEach(dto -> System.out.println(dto));
		application.stream().collect(Collectors.toSet()).forEach(dto -> System.out.println(dto.getName()
				));	
	}

}
