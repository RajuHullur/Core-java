package com.xworkz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collectioninterface.PalaceDTO;

public class PalaceDTORunner {

public static void main(String[] args) {
		
		PalaceDTO dto1 = new PalaceDTO("Bengaluru", "Bengaluru", "Karthik", false, 100);
		PalaceDTO dto2 = new PalaceDTO("Mysore", "Mysore", "Arun", true, 00);
		PalaceDTO dto3 = new PalaceDTO("Lalit", "Mysore", "Vinoda", true, 200);
		PalaceDTO dto4 = new PalaceDTO("Parapa", "Bengaluru", "Prashanth", true, 500);
		PalaceDTO dto5 = new PalaceDTO("Tippusultan", "Mandya", "Vinay", true, 300);
		
		Collection<PalaceDTO> collection = new ArrayList<PalaceDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		
		collection
		.stream()
		.filter(e -> !e.isDestroyed())
		.collect(Collectors.toList())
		.forEach(e -> System.out.println(e));
		
		System.out.println("====another stream===");
		collection
		.stream()
		.map(e -> e.getName())
		.collect(Collectors.toList())
		.forEach(name -> System.out.println(name));
		
		System.out.println("======another stream...");
		collection
		.stream()
		.filter(e -> e.getName().endsWith("a"))
		.map(e -> e.getPrice())
		.collect(Collectors.toList())
		.forEach(e -> System.out.println(e));
	}

}

