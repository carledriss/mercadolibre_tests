package org.example.mercadolibre.pages;

import org.example.core.ui.AbstractPage;
import org.openqa.selenium.By;

public class MercadoLibre extends AbstractPage {

    public CarsCategory selectCategory(final String category) {
        action.hover(driver.findElement(By.cssSelector(".nav-menu-categories-link")));
        action.click(By.xpath(String.format("//a[text()='%s']", category)));
        return new CarsCategory();
    }
}
