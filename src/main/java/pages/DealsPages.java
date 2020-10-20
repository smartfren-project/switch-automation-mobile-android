package pages;

import io.qameta.allure.Step;
import operation.BaseDeals;
import operation.BaseHomepage;
import utilities.finders.ElementAction;

public class DealsPages {

    ElementAction action = new ElementAction();
    BaseHomepage baseHomepage = new BaseHomepage();
    BaseDeals baseDeals = new BaseDeals();

    @Step("")
    public void testCheckValuePoints() {
    }

    @Step("")
    public void testCheckValueRuby() {
    }

    @Step("User Do Check Voucher")
    public void testCheckVoucherList() {
        action.click(baseHomepage.btnDeals);
        action.click(baseDeals.btnCheckVoucher);
    }

    @Step("User Do Check Point")
    public void testCheckPointsValue() {
        action.click(baseHomepage.btnDeals);
        action.click(baseDeals.btnPoint);
    }

    @Step("User Do Check Ruby")
    public void testCheckRubyValue() {
        action.click(baseHomepage.btnDeals);
        action.click(baseDeals.btnRuby);
    }

    @Step("User Do Check Wishlist")
    public void testMarkWishlistProduct() {
    }

    @Step("User Do Buy Voucher Using Ruby and Point")
    public void testBuyVoucherUsingRubyAndPoint() {
        action.click(baseHomepage.btnDeals);
        baseDeals.checkAmountPointsAndRubyToBuyVoucher();
    }

    @Step("User Do Buy Voucher Using Ruby or Point")
    public void testBuyVoucherUsingRubyOrPoint() {
        action.click(baseHomepage.btnDeals);
        baseDeals.checkAmountPointsOrRubiesToBuyVoucher();
    }
}
