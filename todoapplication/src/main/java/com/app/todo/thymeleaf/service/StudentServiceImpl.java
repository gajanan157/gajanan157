package com.app.todo.thymeleaf.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.todo.thymeleaf.entity.Student;
import com.app.todo.thymeleaf.repository.StudentDao;


@Service
public class StudentServiceImpl implements StudentService {
   @Autowired
   private StudentDao studentDao;
	@Override
	public List<Student> getAllStudents() {
		return studentDao.findAll();	}
	@Override
	public void saveStudent(Student student) {
		this.studentDao.save(student);
		
	}
	@Override
	public Student getStudentById(long id) {
		Optional<Student>optional=studentDao.findById(id);
		Student student=null;
	if(optional.isPresent()) {
		student=optional.get();
	}else {
		throw new RuntimeException("Student not found for id ::"+id);
	}
	return student;
	}
	@Override
	public void deleteStudentById(long id) {
		this.studentDao.deleteById(id);
		
	}
	}


