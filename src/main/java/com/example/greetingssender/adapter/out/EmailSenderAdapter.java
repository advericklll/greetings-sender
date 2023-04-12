package com.example.greetingssender.adapter.out;

import com.example.greetingssender.adapter.out.mapper.EmailMapper;
import com.example.greetingssender.application.port.out.EmailSender;
import com.example.greetingssender.domain.model.Person;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class EmailSenderAdapter implements EmailSender {

    private EmailMapper emailMapper;

    @Override
    public void sendGreetingsEmail(Person person) {
      log.info("Sending email to: "+ person);
      log.info("Body : "+ emailMapper.toGreetingsEmail(person).getMessage());
    }
}
