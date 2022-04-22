package org.example.mercadolibre.steps;

import io.cucumber.java.en.Given;
import org.example.core.ui.SharedDriver;
import org.example.mercadolibre.pages.Home;

public class CommonStepDefs {

    public CommonStepDefs(final SharedDriver sharedDriver) {
    }

    @Given("I navigate to MercadoLibre {string}")
    public void iNavigateToCourses(final String country) {
        Home home = new Home();
        home.selectCountry(country);
    }

}
