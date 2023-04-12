package com.example.greetingssender.adapter.config;

import com.example.greetingssender.application.port.in.PersonFileReaderInputPort;
import com.example.greetingssender.application.port.out.PersonOutputPort;
import com.example.greetingssender.domain.model.Person;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;
import java.util.List;

@Configuration
@EnableScheduling
@AllArgsConstructor
@Slf4j
public class GreetingsSenderConfig {

    private PersonOutputPort personOutputPort;
    private PersonFileReaderInputPort personFileReaderUseCase;

    @PostConstruct
    public void initDatabase() throws IOException {

        log.info("Cleaning database");
        personOutputPort.deleteAll();
        log.info("Inserting persons to database");
        List<Person> personList = personFileReaderUseCase.getPersonsFromFile("src/main/resources/persons.txt");
        personOutputPort.savePersonsBatch(personList);
    }
}