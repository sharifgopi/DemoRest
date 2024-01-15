package com.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.models.Student;

public interface DemoStudentRepo extends JpaRepository<Student, String> {

}
