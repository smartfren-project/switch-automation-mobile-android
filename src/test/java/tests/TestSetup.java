package tests;

import operation.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;

public class TestSetup extends BaseTest {

    @BeforeSuite
    public void setUp() throws MalformedURLException {
        setupAppium();
    }

    @AfterMethod
    public void closeAppSwitch() {
        driver.resetApp();
    }
}
