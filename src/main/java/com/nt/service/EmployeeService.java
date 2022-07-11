package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nt.model.Employee;
import com.nt.repository.EmployeeRepository;

import lombok.Delegate;

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
	public List<Employee> getEmployeeDetails() {
		return emrepo.findAll();
	}
	public String deleteEmployee(int id) {
		Employee ed=getEmployeeById(id);
		if (ed!=null) {
			emrepo.deleteById(id);
			return"Delete Successfully";
		}else {
			return "please enter valide id";
		}
	}
	
		
}





