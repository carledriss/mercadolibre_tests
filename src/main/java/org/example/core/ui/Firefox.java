package org.example.core.ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements Browser {

    @Override
    public WebDriver init() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
}
