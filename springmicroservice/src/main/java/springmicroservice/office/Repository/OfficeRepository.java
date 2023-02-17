package springmicroservice.office.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import springmicroservice.office.bean.Office;

public interface OfficeRepository extends MongoRepository<Office, String>{

	 public Office getEmployeeByEmail(String email);
}


