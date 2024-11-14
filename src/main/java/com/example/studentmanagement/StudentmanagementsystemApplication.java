package com.example.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.studentmanagement.repository.StudentRepository;


@SpringBootApplication
public class StudentmanagementsystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementsystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		//Student student1 = new Student("Nathan", "Mutsvandiani", "nathan@gmail.com");
		//studentRepository.save(student1);
		
		//Student student2 = new Student("Ethan", "Mutsvandiani", "Ethan@gmail.com");
		//studentRepository.save(student2);
		
		//Student student3 = new Student("Akudzweishe", "Mtetwa", "Akudzwe@gmail.com");
		//studentRepository.save(student3);
		
		
		
	}
	

}
