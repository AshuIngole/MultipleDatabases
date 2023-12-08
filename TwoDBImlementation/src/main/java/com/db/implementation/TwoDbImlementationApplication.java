package com.db.implementation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TwoDbImlementationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwoDbImlementationApplication.class, args);
	}

}
//postMapping for student:localhost:9293/saveStudent
//GetMapping for student:localhost:9293/getAllStudents
//postMapping for teacher:localhost:9293/saveTeacher
//GetMapping for teacher:localhost:9293/getAllTeachers