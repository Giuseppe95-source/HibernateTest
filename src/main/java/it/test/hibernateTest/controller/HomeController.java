package it.test.hibernateTest.controller;

import org.hibernate.transform.ToListResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import it.test.hibernateTest.repository.MessageRepository;
import it.test.hibernateTest.service.MessageService;
import it.test.hibernateTest.dto.MessageDto;
import it.test.hibernateTest.entity.Message;
import it.test.hibernateTest.mapper.MessageMapper;
import it.test.hibernateTest.mapper.MessageMapperImpl;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/api/message", produces="application/json")
public class HomeController {
	
	@Autowired
	MessageService service;
	
//	@Autowired
//	MessageRepository repo;
//	
//	@Autowired(required = true)
//	MessageMapper mapper;
	
	
	
	@GetMapping("/getAllMessages")
	public List<MessageDto> getAllMessage(){
		return service.getAllMessages();
				
	}
	
	
	
	
//	@GetMapping("/hello")
//	public String hello() {
//		return "Hello World";
//	}
//	
//	@GetMapping("/get")
//	public ResponseEntity< Set<Message> > getAllMessage(){
//		return service.getAll();
//	}
//	
//	
//	@PostMapping(path = "/post", consumes = "application/json")
//	public Message insertMessage(@RequestBody Message message) {
//		return service.postMessage(message);
//	}

}
