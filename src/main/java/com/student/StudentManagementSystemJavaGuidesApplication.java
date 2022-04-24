package com.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class StudentManagementSystemJavaGuidesApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemJavaGuidesApplication.class, args);
		System.out.println("STUDENT MANAGEMENT SYSTEM OF JAVA GUIDES APPLICATION HAS STARTED !!");
		System.out.println("STUDENT MANAGEMENT SYSTEM OF JAVA GUIDES APPLICATION HAS STARTED !!");
		System.out.println("STUDENT MANAGEMENT SYSTEM OF JAVA GUIDES APPLICATION HAS STARTED !!");
	}
	
//	@Autowired
//	private StudentRepository studentRepository;
	
//	public void run(String[] args) throws Exception {
//		Student stud1=new Student(null, "Aniket", "Singh", "aniket@gmail.com");
//		studentRepository.save(stud1);
//		
//		Student stud2=new Student(null, "Vikash", "Kumar", "vikash@gmail.com");
//		studentRepository.save(stud2);
//		
//		
//	}
	
	@Bean
	public Docket apiDoc() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.student"))
				.paths(PathSelectors.any())
				.build();
	}
}
