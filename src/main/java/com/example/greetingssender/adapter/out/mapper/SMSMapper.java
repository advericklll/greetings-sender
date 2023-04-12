package com.example.greetingssender.adapter.out.mapper;

import com.example.greetingssender.domain.model.SMSNotification;
import com.example.greetingssender.domain.model.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public class SMSMapper {

    public SMSNotification toGreetingNotification(Person personSender, Person personReceiver){
        return SMSNotification.builder()
                .subject("Birthday Reminder")
                .contactName(personSender.getFirstName())
                .contactPhone(personSender.getPhoneNumber())
                .message("Dear " + personSender.getFirstName() + ", \n\n " +
                        "Today is "+ personReceiver.getCompleteName() + "'s birthday.\n" +
                        "Don't forget to send him a message !")
                .build();
    }
}
