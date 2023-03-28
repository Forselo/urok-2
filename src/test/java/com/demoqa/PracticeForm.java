package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeForm extends TestBase{




    @Test
    void succesfulFullFormTest(){
        open("/automation-practice-form");
        $("#firstName").setValue("Seva");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("aaa@a.com");

    }
}
