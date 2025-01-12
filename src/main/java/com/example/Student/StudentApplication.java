package com.example.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.load();

		String dbUrl = dotenv.get("MONGO_DB_URL");

		System.setProperty("MONGO_DB_URL",dbUrl);

		SpringApplication.run(StudentApplication.class, args);
	}

}
