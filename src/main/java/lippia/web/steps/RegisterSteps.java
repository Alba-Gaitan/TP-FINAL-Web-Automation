package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.RegisterServices;
import lippia.web.services.ShopServices;


public class RegisterSteps extends PageSteps {

    @When("hace click en el boton register")
    public void haceClickEnElBotonRegister() {
        RegisterServices.clickBtnRegister();
    }

    @Then("el usuario no puede iniciar sesion y se visualiza el mensaje (.*)")
    public void UsuarioNoIniciaSesionYVisualizaElMensaje(String mensaje) {
        RegisterServices.loginFallidoPasswordVacio(mensaje);
    }

    @Then("se verifica que el boton register no esta habilitado")
    public void seVerificaQueElBotonRegisterNoEstaHabilitado() {
        RegisterServices.btnRegisterDisabled();
    }

    @And("ingresa email (.*) y password (.*) en el formulario de registro")
    public void ingresaEmailYPasswordEnElFormularioDeRegistro(String email, String password) {
        RegisterServices.ingresaDatosFormRegister(email, password);
    }

    @Then("el usuario visualiza el mensaje (.*)")
    public void elUsuarioVisualizaElMensajeMensaje(String mensaje) {
        RegisterServices.verificarMensaje(mensaje);
    }
}