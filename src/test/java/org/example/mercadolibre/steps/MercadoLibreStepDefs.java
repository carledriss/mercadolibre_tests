package org.example.mercadolibre.steps;

import io.cucumber.java.en.And;
import org.example.core.ui.SharedDriver;
import org.example.mercadolibre.pages.MercadoLibre;

public class MercadoLibreStepDefs {

    public MercadoLibreStepDefs(final SharedDriver sharedDriver) {
    }

    @And("I go to {string}")
    public void iGoTo(final String category) {
        MercadoLibre mercadoLibre = new MercadoLibre();
        mercadoLibre.selectCategory(category);
    }
}
