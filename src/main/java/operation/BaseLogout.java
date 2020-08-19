package operation;

import constants.BaseData;
import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.net.MalformedURLException;

public class BaseLogout extends BaseTest {

    public By btnConfirmLogout = By.id(ObjectElement.ProfilePageObject.btnConfirmLogout);

    public By btnLoginHere = By.id(ObjectElement.ProfilePageObject.btnLoginHere);

    public void clickButtonConfirmLogout() {
        driver.findElement(By.id(ObjectElement.ProfilePageObject.btnConfirmLogout)).click();
    }

    public void clickButtonLoginHere() {
        driver.findElement(By.id(ObjectElement.ProfilePageObject.btnLoginHere)).click();
    }
}
