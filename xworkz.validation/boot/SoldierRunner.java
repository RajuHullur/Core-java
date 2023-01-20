package com.xworkz.boot;

import com.xworkz.dto.SoldierDTO;
import com.xworkz.repo.SoldierRepo;
import com.xworkz.repo.SoldierRepoImpl;
import com.xworkz.service.SoldierService;
import com.xworkz.service.SoldierServiceImpl;

public class SoldierRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SoldierDTO dto = new SoldierDTO("Manju", 1, "Topper", "Reva", "Kundapur");

		SoldierService service = new SoldierServiceImpl();
		SoldierRepo soldier = new SoldierRepoImpl();
		service.validateAndSave(dto);
		soldier.save(dto);
	}
}
