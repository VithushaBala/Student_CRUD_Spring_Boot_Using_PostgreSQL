package com.vb.manage.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vb.manage.Entity.Student;
import com.vb.manage.service.StdServiceImpl;



@RestController
public class StudentController {
	
	@Autowired
	private StdServiceImpl stdImpl;
	
	@PostMapping("student")
	public Student createStudent(@RequestBody Student student) {
		 return stdImpl.create(student);
		
	}
	
	@GetMapping("allStudents")
	public List<Student> getAllStudents() {
		return stdImpl.retrieve();
	}
	
	@GetMapping("getOne/{s_id}")
	public String viewOne(@PathVariable Long s_id) {
		return stdImpl.getOne(s_id);
	}
	
	@PutMapping("updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		return stdImpl.update(student);
	}
	
	@DeleteMapping("deleteSt/{s_id}")
	public String deleteStudent(@PathVariable Long s_id) {
		return stdImpl.delete(s_id);
		
	}
	
	

	
	
	
	
}
