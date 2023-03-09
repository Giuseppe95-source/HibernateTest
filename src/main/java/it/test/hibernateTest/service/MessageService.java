package it.test.hibernateTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import it.test.hibernateTest.dto.MessageDto;
import it.test.hibernateTest.entity.Message;
import it.test.hibernateTest.mapper.MessageMapper;
import it.test.hibernateTest.repository.MessageRepository;
import java.util.*;
import java.util.stream.*;

@Service
public class MessageService {
	
	
	@Autowired
	MessageRepository repo;
	
	@Autowired
	MessageMapper mapper;
	
	
	
	
	public List<MessageDto> getAllMessages(){
		return repo.findAll().stream()
				.map(mapper::messageToMessageDto)
				.collect(Collectors.toList() );
	}
	
//	public ResponseEntity< Set<Message> > getAll(){
//		Set<Message> all = repo.findAll();
//		return new ResponseEntity<>(all, HttpStatus.OK);
//	}
//	
//	@ResponseStatus(HttpStatus.CREATED)
//	public Message postMessage(Message message) {
//		return repo.save(message);
//	}
	

}
