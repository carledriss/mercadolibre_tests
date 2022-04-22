package org.example.core.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.example.core.Environment;

public class SharedDriver {

    public SharedDriver() {
        WebDriver driverSession = DriverFactory.getDriver();
        if (driverSession == null || ((RemoteWebDriver) driverSession).getSessionId() == null) {
            WebDriver driver = BrowserFactory.getBrowser(Environment.getInstance().getValue("browser"));
            driver.manage().window().maximize();
            DriverFactory.addDriver(driver);
        }
    }
}
