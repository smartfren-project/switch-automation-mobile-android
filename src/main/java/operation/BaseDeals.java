package operation;

import constants.ObjectElement;
import org.openqa.selenium.By;
import utilities.finders.ElementAction;

public class BaseDeals extends BaseTest {

    BaseHomepage baseHomepage = new BaseHomepage();

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


}
