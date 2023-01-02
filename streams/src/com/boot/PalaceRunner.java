package com.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.streams.PalaceDTO;

public class PalaceRunner {

	public static void main(String[] args) {
		Collection<PalaceDTO> palaceDTO = new LinkedList<PalaceDTO>();
		palaceDTO.add(new PalaceDTO("Bangalore Palace", "Bangalore", "Chamaraja Wadiyar", "King", 200));
		palaceDTO.add(new PalaceDTO("Mysore Palace", "Mysore", "Chamaraja", "Govt", 500));
		palaceDTO.add(new PalaceDTO("Hassan Palace", "Hassan", "Chamaraja Wadiyar", "King", 200));
		palaceDTO.add(new PalaceDTO("Lalitha  Palace", "", "Bangalore", "Govt", 500));

		palaceDTO.stream().filter(dto -> dto.getDestroyed()).collect(Collectors.toList())
				.forEach(dto -> System.out.println(dto));

	}

}
