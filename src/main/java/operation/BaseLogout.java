package operation;

import constants.ObjectElement;
import org.openqa.selenium.By;

public class BaseLogout extends BaseTest {

    public By btnConfirmLogout = By.id(ObjectElement.ProfilePageObject.btnConfirmLogout);

    public By btnLoginHere = By.id(ObjectElement.ProfilePageObject.btnLoginHere);

    public By btnCancelLogout = By.id(ObjectElement.ProfilePageObject.btnCancelLogout);
}
