
package com.xworkz.validation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.validation.dto.FirstAidDTO;
import com.xworkz.validation.repo.FirstAidRepo;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component
public class FirstAidServiceImpl implements FirstAidService {

	@Autowired
	private Validator validator;
	private FirstAidRepo firstAidRepo;

	@Autowired
	public FirstAidServiceImpl(FirstAidRepo firstAidRepo) {
		this.firstAidRepo = firstAidRepo;
		System.out.println("created service by passing repo.... from spring");
	}


@Override
	public boolean validateAndSave(FirstAidDTO aidDto) {
		System.out.println("Running validateAndSave ");
		System.out.println("Dto passed " + aidDto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<FirstAidDTO>> violations = this.validator.validate(aidDto);

		if (!violations.isEmpty()) {
			System.err.println("There are violation errors..");
			violations.forEach(v -> System.err.println("Voilating message " + v.getMessage()));
			return false;
		} else {
			System.out.println("Validation is done..");
			boolean saved = this.firstAidRepo.save(aidDto);
			System.out.println("Saved first aid " + saved);
			return saved;
		}
	}
}