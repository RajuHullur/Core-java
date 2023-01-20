package com.xworkz.validation.repo;


import org.springframework.stereotype.Component;

import com.xworkz.validation.dto.ResortDTO;
import lombok.NoArgsConstructor;
@Component
@NoArgsConstructor
public class ResortRepoImpl implements ResortRepo {
	
	
	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("Running save");
      System.out.println("DTO is saved "+dto);
      return true;
}

}