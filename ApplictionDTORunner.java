package com.xworkz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collectioninterface.ApplicationDTO;

public class ApplictionDTORunner {


	public static void main(String[] args) {
		
		ApplicationDTO dto1 = new ApplicationDTO("Whatsapp", 4D, true, "Jan Koum", 20000D);
		ApplicationDTO dto2 = new ApplicationDTO("Instagram", 5D, true, "Google", 600000D);
		ApplicationDTO dto3 = new ApplicationDTO("Snpap", 6D, true, "Brown", 5000000D);
		ApplicationDTO dto4 = new ApplicationDTO("Facebook", 7D, false, "Markzuckenberg", 7000000D);
		ApplicationDTO dto5 = new ApplicationDTO("Twitter", 8D, false, "Google", 800000D);
		
		Collection<ApplicationDTO> collection = new ArrayList();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		
		collection
		.stream()
		.filter(e -> e.isFree())
		.collect(Collectors.toList())
		.forEach(e -> System.out.println("free applications " + e));
		
		System.out.println("=====another stream..");
		collection
		.stream()
		.map((e)-> {
			if(e.getDevelopedBy() == "Google")
				return e;
			    return "NA";})
		.collect(Collectors.toList())
		.forEach(e -> System.out.println(e));
		
		System.out.println("====another stream...");
		collection
		.stream()
		.map((e) -> {
			if(e.getVesion() > 5D)
				return e;
			return "NA"; })
		.collect(Collectors.toList())
		.forEach(e -> System.out.println(e));
		
		System.out.println("======another stream...");
		collection
		.stream()
		.map(e -> e.getName())
		.collect(Collectors.toList())
		.forEach(e -> System.out.println(e));
}
}
