package it.test.hibernateTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import it.test.hibernateTest.entity.Message;
import it.test.hibernateTest.repository.MessageRepository;
import it.test.hibernateTest.service.MessageService;

@SpringBootTest
class HibernateTestApplicationTests {

	@Test
	void contextLoads() {
	}
	
	
	@Test
	void something() {
		Message message = Message.builder()
				.id(1L)
				.text("Hello")
				.build();
		
		System.out.println(message);
	}

}
