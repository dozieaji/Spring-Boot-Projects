package com.dozie.MyWebApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dozie.MyWebApp.Student;
import com.dozie.MyWebApp.dao.StudentRepo;

//Spring Boot JPA MVC H2 Example 2


@Controller
public class StudentController {
	
	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/")
	public String home() {
		
		return "home.jsp";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(Student student) {
		
		repo.save(student);
		return "home.jsp";
	}
}



//Spring Boot JPA MVC H2 Example 1
/*
 * @Controller public class StudentController {
 * 
 * @Autowired StudentRepo repo;
 * 
 * @RequestMapping("/") public String home() {
 * 
 * return "home.jsp"; }
 * 
 * @RequestMapping("/addStudent") public String addStudent(Student student) {
 * 
 * repo.save(student); return "home.jsp"; } }
 */
