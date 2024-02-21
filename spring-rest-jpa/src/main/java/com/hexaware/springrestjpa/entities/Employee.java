package com.hexaware.springrestjpa.entities;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;

@Component
@Entity
@Table(name="employee_info")
public class Employee {

	@Id
	@Min(100)
	private long eid;
	
	//1st letter uppercase next letters min 3 and max 10 lowercase letters
	@Pattern(regexp = "^[A-Z][a-z]{3,10}") 
	private String ename;
	
	@Min(500)
	@Max(50000)
	private double salary;
	
	public Employee() {
		super();
	}
	
	public Employee(long eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	
	public long getEid() {
		return eid;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
}
