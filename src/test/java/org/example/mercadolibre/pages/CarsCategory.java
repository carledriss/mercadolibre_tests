package org.example.mercadolibre.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.example.core.ui.AbstractPage;

public class CarsCategory extends AbstractPage {

    @FindBy(xpath = "//button[contains(@class, 'andes-button')]")
    private WebElement searchButton;

    public AutosSearch clickSearchButton() {
        action.hover(searchButton);
        action.click(searchButton);
        return new AutosSearch();
    }
}
