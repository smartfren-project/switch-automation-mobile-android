package pages;

import operation.BaseHomepage;

public class HomePages {

    BaseHomepage baseHomepage = new BaseHomepage();

    public void testUserCanMoveToMainMenuPage() throws InterruptedException {
        baseHomepage.clickButtonDeals();
        Thread.sleep(2500);
        baseHomepage.clickButtonQuest();
        Thread.sleep(2500);
        baseHomepage.clickButtonHistory();
        Thread.sleep(2500);
        baseHomepage.clickButtonProfile();
        Thread.sleep(2500);
        baseHomepage.clickButtonHome();
        Thread.sleep(2500);
        baseHomepage.clickButtonNotification();
    }

    public void testUserUnableMoveToAllMenuExceptMainMenu() throws InterruptedException{
        baseHomepage.clickButtonDeals();
        baseHomepage.clickButtonCloseGuestPp();
        Thread.sleep(2500);
        baseHomepage.clickButtonQuest();
        baseHomepage.clickButtonCloseGuestPp();
        Thread.sleep(2500);
        baseHomepage.clickButtonHistory();
        baseHomepage.clickButtonCloseGuestPp();
        Thread.sleep(2500);
        baseHomepage.clickButtonProfile();
        baseHomepage.clickButtonCloseGuestPp();
        Thread.sleep(2500);
        baseHomepage.clickButtonHome();
        Thread.sleep(2500);
        baseHomepage.clickButtonNotification();
        baseHomepage.clickButtonCloseGuestPp();
    }
}
