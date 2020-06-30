package Operation;

import Data.ObjectElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class BaseLogout extends Driver{

    public void launchAppSwitch() throws MalformedURLException {
        setupAppium();
    }

    public void testValidLogout() {
        driver.findElement(By.id(ObjectElement.MenuPageObject.btnProfile)).click();
        driver.findElement(By.id(ObjectElement.ProfilePageObject.btnLogout)).click();
        driver.findElement(By.id(ObjectElement.ProfilePageObject.btnConfirmLogout)).click();
    }

    public void testCloseAppSwitch() {
        closeApp();
    }
}
