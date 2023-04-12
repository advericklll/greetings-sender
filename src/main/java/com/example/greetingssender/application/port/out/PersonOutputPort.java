package com.example.greetingssender.application.port.out;

import com.example.greetingssender.domain.model.Person;

import java.util.List;

public interface PersonOutputPort {

    void savePersonsBatch(List<Person> personList);

    List<Person> getAll();

    void deleteAll();
}
