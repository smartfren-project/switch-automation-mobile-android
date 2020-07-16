package operation;

import constants.ObjectElement;
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

    public void testSeeAllSpecialDeals() throws InterruptedException {
        baseHomepage.clickButtonDeals();
        //clickButtonSeeAllDeals();
        Thread.sleep(3000);
    }

    public void testCheckPointsValue() throws InterruptedException {
        baseHomepage.clickButtonDeals();
        Thread.sleep(3000);
        clickButtonCheckPoints();
        Thread.sleep(3000);
    }

    public void testCheckRubyValue() throws InterruptedException {
        baseHomepage.clickButtonDeals();
        Thread.sleep(3000);
        clickButtonCheckRuby();
        Thread.sleep(3000);
    }
}
