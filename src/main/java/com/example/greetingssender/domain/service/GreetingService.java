package com.example.greetingssender.domain.service;

import com.example.greetingssender.application.port.out.EmailSender;
import com.example.greetingssender.application.port.out.SendGreetingsNotificationUseCase;
import com.example.greetingssender.application.port.out.SmsSender;
import com.example.greetingssender.domain.model.Person;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@AllArgsConstructor
@Slf4j
public class GreetingService implements SendGreetingsNotificationUseCase {

    private PersonService personService;
    private SmsSender smsSender;
    private EmailSender emailSender;

    @Override
    public List<Person> sendGreetingNotificationByDate(LocalDate localDate) {

        log.info("Entering sendGreetingNotificationByDate");

        //get all persons
        List<Person> personList = personService.getAll();

        //filter persons which have birthay today.
        List<Person> birthdayPersonList = personList.stream().filter(person -> person.isPersonBirthday(localDate))
                .toList();

        if (!birthdayPersonList.isEmpty()){
            //send greeting email to persons.
            log.info("Persons with birthday today.:"+birthdayPersonList);

            birthdayPersonList.stream().parallel().forEach(person -> emailSender.sendGreetingsEmail(person));

            //send greeting notification to others (even people who have birthday today have to greet others).
            personList.stream().parallel()
                    .forEach(person ->
                birthdayPersonList.stream().filter(person1 -> !person1.equals(person)).forEach(person1 -> smsSender
                        .sendGreetingsNotification(person, person1))
            );
        }
        return birthdayPersonList;
    }
}
