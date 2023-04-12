package com.example.greetingssender.adapter.in.persistence;
import com.example.greetingssender.adapter.in.persistence.mapper.PersonPersistenceMapper;
import com.example.greetingssender.adapter.in.persistence.repository.PersonRepository;
import com.example.greetingssender.application.port.out.PersonOutputPort;
import com.example.greetingssender.domain.model.Person;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class PersonPersistenceAdapter implements PersonOutputPort {

    private PersonRepository personRepository;
    private PersonPersistenceMapper personPersistenceMapper;

    @Override
    public void savePersonsBatch(List<Person> personList) {
        personRepository.saveAll(personList.stream().map(person ->
                personPersistenceMapper.toPersonEntity(person))
                .toList()
        );
    }

    @Override
    public List<Person> getAll() {
        return personRepository.findAll().stream()
                .map(personEntity -> personPersistenceMapper.toPerson(personEntity))
                .toList();
    }

    @Override
    public void deleteAll() {
        personRepository.deleteAll();
    }
}
