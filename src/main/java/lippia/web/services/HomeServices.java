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
import static lippia.web.constants.HomeConstants.*;
import static lippia.web.constants.ShopConstants.*;
import static lippia.web.services.ShopServices.*;


public class HomeServices extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void closeAds() {
        WebDriver driver = DriverManager.getDriverInstance();
        try {
            WebElement iframe1 = getElement(AD_IFRAME1_XPATH);
            if (iframe1.isDisplayed()) {
                driver.switchTo().frame(iframe1);
                try {
                    getElement(AD_CLOSE_BUTTON_XPATH).click();
                } catch (Exception e) {
                    WebElement iframe2 = getElement(AD_IFRAME2_XPATH);
                    driver.switchTo().frame(iframe2);
                    click(AD_CLOSE_BUTTON_XPATH);
                }
                driver.switchTo().defaultContent();
            }
        } catch (Exception e) {
            System.out.println("NO ADS!");
        }
    }

    public static void clickBotonShop() {
        WebActionManager.waitVisibility(BUTTON_SHOP);
        WebActionManager.click(BUTTON_SHOP);
        closeAds();
    }
    public static void clickBtnHome() {

        WebActionManager.waitVisibility(BUTTON_HOME);
        WebDriver driver = DriverManager.getDriverInstance().getWrappedDriver();
        Actions builder = new Actions(driver);
        WebElement elem = WebActionManager.getElement("XPATH://a[contains(string(),'Home')]");
        builder.moveToElement(elem).click().build().perform();
        closeAds();

    }

    public static void verifySlider() {
        WebActionManager.waitVisibility(LIST_SLIDER);
        Assert.assertTrue(WebActionManager.isPresent(LIST_SLIDER));
    }


    public static void seleccionaUnaImagenArrivals(){
        WebActionManager.waitVisibility(ARRIVALS_IMG);
        WebActionManager.click(ARRIVALS_IMG);
    }


    public static void btnAñadirCarrito() {
        WebActionManager.waitVisibility(BTN_ADDTOBASKET);
        WebActionManager.getElement("xpath://button[contains(@class,'button button alt')]").click();
        WebActionManager.waitVisibility(MESSAGE_CONFIRMATION_ADDTOBASKET);
        Assert.assertTrue(WebActionManager.getText(MESSAGE_CONFIRMATION_ADDTOBASKET).contains("has been added to your basket."));
    }

}
