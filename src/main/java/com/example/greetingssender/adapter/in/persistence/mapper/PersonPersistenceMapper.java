package com.example.greetingssender.adapter.in.persistence.mapper;

import com.example.greetingssender.adapter.in.persistence.entity.PersonEntity;
import com.example.greetingssender.domain.model.Person;
import com.example.greetingssender.domain.util.Constants;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonPersistenceMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "firstName", source = "person.firstName")
    @Mapping(target = "lastName", source = "person.lastName")
    @Mapping(target = "dateOfBirth", source = "person.dateOfBirth", dateFormat = Constants.DATE_FORMAT_PATTERN)
    @Mapping(target = "email", source = "person.email")
    @Mapping(target = "phoneNumber", source = "person.phoneNumber")
    PersonEntity toPersonEntity(Person person);

    @Mapping(target = "firstName", source = "personEntity.firstName")
    @Mapping(target = "lastName", source = "personEntity.lastName")
    @Mapping(target = "dateOfBirth", source = "personEntity.dateOfBirth", dateFormat = Constants.DATE_FORMAT_PATTERN)
    @Mapping(target = "email", source = "personEntity.email")
    @Mapping(target = "phoneNumber", source = "personEntity.phoneNumber")
    Person toPerson(PersonEntity personEntity);
}
