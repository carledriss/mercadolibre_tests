package org.example.core.ui;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

public final class DriverFactory {

    private static final ThreadLocal<WebDriver> DRIVERS = new ThreadLocal<>();

    private static final List<WebDriver> STORED_DRIVERS = new ArrayList<>();

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> STORED_DRIVERS.forEach(WebDriver::quit)));
    }

    private DriverFactory() {
    }

    public static void addDriver(final WebDriver driver) {
        DRIVERS.set(driver);
        STORED_DRIVERS.add(driver);
    }

    public static WebDriver getDriver() {
        return DRIVERS.get();
    }

}
