package com.humber.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.humber.demo.entity.Employee;
import com.humber.demo.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping("/saveEmployees")
	public ResponseEntity<String> saveEmployees(@RequestBody List<Employee> empData){
		employeeRepository.saveAll(empData);
		return ResponseEntity.ok("Employees data saved.");
	}
	
	@GetMapping("/getEmployees")
	public List<Employee> getEmployees(){
		return employeeRepository.findAll();
	}

}
