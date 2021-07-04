package com.app.todo.thymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.todo.thymeleaf.entity.Student;
@Repository
public interface StudentDao extends JpaRepository<Student,Long> {

}
