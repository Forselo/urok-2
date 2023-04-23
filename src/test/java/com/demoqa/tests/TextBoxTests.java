package com.demoqa.tests;

import org.junit.jupiter.api.Test;

public class TextBoxTests extends TestBase {
    @Test
    void successfulFillFormTest() {
        textBoxPage.openPage()
                .setFullName("Seva Petrov")
                .setEmail("fors333@a.ru")
                .setCurrentAddress("Kazan")
                .setPermanentAddress("Anoxina")
                .clickSubmit();

        textBoxPage.verifyOutputName("Seva Petrov")
                .verifyOutputEmail("fors333@a.ru")
                .verifyOutputCurrentAddress("Kazan")
                .verifyOutputPermanentAddress("Anoxina");
    }
}