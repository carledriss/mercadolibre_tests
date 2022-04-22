package org.example.core.ui;

import org.openqa.selenium.WebDriver;

@FunctionalInterface
interface Browser {

    WebDriver init();
}
