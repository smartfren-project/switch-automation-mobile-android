package utilities.finders;

import operation.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ElementAction extends BaseTest {

    public void click(By element) {
        driver.findElement(element).click();
    }

    public String getText(By element) {
        String text = driver.findElement(element).getText();
        return text;
    }

    public void sendKeys(By element, String inputKey) {
        driver.findElement(element).sendKeys(inputKey);
    }

    public void checkerEqual(By element, String expected) {
        Assert.assertEquals(driver.findElement(element).getText(), expected);
    }

    public void checkerDisabled(By element) {
        Assert.assertFalse(driver.findElement(element).isEnabled());
    }

    public void checkerEnabled(By element) {
        Assert.assertTrue(driver.findElement(element).isEnabled());
    }

    public void checkerElementExist(By element) {
        Assert.assertNotNull(driver.findElement(element));
    }
}
