package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeServices;
import lippia.web.services.ShopServices;

import static lippia.web.services.HomeServices.closeAds;


public class ShopSteps extends PageSteps {
    @And("hace click en el boton view basket y visualiza los importes total y sub total")
    public void PaginaDePagoYVisualizarImportes() {
        ShopServices.clickBtnViewBasket();
        closeAds();
    }

    @When ("hace click en el boton proceed to checkout")
    public void btnCheckout(){
        ShopServices.clickBtnCheckout();
    }

    @And("completa el formulario y selecciona una forma de pago")
    public void FormularioYSeleccionFormaPago() {
        ShopServices.FormularioYSeleccionFormaPago();
    }

    @Then("se verifica que puede agregar un cupon (.*) y visualizar los detalles de la facturacion")
    public void verificarCuponYValidarPage(String cupon) {
        ShopServices.verificarCuponYValidaPage(cupon);
    }

    @Then("se visualiza la pantalla de confirmacion de pedido y los datos de la factura")
    public void VisualizaLaPantallaDePedidoYDatosDeFactura() {
        ShopServices.validarPageOrderDetails();
    }


    @And("hace click en el boton place order")
    public void ClickBotonPlaceOrder() {
        ShopServices.clickBtnPlaceOrder();
    }

    @And("añade un libro al carrito de compras")
    public void agregaLibroAlCarrito() {
        ShopServices.agregaLibroAlCarrito();
    }

    @Then("se verifica la tasa impositiva para india es de porcentaje 2 y para el extranjero 5")
    public void seVerificaLaTasaImpositivaParaIndiaYParaElExtranjero() {
        ShopServices.validarTasaImpositiva();
    }
}