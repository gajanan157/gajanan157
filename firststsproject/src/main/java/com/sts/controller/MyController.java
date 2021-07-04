package com.sts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sts.entities.Employee;
import com.sts.services.EmployeeService;

@RestController
public class MyController {
	
	@Autowired
  private EmployeeService employeeService;
	
	//get the all employees.....
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
	return this.employeeService.getEmployees();
	}
	
	// add employee.....
	
	@PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
    	return this.employeeService.addEmployee(employee);
    }
	
	//update employee......
	
    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee) {
    	return employeeService.updateEmployee(employee);
    }
    
    //delete employee......
    
    @DeleteMapping("/employee/{employeeId}")
    public String deleteEmployee(@PathVariable long employeeId)  { 	
     return employeeService.deleteEmployee(employeeId);
    }
}

