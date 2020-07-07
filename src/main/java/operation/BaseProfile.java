package operation;

import constants.BaseData;
import constants.ObjectElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class BaseProfile extends BaseTest{

    public BaseLogin baseLogin;

    public void launchAppSwitch() throws MalformedURLException {
        setupAppium();
    }

    public void clickButtonEditProfile() {
        driver.findElement(By.id(ObjectElement.ProfilePageObject.btnEdit)).click();
    }

    public void updateFullNameProfile() {
        String UserFullName = driver.findElement(By.id(ObjectElement.ProfilePageObject.inputFullName)).getText();
        if (UserFullName.equals(BaseData.Validation.VALIDATION_USERNAME_1)) {
            driver.findElement(By.id(ObjectElement.ProfilePageObject.inputFullName)).sendKeys(BaseData.Validation.VALIDATION_USERNAME_2);
        } else if (UserFullName.equals(BaseData.Validation.VALIDATION_USERNAME_2)) {
            driver.findElement(By.id(ObjectElement.ProfilePageObject.inputFullName)).sendKeys(BaseData.Validation.VALIDATION_USERNAME_1);
        }
    }

    public void testUpdateFullName() {

    }
}
