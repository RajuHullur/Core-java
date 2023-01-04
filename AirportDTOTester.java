package com.xworkz;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.dto1.AirportDTO;

public class AirportDTOTester {
	
	public static void main(String[] args) {
		
		AirportDTO dto1 = new AirportDTO("Kempegouda", "Banglore", 500D);
		AirportDTO dto2 = new AirportDTO("Bajpe", "Manglore", 700D);
		AirportDTO dto3 = new AirportDTO("LalbahaddurShastri", "Belagavi", 1050D);
		AirportDTO dto4 = new AirportDTO("Kuvempu", "Hubli", 950D);
		AirportDTO dto5 = new AirportDTO("Indiragandhi", "Hubli", 690D);
		
		Collection<AirportDTO> collection = new ArrayList();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		
		boolean contain = collection.contains(dto4);
		System.out.println("check value contains or not : " + contain);
		
		boolean equal = dto1.equals(dto2);
		System.out.println("equal or not : " + equal);
		
		boolean equals = dto4.equals(dto5);
		System.out.println("places are equal or not : " + equals);
	}
}

