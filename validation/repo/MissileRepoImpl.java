package com.xworkz.validation.repo;

import org.springframework.stereotype.Component;

import com.xworkz.validation.dto.MissileDTO;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class MissileRepoImpl implements MissileRepo {
	 

	@Override
	public boolean save(MissileDTO dto) {
	System.out.println("Running MissileDTO Save");
	System.out.println("Dto" +dto);
	return true;
	}
   
}
