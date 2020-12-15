package operation;

import constants.ObjectElement;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import utilities.finders.ElementAction;

public class BaseHomepage extends BaseTest {

    ElementAction action = new ElementAction();

    public By icUserProfile = By.id(ObjectElement.MenuPageObject.txtUserProfile);

    public By btnHome = By.id(ObjectElement.MenuPageObject.btnHome);

    public By btnDeals = By.id(ObjectElement.MenuPageObject.btnDeals);

    public By btnQuest = By.id(ObjectElement.MenuPageObject.btnQuest);

    public By btnHistory = By.id(ObjectElement.MenuPageObject.btnHistory);

    public By btnProfile = By.xpath(ObjectElement.MenuPageObject.btnProfile);

    public By txtUserProfile = By.id(ObjectElement.MenuPageObject.txtUserProfile);

    public By btnNotification = By.id(ObjectElement.MenuPageObject.btnNotification);

    public By addPopUp = By.id(ObjectElement.MenuPageObject.addPopUp);

    public By btnClosePp = By.id(ObjectElement.MenuPageObject.btnCloseGuestPp);

    public By popUpLocation = By.id(ObjectElement.MenuPageObject.popUpLocation);

    public By buttonConfirmPopup = By.id(ObjectElement.MenuPageObject.buttonConfirmPopup);

    public By planBox = By.id(ObjectElement.MenuPageObject.planBox);

    public By btnBuyPlan = By.id(ObjectElement.MenuPageObject.btnBuyProduct);

    public By btnPlan = By.id(ObjectElement.MenuPageObject.btnPlan);

    public By btnCloseGuestPp = By.id(ObjectElement.MenuPageObject.btnCloseGuestPp);

    public By txtMainCardTitle = By.id(ObjectElement.MenuPageObject.txtMainCard);

    public By txtMainCardDesc = By.id(ObjectElement.MenuPageObject.txtDescMainCard);

    public By btnLetsSwitch = By.id(ObjectElement.MenuPageObject.btnLetsSwitch);

    public By txtLSTitle = By.id(ObjectElement.OrderSIMNumberPage.txtOrderSIMTitle);

    public By btnOrderSIM = By.id(ObjectElement.OrderSIMNumberPage.btnOrderSIM);

    public By btnDetail = By.id(ObjectElement.MenuPageObject.btnDetail);

    public By txtCheckBalanceRemaining = By.id(ObjectElement.MenuPageObject.txtBalance);

    public By txtCheckSMSRemaining = By.id(ObjectElement.MenuPageObject.txtSMSRemaining);

    public By txtCheckCallRemaining = By.id(ObjectElement.MenuPageObject.txtCallRemaining);

    public By btnCustomNow = By.xpath(ObjectElement.MenuPageObject.btnCustomNow);

    public By btnBigMission = By.xpath(ObjectElement.MenuPageObject.btnBigMission);

    public By btnECommerce = By.xpath(ObjectElement.MenuPageObject.btnECommerce);

    public By btnMixAndMax = By.id(ObjectElement.MenuPageObject.btnMixAndMax);

    public By txtDataRemaining = By.id(ObjectElement.MenuPageObject.txtDataRemaining);

    public By btnCustomPlan = By.id(ObjectElement.ProductPageObject.btnCustomPlan);

    public String btnSeeAllNews = ObjectElement.MenuPageObject.btnSeeAllNews;

    public String btnFirstNews = ObjectElement.MenuPageObject.btnFirstNews;

    public By btnBack = By.id(ObjectElement.MenuPageObject.btnBack);

    public By txtAlertPermissionLocation =  By.id(ObjectElement.MenuPageObject.txtAlertLocTitle);

    public By btnAllowPermissionLoc = By.id(ObjectElement.MenuPageObject.btnAllowLoc);

    public void checkAlertLocationPopup() {
        if (driver.findElement(By.id(ObjectElement.MenuPageObject.txtAlertLocTitle)).isDisplayed()) {
            action.click(btnAllowPermissionLoc);
        } else {
            return;
        }
    }

    public boolean passAlertLocation() {
        try {
            checkAlertLocationPopup();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
