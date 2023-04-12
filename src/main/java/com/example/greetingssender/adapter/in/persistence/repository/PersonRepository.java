package com.example.greetingssender.adapter.in.persistence.repository;

import com.example.greetingssender.adapter.in.persistence.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {

}
