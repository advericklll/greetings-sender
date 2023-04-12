package com.example.greetingssender.application.port.out;

import com.example.greetingssender.domain.model.Person;

public interface SmsSender {

    void sendGreetingsNotification(Person personSender, Person personReceiver);
}
