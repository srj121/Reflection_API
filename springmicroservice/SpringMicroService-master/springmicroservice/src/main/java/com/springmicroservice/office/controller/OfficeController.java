package com.springmicroservice.office.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmicroservice.office.Repository.OfficeRepository;
import com.springmicroservice.office.bean.Office;

@RestController
public class OfficeController {
	
	@Autowired
	OfficeRepository officerepo;
	
	@GetMapping("/getemp")
	public List<Office> getAllEmployee(){
		return officerepo.findAll();
	}
	
	@PutMapping("/updateEmployee")
	public Office UpdateEmployee(String email) {
		
		return null;
	}
}
