package com.dgmf.lombokwithspringboot;

import com.dgmf.lombokwithspringboot.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		Student student = new Student();
		student.setId(100L);
		student.setFirstName("John");
		student.setLastName("Doe");

		System.out.println(student.getId());
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
	}

}
