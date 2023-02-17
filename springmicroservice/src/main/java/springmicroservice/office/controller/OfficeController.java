package springmicroservice.office.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springmicroservice.office.bean.Office;
import springmicroservice.office.service.OfficeService;

@RestController
public class OfficeController {

	@Autowired
	OfficeService officeserv;
	
	//Logger with sl4j interface
	public static Logger log = LoggerFactory.getLogger(OfficeController.class);

	

	
	@GetMapping("/getemp")
	public List<Office> getAllEmployee() {
		log.info("getAllEmployee method accessed in Controller class");
		return officeserv.findAll();
	}
	
	
//	@GetMapping("/getempbyemail/{email}")
//	public List<Office> getAllEmployeeByEmail(@PathVariable ("email") @RequestBody Office office) {
//		return officeserv.findAll(email);
//	}

	@PostMapping("/postemp")
	public Office addEmployees(@RequestBody Office emp) {
		log.info("addEmployees method accessed in Controller class");
		return officeserv.addEmp(emp);

	}

//	@PutMapping("/updateEmployee/{email}")
//	public Office UpdateEmployee(@PathVariable ("email") String email,@RequestBody  Office emp) {
//
//				return officeserv.upadateEmp(emp);
//
//	}
}
