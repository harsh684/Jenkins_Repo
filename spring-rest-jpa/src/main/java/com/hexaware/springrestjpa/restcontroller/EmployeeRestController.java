package com.hexaware.springrestjpa.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestjpa.dto.EmployeeDTO;
import com.hexaware.springrestjpa.entities.Employee;
import com.hexaware.springrestjpa.exception.EmployeeNotFoundException;
import com.hexaware.springrestjpa.service.EmployeeServiceImp;
import com.hexaware.springrestjpa.service.IEmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

	@Autowired
	private IEmployeeService service;
	
	Logger logger = LoggerFactory.getLogger(EmployeeRestController.class);

	
	@PostMapping("/add")
	public Employee insertEmployee(@RequestBody EmployeeDTO e) {
		
		boolean isValid = EmployeeServiceImp.validateData(e);
		
		EmployeeDTO emp = null;
		Employee e1 = null;
		if(isValid) {
			e1 = service.addEmployee(emp);
			
		}
		
		
		return e1;
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody @Valid EmployeeDTO e) {
		return service.updateEmployee(e);
	}
	
	@DeleteMapping("/delete/{eid}")
	public String deleteEmployee(@PathVariable long eid) {
		return service.deleteEmployee(eid);
	}
	
	@GetMapping("/get/{eid}")
	public Employee getemployee(@PathVariable long eid) throws EmployeeNotFoundException {
		Employee emp = service.getemployee(eid);
		if(emp==null) {
			throw new EmployeeNotFoundException();
		}
		
		//debug is not printed cause its level is higher than info
		//and the highest level is set as info in application.properties
		String msg = "EmployeeRestController executing";
		logger.warn(msg);
		logger.info(msg);
		logger.debug(msg);
		return emp;
	}
	
	@GetMapping("/getall")
	public List<Employee> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/getbyname/{ename}")
	public Employee getByName(@PathVariable String ename) {
		return service.getByName(ename);
	}
	
	@GetMapping("/getbysalarygt/{salary}")
	public List<Employee> getBySalarygt(@PathVariable double salary) {
		return service.getBySalaryGT(salary);
	}
	
	@GetMapping("/getbysalarysorted")
	public List<Employee> getBySalarySorted() {
		return service.getBySalarySorted();
	}
	
	@GetMapping("/getsalbyrange/{min}/{max}")
	public List<Employee> getSalByRange(@PathVariable double min,@PathVariable double max) {
		return service.getBySalRange(min,max);
	}
	
	@DeleteMapping("/deletebyename/{ename}")
	public String deleteByEname(@PathVariable String ename) {
		return service.deleteByEname(ename)+" Records deleted";
	}
}
