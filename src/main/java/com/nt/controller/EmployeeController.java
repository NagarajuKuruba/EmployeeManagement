package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Employee;
import com.nt.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService emser;
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee em) {
		
		Employee emp=emser.saveEmployee(em);
		return emp;
	}
	
	

}
