package org.example.core.ui;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {

    public static final long DEFAULT_IMPLICIT_TIMEOUT_IN_SECONDS = 15;
    public static final long EXPLICIT_WAIT_IN_SECONDS = 20;

    protected WebDriver driver;

    protected WebDriverWait wait;

    protected WebdriverAction action;

    protected AbstractPage() {
        this.driver = DriverFactory.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(DEFAULT_IMPLICIT_TIMEOUT_IN_SECONDS));
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT_IN_SECONDS));
        this.action = new WebdriverAction(driver, wait);
        PageFactory.initElements(driver, this);
    }
}
