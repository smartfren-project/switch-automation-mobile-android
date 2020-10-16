package pages;

import io.qameta.allure.Step;
import operation.BaseHomepage;
import utilities.finders.ElementAction;

public class HomePages {

    BaseHomepage baseHomepage = new BaseHomepage();
    ElementAction action = new ElementAction();

    @Step("User Can Go To All Main Menu Page")
    public void testUserCanMoveToMainMenuPage() throws InterruptedException {
        action.click(baseHomepage.btnDeals);
        action.click(baseHomepage.btnQuest);
        action.click(baseHomepage.btnProfile);
        action.click(baseHomepage.btnHome);
        action.click(baseHomepage.btnNotification);
    }

    @Step("User Can't Go To All Main Menu Page")
    public void testUserUnableMoveToAllMenuExceptMainMenu() throws InterruptedException{
        action.click(baseHomepage.btnDeals);
        action.click(baseHomepage.btnCloseGuestPp);
        action.click(baseHomepage.btnQuest);
        action.click(baseHomepage.btnCloseGuestPp);
        action.click(baseHomepage.btnPlan);
        action.click(baseHomepage.btnCloseGuestPp);
        action.click(baseHomepage.btnProfile);
        action.click(baseHomepage.btnCloseGuestPp);
        action.click(baseHomepage.btnHome);
        action.click(baseHomepage.btnNotification);
        action.click(baseHomepage.btnCloseGuestPp);
    }

    @Step("User Click Detail Plan")
    public void testUserCanCheckDetailPlan() {
        action.click(baseHomepage.btnDetail);
    }

    @Step("User Check Balance")
    public void testUserCanCheckBalanceRemaining() {
        String balance = action.getText(baseHomepage.txtCheckBalanceRemaining);
        System.out.println(balance);
    }

    @Step("User Check Message")
    public void testUserCanCheckMessageRemaining() {
        String message = action.getText(baseHomepage.txtCheckSMSRemaining);
        System.out.println(message);
    }

    @Step("User Check Call")
    public void testUserCanCheckCallRemaining() {
        String call = action.getText(baseHomepage.txtCheckCallRemaining);
        System.out.println(call);
    }

    @Step("User Can Click Custom Now")
    public void testUserCanClickCustomNow() {
        action.click(baseHomepage.btnCustomNow);
    }

    @Step("User Can Click Big Mission")
    public void testUserCanClickBigMission() {
        action.click(baseHomepage.btnBigMission);
    }

    @Step("User Can Click E-Commerce")
    public void testUserCanClickECommerce() {
        action.click(baseHomepage.btnECommerce);
    }

    @Step("User Can Check Data Remaining")
    public void testUserCanCheckDataRemaining() {

    }

    @Step("User Can Click Mix and Max")
    public void testUserCanClickMixAndMax() {
        action.click(baseHomepage.btnMixAndMax);
    }

    @Step("User Can Click See All News Button")
    public void testUserCanClickSeeAllNewsButton() {
        action.clickElementScroll(baseHomepage.btnSeeAllNews);
    }

    @Step("User Can Click First News")
    public void testUserCanClickFirstNews() {
        action.clickElementScroll(baseHomepage.btnFirstNews);
    }
}
