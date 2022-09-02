package com.restapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.model.Employee;
import com.restapi.repository.EmployeeRepository;

@Service      //Business logic Operation perform 
public class EmpleyeeServiceImpl implements EmpleyeeService {
	
	@Autowired
	private EmployeeRepository empRepository;

	@Override
	public Employee saveEmp(Employee employee) {
		
		Employee emp = empRepository.save(employee);
		
		return emp;
	}

	@Override
	public List<Employee> getEmployees() {
		
		 return empRepository.findAll();
			
	}

	@Override
	public Optional<Employee> getEmployee(Integer empId) {
		
		return empRepository.findById(empId);
		
	}

	@Override
	public void deleteEmp(Integer empIds) {
		 empRepository.deleteById(empIds);
		
	}

}
