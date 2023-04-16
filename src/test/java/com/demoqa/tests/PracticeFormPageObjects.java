package com.demoqa.tests;

import com.demoqa.pages.RegistrationPage;
import com.demoqa.tests.TestBase;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.Keys.CONTROL;

public class PracticeFormPageObjects extends TestBase {

    @Test
    void succesfulFullFormTest() {


        registrationPage.openPage()
                        .setFirstName("Alex")
                        .setLastName("Ivanov")
                        .setEmailInput("aaa@a.com")
                        .setGender("Other");
        


        $("#userNumber").setValue("7986957850");
        $("#dateOfBirthInput").sendKeys(CONTROL + "A");
        $("#dateOfBirthInput").sendKeys("11.11.1991");
        $("#dateOfBirthInput").pressEnter();
        $("#subjectsInput").setValue("Arts");
        $("#subjectsInput").pressEnter();
        $("#hobbies-checkbox-1").parent().click();
        $("#hobbies-checkbox-2").parent().click();
        $("#hobbies-checkbox-3").parent().click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/images/1.jpg"));
        $("#currentAddress").setValue("Kazan");
        $("#state").click();
        $("#react-select-3-option-2").click();
        $("#city").click();
        $("#react-select-4-option-0").click();
        $("#submit").click();
        $(".table").shouldHave(text("Seva Ivanov"), text("aaa@a.com"), text("Male"), text("7986957850"),
                text("11 November,1991"), text("Arts"), text("Sports, Reading, Music"), text("1.jpg"), text("Kazan"), text("Haryana Karnal"));

    }

}
