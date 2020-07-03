package tests;

import listeners.TestAllureListener;
import operation.BaseLogin;
import operation.BaseLogout;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

@Listeners({TestAllureListener.class})
public class LogoutITest extends BaseLogout {

    public BaseLogin baseLogin;

    @BeforeSuite
    public void setUp() throws MalformedURLException {
        launchAppSwitch();
    }

    @Test
    public void checkValidLogout() throws InterruptedException {
        testLogin();
        testValidLogout();
    }

    @AfterSuite
    public void closeApp() throws InterruptedException {
        testCloseAppSwitch();
    }
}
