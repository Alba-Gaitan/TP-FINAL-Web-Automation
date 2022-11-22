package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import static lippia.web.constants.LoginConstants.*;

import java.util.List;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.HomeConstants.*;
import static lippia.web.services.HomeServices.closeAds;

public class LoginServices extends ActionManager {

    public static void clickBtnMyAccount() {
        WebActionManager.click(BTNMYACCOUNT);
        closeAds();

    }
    public static void ingresaUsuarioYPass(String users, String pass) {
        WebActionManager.waitVisibility(INPUT_LOGIN_USER);
        setInput(INPUT_LOGIN_USER, users );
        WebActionManager.waitVisibility(INPUT_LOGIN_PASS);
        setInput(INPUT_LOGIN_PASS, pass);
    }
    public static void clickBtnLogin() {
        WebActionManager.waitVisibility(BTN_LOGIN);
        WebActionManager.click(BTN_LOGIN);
    }
    public static void loginFallido(String mensaje) {
        WebActionManager.waitVisibility(ERROR_MESSAGE_LOGIN);
        Assert.assertTrue(WebActionManager.getText(ERROR_MESSAGE_LOGIN).equalsIgnoreCase("Error"));
    }
    public static void clickBtnLogout() {
        WebActionManager.waitVisibility(BTN_LOGOUT);
        WebActionManager.click(BTN_LOGOUT);
    }

    public static void clickBtnBack() {
        WebDriver driver = DriverManager.getDriverInstance().getWrappedDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.history.back()");
    }

    public static void verificarPageLogin() {
            WebActionManager.waitVisibility(TITLE_FORM_LOGIN);
            Assert.assertTrue(WebActionManager.getText(TITLE_FORM_LOGIN).equalsIgnoreCase("Login"));
    }
}
