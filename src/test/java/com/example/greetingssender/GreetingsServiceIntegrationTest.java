package com.example.greetingssender;

import com.example.greetingssender.domain.service.GreetingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class GreetingsServiceIntegrationTest {

    @Autowired
    private GreetingService greetingService;

    @Test
    public void testGreet3People(){
        assertEquals(greetingService.sendGreetingNotificationByDate(LocalDate.of(2023, 4, 11))
                        .size()
                , 3);
    }

    @Test
    public void testNoPersonToGreetOnThisDay() {
        assertEquals( greetingService.sendGreetingNotificationByDate(LocalDate.of(2023, 4, 12))
                        .size()
                , 0);
    }

    @Test
    public void testGreetOnFebruary28ThNoLeapYear (){
        assertEquals( greetingService.sendGreetingNotificationByDate(LocalDate.of(2023, 2, 28))
                        .size()
                , 2);
    }

    @Test
    public void testGreetOnFebruary28ThLeapYear (){
        assertEquals( greetingService.sendGreetingNotificationByDate(LocalDate.of(2024, 2, 28))
                        .size()
                , 1);
    }
}
