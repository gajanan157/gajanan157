package com.sts.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sts.dao.EmployeeDao;
import com.sts.entities.Employee;
import com.sts.services.EmployeeService;






@Service
public class EmployeeServiceImpl implements EmployeeService {
     @Autowired
	private EmployeeDao employeeDao;
	@Override
	public List<Employee> getEmployees() {
		
		return   employeeDao.findAll();
	}

	public Employee addEmployee(Employee employee) {
		employeeDao.save(employee);
		return employee;
	}
    public Employee updateEmployee(Employee employee) {
    	employeeDao.save(employee);
    	return employee;
    }
    public String deleteEmployee(long employeeId) {
		employeeDao.deleteById(employeeId);
		String mm = "deleted successfully";
		ObjectMapper obj = new ObjectMapper();
		try {
			String msg = obj.writeValueAsString(mm);
			return msg;
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
    	
    }

