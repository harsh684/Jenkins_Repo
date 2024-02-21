package com.hexaware.springrestjpa.restcontroller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hexaware.springrestjpa.entities.Employee;

import jakarta.persistence.Entity;

@SpringBootTest
class EmployeeRestControllerTest {

//	@Autowired
//	RestTemplate restTemplate;
//	
//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//	}
//
//	@Test
//	void testInsertEmployee() {
//		
//		Employee emp = new Employee(123,"Hehehe",65000);
//		
//		ResponseEntity<Employee> res = restTemplate.postForEntity("http://localhost:8080/api/employees/add", emp , Employee.class);
//		
//		assertNotNull(res.getBody());
//	}
//
//	@Test
//	void testUpdateEmployee() {
//		
//		Employee emp = new Employee(105,"Husn",5000);
//		
//		restTemplate.put("http://localhost:8080/api/employees/update",emp);
//		
//		assertTrue(true);
//	}
//
//	@Test
//	void testDeleteEmployee() {
//		
//		int eid = 105;
//		
//		restTemplate.delete("http://localhost:8080/api/employees/delete/"+eid);
//		
//		assertTrue(true);
//	}
//
//	@Test
//	void testGetemployee() {
//		int eid = 101;
//		
//		ResponseEntity<Employee> response = restTemplate.getForEntity("http://localhost:8080/api/employees/get/"+eid, Employee.class);
//		
//		Employee emp = response.getBody();
//		
//		assertNotNull(emp);
//	}
//
//	@Test
//	void testGetAll() {
//		
//		ResponseEntity<List> res = restTemplate.getForEntity("http://localhost:8080/api/employees/getall", List.class);
//		List<Employee> list = res.getBody();
//		
//		assertTrue(list.size()>0);
//		
//		List<Employee> empList= restTemplate.getForObject("http://localhost:8080/api/employees/getall", List.class);
//	
//		assertNotNull(empList);
//	}

}
