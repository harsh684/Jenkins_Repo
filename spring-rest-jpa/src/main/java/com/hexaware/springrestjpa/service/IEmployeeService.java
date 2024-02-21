package com.hexaware.springrestjpa.service;

import java.util.List;

import com.hexaware.springrestjpa.dto.EmployeeDTO;
import com.hexaware.springrestjpa.entities.Employee;

public interface IEmployeeService {

	public Employee addEmployee(EmployeeDTO e);
	
	public Employee updateEmployee(EmployeeDTO e);
	
	public String deleteEmployee(long eid);
	
	public Employee getemployee(long eid);
	
	public List<Employee> getAll();
	
	public Employee getByName(String ename);
	
	public List<Employee> getBySalaryGT(double salary);

	public List<Employee> getBySalarySorted();
	
	public List<Employee> getBySalRange(double min,double max);

	public int deleteByEname(String ename);
}
