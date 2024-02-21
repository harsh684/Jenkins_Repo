package com.hexaware.springrestjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.springrestjpa.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	public Employee findByEname(String ename);
	//select * from employee_info where ename = ?
	
	public List<Employee> findBySalaryGreaterThan(double salary);
	
	
	//writing custom queries in spring data JPA
	/*@Query(value="select * from Employee e where e.salary Between ? and ?"
	nativeQuery=true) for native query*/
	@Query("select e from Employee e where e.salary Between ?1 and ?2")//jpql query
	List<Employee> getBySalRange(double min,double max);

	@Modifying //because it is a DML query
	@Query("delete from Employee e where e.ename = ?1")
	int deleteByEname(String ename);
	
}
