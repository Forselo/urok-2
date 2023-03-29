package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
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
        //$("#dateOfBirthInput").click();
        $("#dateOfBirthInput").sendKeys("11.11.1991");
        $("#dateOfBirthInput").pressEnter();
        $("#subjectsInput").setValue("Geography");
        $("#subjectsInput").pressEnter();
        $(byText("Sports")).click();
        $(byText("Reading")).click();
        $(byText("Music")).click();

    }



}
