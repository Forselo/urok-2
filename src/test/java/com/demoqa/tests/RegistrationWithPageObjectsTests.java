package com.demoqa.tests;

import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationWithPageObjectsTests extends TestBase {

    @Test
    void successfulRegistrationTest() {
        registrationPage.openPage()
                .setFirstName("Alex")
                .setLastName("Egorov")
                .setUserEmail("alex@egorov.com")
                .setGender("Other")
                .setNumber("1234567890")
                .setBirthDate("30", "July", "2008")
                .setSubjects("Math")
                .setHobby("Sports")
                .uploadPicture("1.jpg");




       // $("#uploadPicture").uploadFile(new File("src/test/resources/images/1.jpg"));
        $("#currentAddress").setValue("Some address 1");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();

        registrationPage.verifyRegistrationResultsModalAppears()
                .verifyResult("Full name", "Alex Egorov")
                .verifyResult("Email", "alex@egorov.com")
                .verifyResult("Phone", "1234567890")
                .verifyResult("Date of Birth", "16 October,2000")
                .verifyResult("Subjects", "Math")
                .verifyResult("Hobbies", "Sports")
                .verifyResult("Picture", "misterPesel.jpg");

    }
}