package com.restapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.model.Employee;
import com.restapi.services.EmpleyeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmpController {
	
	@Autowired
	private EmpleyeeServiceImpl empService;
	
	@PostMapping("/saveEmp")   //Url : http://localhost:8585/employee/saveEmp
	public Employee saveEmployeeData(@RequestBody Employee employee)
	{
		Employee saveEmp = empService.saveEmp(employee);
		return saveEmp;
	}
	
	
	@GetMapping("/getEmps")   //Url : http://localhost:8585/employee/getEmps
	public List<Employee> getEmployeesData()
	{
		return empService.getEmployees();
	}
	
	
	@GetMapping("/getEmp/{empId}")  //Url : http://localhost:8585/employee/getEmp
	public Optional<Employee> getById(@PathVariable Integer empId)
	{
		return empService.getEmployee(empId);
	}
	
	
	@DeleteMapping("/deleteEmp/{empId}")  //Url : http://localhost:8585/employee/deleteEmp/102
	public void deleteById(@PathVariable Integer empId)
	{
		empService.deleteEmp(empId);
		
	}
	

}
