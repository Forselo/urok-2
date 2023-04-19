package com.demoqa.tests;

import org.junit.jupiter.api.Test;

public class RegistrationWithPageObjectsTests extends TestBase {

    @Test
    void successfulRegistrationTest() {
        registrationPage.openPage()
                .removeFooter()
                .setFirstName("Seva")
                .setLastName("Petrov")
                .setUserEmail("fors333@a.ru")
                .setGender("Male")
                .setNumber("1234567890")
                .setBirthDate("23", "April", "1989")
                .setSubjects("Math")
                .setHobby("Sports")
                .uploadPicture("1.jpg")
                .setCurrentAddress("Kazan")
                .setState("Haryana")
                .setCity("Panipat")
                .clickSubmit();


        registrationPage.verifyRegistrationResultsModalAppears()
                .verifyResult("Student Name", "Seva Petrov")
                .verifyResult("Student Email", "fors333@a.ru")
                .verifyResult("Gender", "Male")
                .verifyResult("Mobile", "1234567890")
                .verifyResult("Date of Birth", "23 April,1989")
                .verifyResult("Subjects", "Math")
                .verifyResult("Hobbies", "Sports")
                .verifyResult("Picture", "1.jpg")
                .verifyResult("Address", "Kazan")
                .verifyResult("State and City", "Haryana Panipat");

    }
}