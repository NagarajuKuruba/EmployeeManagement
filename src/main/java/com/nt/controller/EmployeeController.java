package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Employee;
import com.nt.service.EmployeeService;

@RestController
@RequestMapping("Employee")
public class EmployeeController {
	@Autowired
	private EmployeeService emser;
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee em) {
		
		Employee emp=emser.saveEmployee(em);
		return emp;
	}
	@GetMapping("get/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {
		Employee ee = emser.getEmployeeById(id);
		return ee;
	}
	@GetMapping("/get/all")
	public List<Employee> getEmoployeeDetails(){
		return emser.getEmployeeDetails();
	}
	

}
