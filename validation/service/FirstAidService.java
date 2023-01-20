package com.xworkz.validation.service;

import com.xworkz.validation.dto.FirstAidDTO;

public interface FirstAidService {
	
	boolean validateAndSave(FirstAidDTO aidDto);

}
