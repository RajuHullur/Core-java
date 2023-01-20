package com.xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.dto.SoldierDTO;
import com.xworkz.repo.SoldierRepo;


public class SoldierServiceImpl implements SoldierService {

	private SoldierRepo soldierRepo;

	public SoldierServiceImpl() {
		System.out.println("Created SoldierServiceImpl using no-arg Const.......");
	}

	
	

	@Override
	public boolean validateAndSave(SoldierDTO dto) {

		System.out.println("Starting ValidateAndSave");
		System.out.println("DTO Passed " + dto);

		// Factory
		// valid
		// validate

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> voilations = validator.validate(dto);

		if (!voilations.isEmpty()) {
			System.err.println("There is validation errors");
			voilations.forEach(v -> {System.err.println("Voilating message " + v.getMessage());});
			return false;
		} else {
			
			System.out.println("Data is valid...");
			
			return true;
		}
	}
}
