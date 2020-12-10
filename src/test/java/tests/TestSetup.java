package tests;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import operation.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.net.MalformedURLException;

public class TestSetup extends BaseTest {
    
    @Parameters({"deviceName"})
    @BeforeSuite
    public void setUp() throws IOException {
        setupAppium("localURL");
    }


    @AfterMethod
    public void closeAppSwitch() throws IOException {
        closeApp();
    }
}
