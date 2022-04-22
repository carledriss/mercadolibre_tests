package org.example.core.ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless implements Browser {

    @Override
    public WebDriver init() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions()
                .addArguments("headless")
                .addArguments("disable-gpu")
                .addArguments("no-sandbox")
                .addArguments("disable-dev-shm-usage");
        return new ChromeDriver(options);
    }
}
