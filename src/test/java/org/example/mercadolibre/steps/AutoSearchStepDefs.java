package org.example.mercadolibre.steps;

import java.lang.invoke.MethodHandles;

import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;
import io.cucumber.java.en.And;
import org.example.core.ui.SharedDriver;
import org.example.mercadolibre.pages.AutosSearch;
import org.example.mercadolibre.pages.CarsCategory;

public class AutoSearchStepDefs {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private final CarsCategory carsCategory;
    private AutosSearch autosSearch;

    public AutoSearchStepDefs(final SharedDriver sharedDriver, final CarsCategory carsCategory) {
        this.carsCategory = carsCategory;
    }

    @And("I click Search button")
    public void iClickSearchButton() {
        autosSearch = carsCategory.clickSearchButton();
    }

    @And("I set {string} as max price")
    public void iSetAsMaxPrice(final String price) {
        autosSearch.setMaxPrice(price);
    }

    @And("I select {string} as location")
    public void iSelectAsLocation(final String location) {
        autosSearch.selectLocation(location);
    }

    @And("I order by {string}")
    public void iOrderBy(final String sortOrder) {
        autosSearch.sortBy(sortOrder);
    }

    @And("I print the number of results")
    public void iPrintTheNumberOfResults() {
        LOGGER.info(() -> "Number of results : " + autosSearch.getQuantityResult());
    }
}
