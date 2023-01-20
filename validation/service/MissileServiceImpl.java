package com.xworkz.validation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.validation.dto.MissileDTO;
import com.xworkz.validation.repo.MissileRepo;

import lombok.NoArgsConstructor;


@NoArgsConstructor
@Component
public class MissileServiceImpl implements MissileService {
	@Autowired
	private Validator validator;
	private MissileRepo missileRepo;

	@Autowired
	public MissileServiceImpl(MissileRepo missileRepo) {
		this.missileRepo = missileRepo;
	}

       @Override
	public boolean vaildateAndSave(MissileDTO dto) {
		System.out.println("runnind validateAndSave method..");
		System.out.println("Dto " + dto);

		Set<ConstraintViolation<MissileDTO>> violation = this.validator.validate(dto);

		if (!violation.isEmpty()) {
			System.err.println("There are violation errors..");

			violation.forEach(v -> System.err.println(v.getMessage()));
			return false;
		} else {
			System.out.println("Validation is done..");
			boolean saved = this.missileRepo.save(dto);
			return saved;
		}
	}

}
