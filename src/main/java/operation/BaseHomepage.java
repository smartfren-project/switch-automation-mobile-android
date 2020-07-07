package operation;

import constants.ObjectElement;
import org.openqa.selenium.By;

public class BaseHomepage extends BaseTest {
    public BaseLogin baseLogin;

    public void clickButtonHome() {
        driver.findElement(By.id(ObjectElement.MenuPageObject.btnHome)).click();
    }

    public void clickButtonDeals() {
        driver.findElement(By.id(ObjectElement.MenuPageObject.btnDeals)).click();
    }

    public void clickButtonQuest() {
        driver.findElement(By.id(ObjectElement.MenuPageObject.btnQuest)).click();
    }

    public void clickButtonHistory() {
        driver.findElement(By.id(ObjectElement.MenuPageObject.btnHistory)).click();
    }

    public void clickButtonProfile() {
        driver.findElement(By.id(ObjectElement.MenuPageObject.btnProfile)).click();
    }

    public void checkUserName() {
        driver.findElement(By.id(ObjectElement.MenuPageObject.txtUserProfile));
    }

    public void clickButtonNotification() {
        driver.findElement(By.id(ObjectElement.MenuPageObject.btnNotification)).click();
    }
}