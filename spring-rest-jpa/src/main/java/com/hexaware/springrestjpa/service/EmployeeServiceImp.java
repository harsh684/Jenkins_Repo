package com.hexaware.springrestjpa.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.hexaware.springrestjpa.dto.EmployeeDTO;
import com.hexaware.springrestjpa.entities.Employee;
import com.hexaware.springrestjpa.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional //cause we are using DML custom query(deleteByEname()) and we have to handle transaction in service layer
public class EmployeeServiceImp implements IEmployeeService {

	Logger logger = LoggerFactory.getLogger(EmployeeServiceImp.class);

	@Autowired
	EmployeeRepository repo;
	
	@Override
	public Employee addEmployee(EmployeeDTO e) {
		
		logger.info(e+" is added from addEmployee()");
		Employee emp = new Employee(e.getEid(),e.getEname(),e.getSalary());
		return repo.save(emp);
	}

	@Override
	public Employee updateEmployee(EmployeeDTO e) {
		Employee emp = new Employee(e.getEid(),e.getEname(),e.getSalary());
		return repo.save(emp);
	}

	@Override
	public String deleteEmployee(long eid) {
		
		repo.deleteById(eid);
		logger.warn("inside service employee deleted");
		return "Record deleted";
	}

	@Override
	public Employee getemployee(long eid) {

		logger.info("inside service getbyid executing");
		return repo.findById(eid).orElse(null);
	}

	@Override
	public List<Employee> getAll() {
		
		logger.info("inside service getall executing");
		return repo.findAll();// from listcrudrepository
	}

	@Override
	public Employee getByName(String ename) {
		return repo.findByEname(ename);
	}

	@Override
	public List<Employee> getBySalaryGT(double salary) {
		
		return repo.findBySalaryGreaterThan(salary);
	}
	
	@Override
	public List<Employee> getBySalarySorted() {
		
		//repo.findAll(Sort.by("salary"))
		return repo.findAll(Sort.by(Order.asc("salary")));
	}

	@Override
	public List<Employee> getBySalRange(double min, double max) {
		return repo.getBySalRange(min, max);
	}

	@Override
	public int deleteByEname(String ename) {

		return repo.deleteByEname(ename);
	}

	
	
	//input validation
	public static boolean validateData(EmployeeDTO e) {
		boolean flag = false;
		if(e.getEid()>99 && e.getSalary()>1000 && e.getEname().equals(e.getEname().toUpperCase())) {
			flag=true;
		}
		return flag;
	}
	
}
