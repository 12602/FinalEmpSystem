package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Student;
import com.example.demo.repository.StudentRepo;
import com.example.demo.services.StudentService;

@SpringBootApplication
public class FinalStudentMgmtSystemApplication implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(FinalStudentMgmtSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
	}

}
