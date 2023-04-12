package com.example.greetingssender.adapter.out.mapper;

import com.example.greetingssender.domain.model.EmailNotification;
import com.example.greetingssender.domain.model.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public class EmailMapper {

    public EmailNotification toGreetingsEmail(Person person){
        return EmailNotification.builder()
                .subject("Happy birthday!")
                .message("Happy birthday, dear "+person.getFirstName() + "!")
                .build();
    }
}
