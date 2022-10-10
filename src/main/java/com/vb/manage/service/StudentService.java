package com.vb.manage.service;

import java.util.List;

import com.vb.manage.Entity.Student;

public interface StudentService {
	
	public Student create(Student student);
	
	public List<Student> retrieve();
	
	public String getOne(Long s_id);
	
	public Student update(Student student);
	
	public String delete(Long s_id);



	

}
