package com.dozie.MyWebApp.dao;

import org.springframework.data.repository.CrudRepository;

import com.dozie.MyWebApp.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {
	
	
}
 