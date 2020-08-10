package operation;

import constants.ObjectElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class BaseDeals extends BaseTest {
    BaseHomepage baseHomepage = new BaseHomepage();

    public void clickButtonCheckPoints() {
        driver.findElement(By.id(ObjectElement.DealsPageObject.btnPoint)).click();
    }

    public void clickButtonCheckRuby() {
        driver.findElement(By.id(ObjectElement.DealsPageObject.btnRuby)).click();
    }

    public void clickButtonSeeAllDeals() {
        driver.findElement(By.id(ObjectElement.DealsPageObject.btnSeeAllSpecialDeals)).click();
    }


}
