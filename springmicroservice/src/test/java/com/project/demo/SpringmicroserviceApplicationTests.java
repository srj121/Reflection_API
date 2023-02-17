package com.project.demo;



import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import springmicroservice.office.Repository.OfficeRepository;

@SpringBootTest
@WebMvcTest
class SpringmicroserviceApplicationTests {

	@Autowired
	MockMvc mockmvc;
	
	@MockBean
	OfficeRepository userrepo;
	
	@Test
	public void contextLoads() throws Exception {
		
//		Mockito.when(OfficeRepository.)
//		
		
MvcResult mvcresult = mockmvc.perform(MockMvcRequestBuilders.get("/all/")
				.accept(MediaType.APPLICATION_JSON)
				).andReturn();
		
		System.out.println(mvcresult.getResponse());
		
//		Mockito.verify(OfficeRepository).
		
	}

}
