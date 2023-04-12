package com.example.greetingssender.application.port.out;

import com.example.greetingssender.domain.model.Person;

import java.time.LocalDate;
import java.util.List;

public interface SendGreetingsNotificationUseCase {

    List<Person> sendGreetingNotificationByDate(LocalDate localDate);
}
