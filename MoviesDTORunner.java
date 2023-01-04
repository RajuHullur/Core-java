package com.xworkz;



import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.collectioninterface.MoviesDTO;

public class MoviesDTORunner {

	public static void main(String[] args) {
		
		MoviesDTO dto1 =new MoviesDTO("Kantara", 600,"Kannada",  80, LocalDate.of(2000,10,20));
		MoviesDTO dto2 =new MoviesDTO("RRR", 3000,"Kannada",  60, LocalDate.of(2000,1,28));
		MoviesDTO dto3 =new MoviesDTO("KGF", 800,"Kannada",  30, LocalDate.of(2000,11,25));
		MoviesDTO dto4 =new MoviesDTO("Rana", 700,"Kannada",  50, LocalDate.of(2000,10,27));
	
	
	Collection<MoviesDTO> collection = Stream.of(dto1, dto2, dto3, dto4).collect(Collectors.toList());
	System.out.println("Sorting names in ascending order......");
	collection
	.stream()
	.sorted((a1, a2) -> a1.getName().compareTo(a2.getName()))
	.forEach(e -> System.out.println(e));
	
	
	
	System.out.println("Sorted names in descending oredr......");
	collection
	.stream()
	.sorted((a1, a2) -> a2.getName().compareTo(a1.getName()))
	.forEach(e -> System.out.println(e));
	
	
	
	System.out.println("Sorted budget in asc order.....");
	Comparator<MoviesDTO> comparator = (a1,a2) -> Double.compare(a1.getBuget(), a2.getBuget());
			collection
			.stream()
			.sorted(comparator)
			.forEach(e -> System.out.println(e));
			
			
			
	System.out.println("Sorted budget in dec order.....");
	Comparator<MoviesDTO> comparator1 = (a1, a2) -> Double.compare(a2.getBuget(), a1.getBuget());
	collection
	.stream()
	.sorted(comparator1)
	.forEach(e -> System.out.println(e));
	
	
		
	System.out.println("Sorted language in acs order");
	collection
	.stream()
	.sorted((a1, a2) -> a2.getLanguage().compareTo(a1.getLanguage()))
	.forEach(e -> System.out.println(e));
}
}


