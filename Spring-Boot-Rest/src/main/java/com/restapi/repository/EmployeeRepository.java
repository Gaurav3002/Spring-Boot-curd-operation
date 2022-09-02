package com.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.restapi.model.Employee;

@Repository  // optional
//Store persistance logic 
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	//Custome Qury

}
