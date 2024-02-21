package com.hexaware.springrestjpa.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.springrestjpa.dto.EmployeeDTO;
import com.hexaware.springrestjpa.entities.Employee;

@SpringBootTest
class EmployeeServiceImpTest {

//	Logger logger = LoggerFactory.getLogger(EmployeeServiceImpTest.class);
//	
//	@Autowired
//	IEmployeeService service;
//	
//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//	}
//
//	@Test
//	void testAddEmployee() {
//
//		EmployeeDTO e = new EmployeeDTO(105,"Testuserr",1000);
//		//assertEquals(e, service.addEmployee(e));
//		assertNotNull(service.addEmployee(e));
//		
//		logger.info("Employee added succesfully");
//	}
//
//	@Test
//	void testUpdateEmployee() {
//		EmployeeDTO e = new EmployeeDTO(105,"Testupdat",1000);
//		assertNotNull(service.updateEmployee(e));
//	}
//
//	@Test
//	void testGetAll() {
//		List<Employee> list = service.getAll();
//	
//		
//		assertFalse(list.isEmpty());
//	}
//	
//	@Test
//	void testGetEmployee() {
//		Employee emp = service.getemployee(101);
//		
//		assertEquals("Harsh Dangi",emp.getEname());
//	}

}
