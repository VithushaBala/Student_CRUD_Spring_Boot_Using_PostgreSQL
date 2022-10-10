package com.vb.manage.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long s_id;
	private String firstName;
	private String lastName;
	private String email;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Long s_id, String firstName, String lastName, String email) {
		super();
		this.s_id = s_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Long getS_id() {
		return s_id;
	}

	public void setS_id(Long s_id) {
		this.s_id = s_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return s_id+" , "+firstName+","+lastName+","+email;	}
	
	
	
	

}
