package pages;

import operation.BaseDeals;
import operation.BaseHomepage;
import utilities.finders.ElementAction;

public class DealsPages {

    ElementAction action = new ElementAction();
    BaseHomepage baseHomepage = new BaseHomepage();
    BaseDeals baseDeals = new BaseDeals();

    public void testCheckVoucherList() {
        action.click(baseHomepage.btnDeals);
        action.click(baseDeals.btnCheckVoucher);
    }

    public void testCheckPointsValue() {
        action.click(baseHomepage.btnDeals);
        action.click(baseDeals.btnPoint);
    }

    public void testCheckRubyValue() {
        action.click(baseHomepage.btnDeals);
        action.click(baseDeals.btnRuby);
    }

    public void testMarkWishlistProduct() {
    }
}
