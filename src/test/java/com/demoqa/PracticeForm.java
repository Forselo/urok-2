package com.demoqa;


import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.Keys.CONTROL;

public class PracticeForm extends TestBase {


    @Test
    void succesfulFullFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Seva");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("aaa@a.com");
        $(byText("Male")).click();
        $("#userNumber").setValue("7986957850");
        $("#dateOfBirthInput").sendKeys(CONTROL + "A");
        $("#dateOfBirthInput").sendKeys("11.11.1991");
        $("#dateOfBirthInput").pressEnter();
        $("#subjectsInput").setValue("Arts");
        $("#subjectsInput").pressEnter();
        $(byText("Sports")).click();
        $(byText("Reading")).click();
        $(byText("Music")).click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/images/1.jpg"));
        $("#currentAddress").setValue("Kazan");
        $("#state").click();
        $(byText("Haryana")).click();
        $("#city").click();
        $(byText("Karnal")).click();
        $("#submit").click();
        $(".table").shouldHave(text("Seva Ivanov"), text("aaa@a.com"), text("Male"),
                text("7986957850"), text("11 November,1991"), text("Arts"), text("Sports, Reading, Music"),
                text("1.jpg"), text("Kazan"), text("Haryana Karnal"));


    }



}
