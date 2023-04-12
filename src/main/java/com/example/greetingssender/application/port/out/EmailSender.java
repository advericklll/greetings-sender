package com.example.greetingssender.application.port.out;

import com.example.greetingssender.domain.model.Person;

public interface EmailSender {

    void sendGreetingsEmail(Person person);
}
