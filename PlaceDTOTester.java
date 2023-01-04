package com.xworkz;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.dto1.PlaceDTO;

public class PlaceDTOTester {

	
	public static void main(String[] args) {
		
		PlaceDTO dto1 = new PlaceDTO("Baglkot", "Musium", 16);
		PlaceDTO dto2 = new PlaceDTO("Jog", "Falls", 10);
		PlaceDTO dto3 = new PlaceDTO("Begaluru", "Iskon Temple", 14);
		PlaceDTO dto4 = new PlaceDTO("KumarParvth", "Hills", 18);
		PlaceDTO dto5 = new PlaceDTO("Dharwad", "Univercity", 14);
		
		Collection<PlaceDTO> collection = new ArrayList();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		
		boolean contain = collection.contains(dto3);
		System.out.println("contain or not : " + contain);
		
		boolean equals = dto3.equals(dto5);
		System.out.println("equal or not : " + equals);
}
}
