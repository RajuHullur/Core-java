package com.xworkz;

import java.util.ArrayList;
import java.util.Collection;
import com.xworkz.dto1.GameDTO;

public class GameDTOTester {

	public static void main(String[] args) {
		
		GameDTO dto1 = new GameDTO("Kabbaddi", 7, "outdoor");
		GameDTO dto2 = new GameDTO("Kho Kho", 4, "indoor");
		GameDTO dto3 = new GameDTO("Cricket", 11, "outdoor");
		GameDTO dto4 = new GameDTO("Ludo", 2, "indoor");
		GameDTO dto5 = new GameDTO("Kabbaddi", 0, null);
		
		Collection<GameDTO> collection = new ArrayList();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		
		boolean contain = collection.contains(dto5);
		System.out.println(contain);
		
		boolean contains = collection.contains(dto3);
		System.out.println(contains);
		
		boolean equals = dto1.equals(dto5);
		System.out.println("check both are equal or not : " + equals);
		
		boolean equal = dto2.equals(dto4);
		System.out.println("check equal or not : " + equal);
		
		boolean check = dto1.equals(dto2);
		System.out.println("check the type : " + check);
}
}
