package com.vb.manage.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vb.manage.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
