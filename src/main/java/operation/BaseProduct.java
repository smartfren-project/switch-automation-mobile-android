package operation;

import constants.ObjectElement;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;

public class BaseProduct extends BaseTest {
    public By txtProductTitle = By.id(ObjectElement.ProductPageObject.txtProductTitle);

    public By btnAddToCart = By.id(ObjectElement.ProductPageObject.btnAddToCart);

    public By txtCheckPriceDesc = By.id(ObjectElement.ProductPageObject.txtCheckPriceDesc);

    public By btnDecrease = By.id(ObjectElement.ProductPageObject.btnDecrease);

    public By btnIncrease = By.id(ObjectElement.ProductPageObject.btnIncrease);

    public By productCardOne = By.id(ObjectElement.ProductPageObject.productCardOne);

    public By productCardTwo = By.id(ObjectElement.ProductPageObject.productCardTwo);

    public By productCardThree = By.id(ObjectElement.ProductPageObject.productCardThree);

    public By productCardFour = By.id(ObjectElement.ProductPageObject.productCardFour);

    public By btnConfirmBuy = By.id(ObjectElement.ProductPageObject.btnConfirmBuy);

    public By btnChoosePayment = By.id(ObjectElement.ProductPageObject.btnChoosePayment);

    public By btnSeeDetail = By.id(ObjectElement.ProductPageObject.btnSeeDetail);

    public String btnPromoSuperBundle = ObjectElement.ProductPageObject.btnPromoSuperBundle;

    public String btnPromoPowerBundle = ObjectElement.ProductPageObject.btnPromoPowerBundle;

    public String btnPromoStandardBundle = ObjectElement.ProductPageObject.btnPromoStandardBundle;

    public String btnPromoLiteBundle = ObjectElement.ProductPageObject.btnPromoLiteBundle;
}
