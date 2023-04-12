package com.example.greetingssender.domain.service;

import com.example.greetingssender.application.port.in.CreatePersonUseCase;
import com.example.greetingssender.application.port.in.GetPersonUseCase;
import com.example.greetingssender.application.port.out.PersonOutputPort;
import com.example.greetingssender.domain.model.Person;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonService implements GetPersonUseCase, CreatePersonUseCase {

    private PersonOutputPort personOutputPort;

    @Override
    public List<Person> getAll() {
        return personOutputPort.getAll();
    }

    @Override
    public void createPersonBatch(List<Person> personList) {
        personOutputPort.savePersonsBatch(personList);
    }
}
