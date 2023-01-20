package com.xworkz.validation.repo;

import org.springframework.stereotype.Component;

import com.xworkz.validation.dto.FirstAidDTO;

import lombok.NoArgsConstructor;
@Component
@NoArgsConstructor
public class FirstAidRepoImpl  implements FirstAidRepo{
	
	@Override
	public boolean save(FirstAidDTO aidDto) {
		System.out.println("running FirstAidDTO ");
		System.out.println("Dto"+aidDto);
		return true;
	}
}
