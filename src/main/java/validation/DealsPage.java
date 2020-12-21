package validation;

import constants.ObjectElement;
import operation.BaseDeals;
import operation.BaseTest;
import org.openqa.selenium.By;
import utilities.finders.ElementAction;

public class DealsPage extends BaseTest {

    BaseDeals baseDeals =  new BaseDeals();
    ElementAction action = new ElementAction();

    public Integer getPointsValue() {
        String pointsValue = action.getText(baseDeals.txtPointValue);
        try {
            return Integer.parseInt(pointsValue);
        } catch (Exception e) {
            return null;
        }
    }

    public Integer getRubiesValue() {
        String rubiesValue = action.getText(baseDeals.txtRubyValue);
        try {
            return Integer.parseInt(rubiesValue);
        } catch (Exception e) {
            return null;
        }
    }

    public Integer getPointOrRubiesPrice() {
        String rubiesPrice = action.getText(baseDeals.txtRubyPrice);
        String pointPrice = action.getText(baseDeals.txtPointPrice);

        if (driver.findElement(By.id(ObjectElement.DealsPageObject.txtPointPrice)).isDisplayed()
                && driver.findElement(By.id(ObjectElement.DealsPageObject.txtRubyPrice)).isDisplayed()) {
            try {
                return Integer.parseInt(rubiesPrice);
            } catch (Exception e) {
                return null;
            }
        } else if (driver.findElement(By.id(ObjectElement.DealsPageObject.txtPointPrice)).isDisplayed()){
            try {
                return Integer.parseInt(rubiesPrice);
            } catch (Exception e) {
                return null;
            }
        } else if (driver.findElement(By.id(ObjectElement.DealsPageObject.txtRubyPrice)).isDisplayed()){
            try {
                return Integer.parseInt(pointPrice);
            } catch (Exception e) {
                return null;
            }
        } else {
            return null;
        }
    }

    public Integer getPointPrice() {
        String pointPrice = action.getText(baseDeals.txtPointPrice);
        try {
            return Integer.parseInt(pointPrice);
        } catch (Exception e) {
            return null;
        }
    }

    public Integer getRubyPrice() {
        String rubyPrice = action.getText(baseDeals.txtRubyPrice);
        try {
            return Integer.parseInt(rubyPrice);
        } catch (Exception e) {
            return null;
        }
    }

    public void checkAmountPointsAndRubyToBuyVoucher() {
        if (getPointsValue() > getPointPrice() && getRubiesValue() > getRubyPrice()) {
            System.out.println(getPointsValue());
            System.out.println(getPointPrice());
            System.out.println(getRubiesValue());
            System.out.println(getRubyPrice());
            action.click(baseDeals.btnBuyVoucher);
        } else {
            System.out.println("Amount Less Than Points and Rubies");
        }
    }

    public void checkAmountPointsOrRubiesToBuyVoucher() {
        if (getPointsValue() > getPointPrice()) {
            System.out.println(getPointsValue());
            System.out.println(getPointPrice());
            action.click(baseDeals.btnBuyVoucher);
        } else if (getRubiesValue() > getRubyPrice()) {
            System.out.println(getRubiesValue());
            System.out.println(getRubyPrice());
            action.click(baseDeals.btnBuyVoucher);
        } else {
            System.out.println("Amount Less Than Points or Rubies");
        }
    }
}
