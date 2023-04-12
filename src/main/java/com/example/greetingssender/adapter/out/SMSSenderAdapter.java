package com.example.greetingssender.adapter.out;

import com.example.greetingssender.adapter.out.mapper.SMSMapper;
import com.example.greetingssender.application.port.out.SmsSender;
import com.example.greetingssender.domain.model.Person;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class SMSSenderAdapter implements SmsSender {

    private SMSMapper smsMapper;

    @Override
    public void sendGreetingsNotification(Person personSender, Person personReceiver) {
      log.info("Sending SMS notification to :"+ personSender.getCompleteName()
              + " for :"+personReceiver.getCompleteName()+"'s birthday.");
    }
}
