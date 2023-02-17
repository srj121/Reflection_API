package com.springmicroservice.office.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.springmicroservice.office.Repository.OfficeRepository;
import com.springmicroservice.office.bean.Office;

public class OfficeService{
	@Autowired
	OfficeRepository officeRepository;
	
	public Office getEmployeeByEmail(String email) {
		return officeRepository.getEmployeeByEmail(email);
		
	}

}
