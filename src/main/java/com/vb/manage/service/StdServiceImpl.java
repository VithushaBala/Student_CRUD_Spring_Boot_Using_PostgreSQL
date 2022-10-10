package com.vb.manage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vb.manage.Entity.Student;
import com.vb.manage.Repository.StudentRepository;

@Service
public class StdServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository sRepo;

	@Override
	public Student create(Student student) {
		
				return sRepo.save(student);
			}
		
	

	@Override
	public List<Student> retrieve() {
		return sRepo.findAll();
		
	}

	@Override
	public String getOne(Long s_id) {
		if(sRepo.existsById(s_id)) {
			Optional<Student> std = sRepo.findById(s_id);
		return s_id+"data found"+std;
		
		}else {
			return "data doesn't exist";
		}
	
	}

	@Override
	public Student update(Student student) {
		return sRepo.save(student);
		
	}

	@Override
	public String delete(Long s_id) {
	
		if(sRepo.existsById(s_id)) {
			sRepo.deleteById(s_id);
		return "s_id:"+s_id+" data deleted";
		}else {
			return "data doesn't exist";
		}
	
	}
	}


