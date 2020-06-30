package Runner;

import Operation.BaseLogout;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LogoutRunner extends BaseLogout {

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
    public void closeApp() {
        testCloseAppSwitch();
    }
}
