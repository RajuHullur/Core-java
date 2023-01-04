package com.xworkz;

import java.util.ArrayList;
import java.util.Collection;
import com.xworkz.dto1.HolidayDTO;

public class HolidayDTOTester {
	public static void main(String[] args) {
		
		HolidayDTO dto1 = new HolidayDTO("Gandi jayanthi", "Headmaster", 6);
		HolidayDTO dto2 = new HolidayDTO("Dusshera", "OM", 7);
		HolidayDTO dto3 = new HolidayDTO("NationalHoliday", "BankManager", 2);
		HolidayDTO dto4 = new HolidayDTO("Corona", "Helth Minister", 15);
		HolidayDTO dto5 = new HolidayDTO("New year", "Party", 1);
		
		Collection<HolidayDTO> collection = new ArrayList();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		
		boolean contain = collection.contains(dto4);
		System.out.println("contains or not : " + contain);
		
		boolean equals = dto1.equals(dto5);
		System.out.println("equals or not : " + equals);
}
}
