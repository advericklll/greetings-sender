package com.example.greetingssender.domain.scheduler;


import com.example.greetingssender.application.port.out.SendGreetingsNotificationUseCase;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@AllArgsConstructor
@Slf4j
@Service
public class GreetingsScheduler {

    private SendGreetingsNotificationUseCase sendGreetingsNotificationUseCase;

    @Scheduled(cron = "${cron.expression}")//every day at 8:00 AM.
    public void sendGreetingsToFriends(){
        log.info("Entered scheduler");
        sendGreetingsNotificationUseCase.sendGreetingNotificationByDate(LocalDate.now());
    }
}
