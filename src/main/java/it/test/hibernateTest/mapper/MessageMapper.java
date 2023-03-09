package it.test.hibernateTest.mapper;

import java.util.Collections;

import javax.swing.Spring;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;

import it.test.hibernateTest.entity.Message;
import it.test.hibernateTest.dto.MessageDto;

@Mapper(componentModel = "spring", imports = Collections.class, unmappedTargetPolicy = ReportingPolicy.IGNORE, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS )
public interface MessageMapper{

	MessageMapper INSTANCE = Mappers.getMapper(MessageMapper.class);

	//@Mapping (source = "source" , target = "target") // from source to target -> Abbiamo bisogno di convertire l'attributo age
	MessageDto messageToMessageDto(Message message);
}




