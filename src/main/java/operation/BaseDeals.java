package operation;

import constants.ObjectElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class BaseDeals extends BaseTest {
    BaseHomepage baseHomepage = new BaseHomepage();

    public By btnPoint = By.id(ObjectElement.DealsPageObject.btnPoint);

    public By txtPointValue = By.id(ObjectElement.DealsPageObject.txtPointValue);

    public By btnRuby = By.id(ObjectElement.DealsPageObject.btnRuby);

    public By txtRubyValue = By.id(ObjectElement.DealsPageObject.txtRubyValue);

    public By btnSeeAllSpecialDeals = By.id(ObjectElement.DealsPageObject.btnSeeAllSpecialDeals);

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
