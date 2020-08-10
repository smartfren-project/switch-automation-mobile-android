package tests;

import operation.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;

public class TestSetup extends BaseTest {

    @Parameters({"deviceName"})
    @BeforeSuite
    public void setUp() throws MalformedURLException {
        setupAppium();
    }


    @AfterMethod
    public void closeAppSwitch() {
        driver.resetApp();
    }
}
