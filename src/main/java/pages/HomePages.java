package pages;

import operation.BaseHomepage;
import utilities.finders.ElementAction;

public class HomePages {

    BaseHomepage baseHomepage = new BaseHomepage();
    ElementAction action = new ElementAction();

    public void testUserCanMoveToMainMenuPage() throws InterruptedException {
        action.click(baseHomepage.btnDeals);
        action.click(baseHomepage.btnQuest);
        action.click(baseHomepage.btnHistory);
        action.click(baseHomepage.btnProfile);
        action.click(baseHomepage.btnHome);
        action.click(baseHomepage.btnNotification);
    }

    public void testUserUnableMoveToAllMenuExceptMainMenu() throws InterruptedException{
        action.click(baseHomepage.btnDeals);
        action.click(baseHomepage.btnCloseGuestPp);
        action.click(baseHomepage.btnQuest);
        action.click(baseHomepage.btnCloseGuestPp);
        action.click(baseHomepage.btnHistory);
        action.click(baseHomepage.btnCloseGuestPp);
        action.click(baseHomepage.btnProfile);
        action.click(baseHomepage.btnCloseGuestPp);
        action.click(baseHomepage.btnHome);
        action.click(baseHomepage.btnNotification);
        action.click(baseHomepage.btnCloseGuestPp);
    }
}
