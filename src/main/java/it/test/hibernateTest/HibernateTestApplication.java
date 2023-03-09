package it.test.hibernateTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import it.test.hibernateTest.service.MessageService;

@SpringBootApplication
public class HibernateTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateTestApplication.class, args);
		
	}
}
