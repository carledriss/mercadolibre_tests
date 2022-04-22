package org.example.core.ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome implements Browser {

    @Override
    public WebDriver init() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
