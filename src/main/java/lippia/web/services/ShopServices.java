package lippia.web.services;

import static lippia.web.constants.ShopConstants.*;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import com.sun.jna.platform.win32.OaIdl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.HomeConstants.*;
import static lippia.web.services.HomeServices.*;

public class ShopServices extends ActionManager {
    public static void clickBtnViewBasket() {
        WebActionManager.waitVisibility(BTN_VIEW_BASKET);
        WebActionManager.getElement("xpath://a[text()='View Basket']").click();
        closeAds();
        WebActionManager.waitVisibility(TXT_SUBTOTAL);
        Assert.assertTrue(WebActionManager.getText(TXT_SUBTOTAL).contains("Subtotal")
                && WebActionManager.getText(TXT_TOTAL).contains("Total"));

    }

    public static void clickBtnCheckout() {
        WebActionManager.waitVisibility(BTN_CHECKOUT);
        WebActionManager.click(BTN_CHECKOUT);
    }

    public static void FormularioYSeleccionFormaPago() {
        setInput(INPUT_FIRST_NAME, "Alba");
        setInput(INPUT_LAST_NAME, "Gaitan");
        setInput(INPUT_COMPANY_NAME, "Crowdar");
        setInput(INPUT_EMAIL, "alba@alba.com");
        setInput(INPUT_PHONE, "113456789");
        setInput(INPUT_APARMENT, "11");
        setInput(INPUT_ADRESS, "calle falsa 123");
        setInput(INPUT_TOWN_CITY, "cordoba");
        setInput(INPUT_POST_CODE, "5000");
        seleccionaFormaPago();

    }

    public static void validaPageFacturacion() {
        WebActionManager.waitVisibility(BILLING_DETAILS);
        Assert.assertTrue(WebActionManager.isVisible(BILLING_DETAILS) &&
                WebActionManager.isVisible(ADDITIONAL_INFORMATION)
                && WebActionManager.isVisible(LIST_ORDER) && WebActionManager.isVisible(LIST_FORMA_PAGO));
    }

    public static void verificarCuponYValidaPage(String cupon) {

        WebDriver driver = DriverManager.getDriverInstance().getWrappedDriver();
        Actions builder = new Actions(driver);
        WebElement elem = WebActionManager.getElement(ENTER_CODE_CUPON);
        builder.moveToElement(elem).click().build().perform();

        WebActionManager.waitVisibility(INPUT_CODE_CUPON);
        setInput(INPUT_CODE_CUPON, cupon);
        WebActionManager.getElement("xpath://*[@id=\"page-35\"]/div/div[1]/form[2]/p[2]/input").click();
        validaPageFacturacion();
    }

    public static void seleccionaFormaPago() {
        List<WebElement> formaPago = WebActionManager.getElements(LIST_FORMA_PAGO);
        for (WebElement selector : formaPago) {
            if (selector.getText().equalsIgnoreCase(LIST_FORMA_PAGO)) {
                WebActionManager.click(selector);
            }
        }
    }


    public static void clickBtnPlaceOrder() {
        WebActionManager.waitVisibility(BTN_PLACE_ORDER);
        WebActionManager.click(BTN_PLACE_ORDER);
    }

    public static void validarPageOrderDetails() {
        Assert.assertTrue(WebActionManager.getText(MESSAGE_CONFIRMATION_ORDER).equalsIgnoreCase("Thank you. Your order has been received.")
                && WebActionManager.isVisible(ORDER_NUMBER) && WebActionManager.isVisible(ORDER_DATE)
                && WebActionManager.isVisible(ORDER_PRICE) && WebActionManager.isVisible(ORDER_PAYMENT)
                && WebActionManager.isVisible(ORDER_PRODUCT) && WebActionManager.isVisible(ORDER_SUB_TOTAL)
                && WebActionManager.isVisible(ORDER_TOTAL));
    }

    /*
        public static void seleccionPais(String pais) {
            List<WebElement> dropdownList = WebActionManager.getDropdownAllSelectedOptions(LIST_COUNTRY);
            for (WebElement selector : dropdownList) {
                if (selector.getText().equalsIgnoreCase(LIST_COUNTRY)) {
                    WebActionManager.click(pais);
                }
            }

        }

     */
    public static void agregaLibroAlCarrito() {
        WebActionManager.getElement("xpath://a[@href='/shop/?add-to-cart=182']").click();
    }

    public static void validarTasaImpositiva() {
        WebActionManager.getElement("xpath://*[@id=\"s2id_billing_country\"]/a").click();
        WebActionManager.setInput(INPUT_SEARCH_PAIS, "india");
        WebActionManager.click(COUNTRY_INDIA);

        if (WebActionManager.isVisible(SELECTED_COUNTRY)) {
            Assert.assertTrue(WebActionManager.getText(TAX_INDIA).contains("3.60"));
        } else {
            Assert.assertTrue(WebActionManager.getText(TAX_EXTRANJERA).contains("9.00"));
        }

    }

}
