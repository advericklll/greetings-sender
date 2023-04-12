package com.example.greetingssender.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SMSNotification {
    private String subject;
    private String contactName;
    private String contactPhone;
    private String message;
}
