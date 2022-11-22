package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomeServices;

import static lippia.web.services.HomeServices.closeAds;


public class HomeSteps extends PageSteps {

    @Given("El usuario esta en la pagina de automation practice")
    public void home() {
        HomeServices.navegarWeb();
    }

    @And("hace click en el boton shop")
    public void clickBtnShop() {
            HomeServices.clickBotonShop();
            closeAds();
        }
    @And("hace click en el boton home")
    public void clickBtnHome() {
        HomeServices.clickBtnHome();

    }

    @And("recorre la pantalla visualizando tres Arrivals")
    public void VisualizarTresSliders() {
        HomeServices.verifySlider();
    }

    @And("selecciona una imagen Arrivals Mastering JavaScript")
    public void seleccionaUnaImagenArrivals() {
        HomeServices.seleccionaUnaImagenArrivals();
    }


    @When("hace click en el boton añadir al carrito")
    public void haceClickEnElBotonAñadirAlCarrito() {
        HomeServices.btnAñadirCarrito();
    }
}