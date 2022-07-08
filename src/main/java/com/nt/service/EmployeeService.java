package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository emrepo;
	
	public Employee saveEmployee(Employee em) {
		Employee st = emrepo.save(em);
		return st;
	}
	public Employee getEmployeeById(int id) {
		Optional<Employee> optinal = emrepo.findById(id);
		Employee eee=null;
		if(optinal.isPresent()) {
			eee=optinal.get();
		}
		return eee;
	}

}
