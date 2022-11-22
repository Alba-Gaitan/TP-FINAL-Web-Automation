package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;

import static lippia.web.constants.MiAccountConstants.*;
import static lippia.web.services.HomeServices.closeAds;

public class MiAccountServices extends ActionManager {

       public static void panelPrincipal() {
        WebActionManager.waitVisibility(DASHBOARD);
        Assert.assertTrue(WebActionManager.isVisible(DASHBOARD));
    }

    public static void clickEnAccountDetails() {
        WebActionManager.waitVisibility(LINK_ACCOUNT_DETAIL);
        WebActionManager.click(LINK_ACCOUNT_DETAIL);
        closeAds();
    }

    public static void verificarDetallesYOpcioncambiarPassword() {
        WebActionManager.waitVisibility(LABEL_FIRST_NAME);
           WebActionManager.isVisible(LABEL_FIRST_NAME);
           Assert.assertTrue(WebActionManager.isPresent(LABEL_FIRST_NAME) && WebActionManager.isPresent(LABEL_FIRST_NAME)
           && WebActionManager.isPresent(LABEL_EMAIL_ADRESS) && WebActionManager.isPresent(LABEL_PASSWORD_CURRENT)
                   && WebActionManager.isPresent(LABEL_NEW_PASSWORD) &&  WebActionManager.isPresent(BTN_SAVE_CHANGES));
              }



    public static void verificarCerrarSesion() {
           WebActionManager.waitVisibility(TITLE_LOGIN);
           Assert.assertTrue(WebActionManager.getText(TITLE_LOGIN).equalsIgnoreCase("Login"));
    }
}
