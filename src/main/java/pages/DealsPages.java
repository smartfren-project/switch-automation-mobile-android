package pages;

import operation.BaseDeals;
import operation.BaseHomepage;

public class DealsPages {

    BaseHomepage baseHomepage = new BaseHomepage();
    BaseDeals baseDeals = new BaseDeals();

    public void testSeeAllSpecialDeals() throws InterruptedException {
        baseHomepage.clickButtonDeals();
//        baseDeals.clickButtonSeeAllDeals();
        Thread.sleep(3000);
    }

    public void testCheckPointsValue() throws InterruptedException {
        baseHomepage.clickButtonDeals();
        Thread.sleep(3000);
        baseDeals.clickButtonCheckPoints();
        Thread.sleep(3000);
    }

    public void testCheckRubyValue() throws InterruptedException {
        baseHomepage.clickButtonDeals();
        Thread.sleep(3000);
        baseDeals.clickButtonCheckRuby();
        Thread.sleep(3000);
    }

    public void testMarkWishlistProduct() {
    }
}
