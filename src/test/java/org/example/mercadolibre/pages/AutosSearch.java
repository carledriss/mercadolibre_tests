package org.example.mercadolibre.pages;

import org.example.core.ui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutosSearch extends AbstractPage {

    @FindBy(css = ".ui-search-search-result__quantity-results")
    private WebElement quantityResult;

    @FindBy(css = "input#Maximum-price")
    private WebElement maxPrice;

    @FindBy(css = "button[data-testid='submit-price']")
    private WebElement priceFilterButton;

    @FindBy(css = ".ui-search-sort-filter .andes-dropdown__trigger")
    private WebElement sortFilter;

    public String getQuantityResult() {
        return action.getText(quantityResult);
    }

    public void setMaxPrice(final String price) {
        action.scrollTo(maxPrice);
        action.hover(maxPrice);
        action.setValue(maxPrice, price);
        action.click(priceFilterButton);
    }

    public void selectLocation(final String location) {
        action.scrollTo(maxPrice);
        action.click(By.xpath(String.format("//button[@aria-label='%s']", location)));
    }

    public void sortBy(final String sortOrder) {
        action.click(sortFilter);
        action.click(By.xpath(String.format("//div[text()='%s']/ancestor::a", sortOrder)));
    }
}
