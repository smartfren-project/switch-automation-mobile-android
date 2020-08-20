package pages;

import operation.BaseDeals;
import operation.BaseHomepage;
import utilities.finders.ElementAction;

public class DealsPages {

    ElementAction action = new ElementAction();
    BaseHomepage baseHomepage = new BaseHomepage();
    BaseDeals baseDeals = new BaseDeals();

    public void testSeeAllSpecialDeals() throws InterruptedException {
        action.click(baseHomepage.btnDeals);
        baseDeals.clickButtonSeeAllDeals();
        Thread.sleep(3000);
    }

    public void testCheckPointsValue() throws InterruptedException {
        action.click(baseHomepage.btnDeals);
        Thread.sleep(3000);
        action.click(baseDeals.btnPoint);
        Thread.sleep(3000);
    }

    public void testCheckRubyValue() throws InterruptedException {
        action.click(baseHomepage.btnDeals);
        Thread.sleep(3000);
        action.click(baseDeals.btnRuby);
        Thread.sleep(3000);
    }

    public void testMarkWishlistProduct() {
    }
}
