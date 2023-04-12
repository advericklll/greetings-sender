package com.example.greetingssender.application.port.in;

import com.example.greetingssender.domain.model.Person;

import java.io.IOException;
import java.util.List;

public interface PersonFileReaderInputPort {

    List<Person> getPersonsFromFile(String fileName) throws IOException;
}
