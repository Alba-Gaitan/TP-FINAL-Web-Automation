package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.MiAccountServices;


public class miAccountSteps extends PageSteps {
    @Then("visualiza el panel principal")
    public void ingresaALaPantallaPrincipalDeAplicacionWeb() {
        MiAccountServices.panelPrincipal();
    }

    @And("hace click en account details")
    public void clickEnAccountDetails() {
        MiAccountServices.clickEnAccountDetails();
    }

    @Then("visualiza los detalles de la cuenta y la opcion de cambiar password")
    public void verificarDetallesYcambiarPassword() {
        MiAccountServices.verificarDetallesYOpcioncambiarPassword();
    }

    @Then("se verifica que cierra sesion exitosamente")
    public void seVerificaQueCierraSesionExitosamente() {
        MiAccountServices.verificarCerrarSesion();
    }
}