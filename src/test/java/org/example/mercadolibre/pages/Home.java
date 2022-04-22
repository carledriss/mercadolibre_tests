package org.example.mercadolibre.pages;

import java.util.HashMap;
import java.util.Map;

import org.example.core.Environment;
import org.openqa.selenium.By;

import org.example.core.ui.AbstractPage;

public class Home extends AbstractPage {

    private static final Map<String, String> COUNTRY_CODES;
    static {
        COUNTRY_CODES = new HashMap<>();
        COUNTRY_CODES.put("Argentina", "AR");
        COUNTRY_CODES.put("Bolivia", "BO");
        // fill with the other supported countries.
    }

    public Home() {
        driver.get(Environment.getInstance().getValue("url"));
    }

    public MercadoLibre selectCountry(final String country) {
        action.click(By.cssSelector(String.format("#%s", COUNTRY_CODES.get(country))));
        return new MercadoLibre();
    }

}
