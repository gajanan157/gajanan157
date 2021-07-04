package com.app.todo.thymeleaf.service;

import java.util.List;

import com.app.todo.thymeleaf.entity.Student;

public interface StudentService {
   List<Student> getAllStudents();
   void saveStudent(Student student);
  Student getStudentById(long id);
  void deleteStudentById(long id);
  
}
