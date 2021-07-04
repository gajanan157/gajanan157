package com.sts.services;

import java.util.List;

import com.sts.entities.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();
	
	public Employee addEmployee(Employee employee);
	
	public Employee updateEmployee( Employee employee);

	public String deleteEmployee(long employeeId);
}
