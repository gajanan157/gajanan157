package com.sts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.sts.entities.Employee;

@Repository

public interface EmployeeDao extends JpaRepository<Employee,Long> {

	
}
