package com.example.CassandraDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public String getStudentDetails(int id) {
		return studentRepository.findById(id).orElse(null).getName();
	}

	public Student saveStudentDetails(Student student) {
		return studentRepository.save(student);
	}	

}
