package com.xworkz.validation.service;

import com.xworkz.validation.dto.ResortDTO;

public interface ResortService {
  boolean validateAndSave(ResortDTO dto);
}
