package it.test.hibernateTest.repository;
import org.springframework.data.repository.CrudRepository;
import it.test.hibernateTest.entity.Message;
import java.util.*;

public interface MessageRepository extends CrudRepository<Message, Long>{
	
	List<Message> findAll();

}
