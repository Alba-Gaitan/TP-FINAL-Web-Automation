package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

import static lippia.web.constants.LoginConstants.INPUT_LOGIN_PASS;
import static lippia.web.constants.LoginConstants.INPUT_LOGIN_USER;
import static lippia.web.constants.RegisterConstants.*;

public class RegisterServices extends ActionManager {

    public static void clickBtnRegister() {
        WebActionManager.waitVisibility(BTN_REGISTER);
        WebActionManager.click(BTN_REGISTER);
    }

    public static void loginFallidoPasswordVacio(String mensaje) {
        WebActionManager.waitVisibility(ERROR_MESSAGE_REGISTER);
        Assert.assertTrue(WebActionManager.getText(ERROR_MESSAGE_REGISTER).contains("Error: Please enter an account password."));

    }


    public static void btnRegisterDisabled() {

        Assert.assertFalse(WebActionManager.isEnabled(BTN_REGISTER));
    }

    public static void ingresaDatosFormRegister(String email, String password) {
        WebActionManager.waitVisibility(INPUT_EMAIL_REGISTER);
        setInput(INPUT_EMAIL_REGISTER, email);
        WebActionManager.waitVisibility(INPUT_PASS_REGISTER);
        setInput(INPUT_PASS_REGISTER, password);
    }

    public static void verificarMensaje(String mensaje) {
        WebActionManager.waitVisibility(ERROR_MESSAGE_REGISTER);
        Assert.assertTrue(WebActionManager.getText(ERROR_MESSAGE_REGISTER).contains("Error: Please provide a valid email address."));


    }
}
