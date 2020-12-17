package operation;

import constants.ObjectElement;
import org.openqa.selenium.By;
import utilities.finders.ElementAction;

public class BaseDeals extends BaseTest {

    BaseHomepage baseHomepage = new BaseHomepage();
    ElementAction action = new ElementAction();

    public By btnPoint = By.id(ObjectElement.DealsPageObject.btnPoint);

    public By txtPointValue = By.id(ObjectElement.DealsPageObject.txtPointValue);

    public By btnRuby = By.id(ObjectElement.DealsPageObject.btnRuby);

    public By txtRubyValue = By.id(ObjectElement.DealsPageObject.txtRubyValue);

    public By btnSeeAllSpecialDeals = By.id(ObjectElement.DealsPageObject.btnSeeAllSpecialDeals);

    public By btnCheckVoucher = By.id(ObjectElement.DealsPageObject.btnSeeAllVoucher);

    public String btnMoreDeals = ObjectElement.DealsPageObject.btnSeeMore;

    public By btnBuyVoucher = By.id(ObjectElement.DealsPageObject.btnBuyVoucher);

    public By txtPointPrice = By.id(ObjectElement.DealsPageObject.txtPointPrice);

    public By txtRubyPrice = By.id(ObjectElement.DealsPageObject.txtRubyPrice);

    public Integer getPointsValue() {
        String pointsValue = action.getText(txtPointValue);
        try {
            return Integer.parseInt(pointsValue);
        } catch (Exception e) {
            return null;
        }
    }

    public Integer getRubiesValue() {
        String rubiesValue = action.getText(txtRubyValue);
        try {
            return Integer.parseInt(rubiesValue);
        } catch (Exception e) {
            return null;
        }
    }

    public Integer getPointOrRubiesPrice() {
        String rubiesPrice = action.getText(txtRubyPrice);
        String pointPrice = action.getText(txtPointPrice);

        if (driver.findElement(By.id(ObjectElement.DealsPageObject.txtPointPrice)).isDisplayed()
                && driver.findElement(By.id(ObjectElement.DealsPageObject.txtRubyPrice)).isDisplayed()) {
            try {
                return Integer.parseInt(rubiesPrice);
                return Integer.parseInt(pointPrice);
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
        String pointPrice = action.getText(txtPointPrice);
        try {
            return Integer.parseInt(pointPrice);
        } catch (Exception e) {
            return null;
        }
    }

    public Integer getRubyPrice() {
        String rubyPrice = action.getText(txtRubyPrice);
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
            action.click(btnBuyVoucher);
        } else {
            System.out.println("Amount Less Than Points and Rubies");
        }
    }

    public void checkAmountPointsOrRubiesToBuyVoucher() {
        if (getPointsValue() > getPointPrice()) {
            System.out.println(getPointsValue());
            System.out.println(getPointPrice());
            action.click(btnBuyVoucher);
        } else if (getRubiesValue() > getRubyPrice()) {
            System.out.println(getRubiesValue());
            System.out.println(getRubyPrice());
            action.click(btnBuyVoucher);
        } else {
            System.out.println("Amount Less Than Points or Rubies");
        }
    }
}
