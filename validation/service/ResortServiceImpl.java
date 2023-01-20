package com.xworkz.validation.service;



import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.validation.dto.ResortDTO;
import com.xworkz.validation.repo.ResortRepo;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class ResortServiceImpl  implements ResortService{

	
	@Autowired
	private Validator validator;
	@Autowired
	private ResortRepo resortRepo;
	
	@Autowired
	public ResortServiceImpl(ResortRepo resortRepo) {
		this.resortRepo = resortRepo;
	}


	
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("running validateAndSave method");
		System.out.println("Dto " + dto);
		
		Set<ConstraintViolation<ResortDTO>> violation = this.validator.validate(dto);
		
		if(!violation.isEmpty()) {
			System.err.println("There are no violation errors..");
			
			violation.forEach(v -> System.err.println(v.getMessage()));
			return false;
		}
		else {
			System.out.println("Data is valid..");
			boolean saved = this.resortRepo.save(dto);
			System.out.println("saved " + saved);
			return saved;
}
	}
}
