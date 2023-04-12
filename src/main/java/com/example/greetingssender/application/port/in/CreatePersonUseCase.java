package com.example.greetingssender.application.port.in;

import com.example.greetingssender.domain.model.Person;

import java.util.List;

public interface CreatePersonUseCase {

    void createPersonBatch(List<Person> person);
}
