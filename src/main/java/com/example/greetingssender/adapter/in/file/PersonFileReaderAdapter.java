package com.example.greetingssender.adapter.in.file;

import com.example.greetingssender.application.port.in.PersonFileReaderInputPort;
import com.example.greetingssender.domain.model.Person;
import com.example.greetingssender.domain.util.Constants;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class PersonFileReaderAdapter implements PersonFileReaderInputPort {

    @Override
    public List<Person> getPersonsFromFile(String fileName) throws IOException {

        List<String> result;
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            result = lines.collect(Collectors.toList());
        }

        return result.stream().map(line-> {
            String [] values = line.split(",");

          return Person.builder()
                  .lastName(values[0])
                  .firstName(values[1])
                  .dateOfBirth(LocalDate.parse(values[2], DateTimeFormatter.ofPattern(Constants.DATE_FORMAT_PATTERN)))
                  .email(values[3])
                  .phoneNumber(values[4])
                  .build();
        }).collect(Collectors.toList());
    }
}
