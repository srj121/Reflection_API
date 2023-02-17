package springmicroservice.office.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmicroservice.office.Repository.OfficeRepository;
import springmicroservice.office.bean.Office;

@Service
public class OfficeService {
	@Autowired
	OfficeRepository officeRepository;

//	public Office getEmployeeByEmail(String email) {
//		return officeRepository.getEmployeeByEmail(email);
//	}

	public List<Office> findAll() {
		return officeRepository.findAll();

	}

	public Office addEmp(Office emp) {

		return officeRepository.save(emp);
	}
	
	public List<Office> update () {
		
		return officeRepository.findAll();
	}

//	public Office upadateEmp(Office emp) {
//
//		Office ofc = officeRepository.getEmployeeByEmail(emp.getEmail());
//		ofc.setEmail(emp.getEmail());qc
//			ofc.setleaves(emp.getleaves());
//			ofc.setSalary(emp.getSalary());
//			ofc.setWorkDays(emp.getWorkDays());
//			
//			
//		return officeRepository.save(ofc);
//	}

}
