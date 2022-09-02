package com.restapi.services;

import java.util.List;
import java.util.Optional;

import com.restapi.model.Employee;

public interface EmpleyeeService {
	
	// All business Methods or logic define
	
	public Employee saveEmp(Employee employee);
	
	public List<Employee> getEmployees();
	
	public Optional<Employee> getEmployee(Integer empId);
	
	public void deleteEmp(Integer empIds);

}
