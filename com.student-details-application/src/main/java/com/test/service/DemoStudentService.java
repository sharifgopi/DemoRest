package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.models.Student;
import com.test.repo.DemoStudentRepo;

@Service
public class DemoStudentService {

	@Autowired
	private DemoStudentRepo sturepo;

	public DemoStudentService(DemoStudentRepo sturepo) {
		super();
		this.sturepo = sturepo;
	}


	public void createStudent(Student st) {
		
		sturepo.save(st);
	}
	
	
	public Object findByStudent(String stno) {
		
		return sturepo.findById(stno);
	}
}
