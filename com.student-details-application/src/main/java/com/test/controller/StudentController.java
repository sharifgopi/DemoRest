package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.models.Student;
import com.test.service.DemoStudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private DemoStudentService demoService;
	
	
	
	public StudentController(DemoStudentService demoService) {
		super();
		this.demoService = demoService;
	}



	@GetMapping("/create")
	public String createStudent(Student stu) {
		
		Student s1=new Student();
//		s1.setsRollNo("ram123");
//		s1.setsName("Ramesh");
//		s1.setsBranch("CSE");
//		s1.setsCity("Hyderabad");
//		demoService.createStudent(s1);
		s1.setsRollNo("kris123");
		s1.setsName("Krishna");
		s1.setsBranch("EEE");
		s1.setsCity("Banglore");
		demoService.createStudent(s1);
		
		
		return "Student Created Succefully";
	}


	@GetMapping("/get/{id}")
	public Student findById(@PathVariable String id) {
		
		Object findByStudent =demoService.findByStudent(id);
		Student s1=(Student)findByStudent;
		return s1;
	}

}
