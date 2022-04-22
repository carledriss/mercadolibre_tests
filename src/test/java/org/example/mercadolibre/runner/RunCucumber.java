package org.example.mercadolibre.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.example",
        plugin = {"pretty"}
)
public class RunCucumber extends AbstractTestNGCucumberTests {

    @BeforeTest
    public void setUp() {
        System.setProperty("dataproviderthreadcount", "1");
    }

    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @AfterTest
    public void tearDown() {
    }

}
