package com.xworkz.repo;

import com.xworkz.dto.SoldierDTO;

public class SoldierRepoImpl implements SoldierRepo {
	
	public SoldierRepoImpl() {
		System.out.println("Created SoldierRepoImpl using no-arg constructer ");
		
	}
	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("Running save");
      System.out.println("DTO is saved "+dto);
      return true;
	}
}
