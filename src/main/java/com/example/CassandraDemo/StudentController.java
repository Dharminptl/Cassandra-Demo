package com.example.CassandraDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/getStudentDetails")
	public String getStudentDetails(@RequestParam int id) {
		return studentService.getStudentDetails(id);
	}
	
	@PostMapping("/saveStudentDetails")
	public Student saveStudentDetails(@RequestBody Student student) {
		return studentService.saveStudentDetails(student);
	}

}
