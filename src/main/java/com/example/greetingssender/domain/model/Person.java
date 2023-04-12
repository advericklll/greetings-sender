package com.example.greetingssender.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.Month;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {

    private String lastName;
    private String firstName;
    private LocalDate dateOfBirth;
    private String email;
    private String phoneNumber;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompleteName () {
        return this.firstName + " " + this.lastName;
    }

    public Boolean isPersonBirthday(LocalDate localDate){

        if (localDate.getDayOfMonth()==28 && localDate.getMonth().equals(Month.FEBRUARY)
        && !localDate.isLeapYear()){
            return this.dateOfBirth.getMonth().equals(localDate.getMonth())
                    && (this.dateOfBirth.getDayOfMonth() == localDate.getDayOfMonth() ||
                    this.dateOfBirth.getDayOfMonth() == localDate.getDayOfMonth()+1);
        }

        return this.dateOfBirth.getMonth().equals(localDate.getMonth())
                && this.dateOfBirth.getDayOfMonth() == localDate.getDayOfMonth();
    }
}
