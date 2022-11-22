package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginServices;


public class LoginSteps extends PageSteps {
    @And("hace click en el boton mi cuenta")
    public void haceClickEnElBotonMiCuenta() {
        LoginServices.clickBtnMyAccount();
    }

    @And("ingresa usuario (.*) y password (.*)")
    public void ingresaUserAndPass(String user, String pass) {
        LoginServices.ingresaUsuarioYPass(user, pass);
    }
    @When("hace click en el boton login")
    public void haceClickEnElBotonLogin() {
        LoginServices.clickBtnLogin();
    }

    @Then("se verifica que no puede iniciar sesion y se visualiza el mensaje (.*)")
    public void loginIncorrectoYverificarMensaje(String mensaje) {
        LoginServices.loginFallido(mensaje);
    }
    @And("hace click en el boton logout")
    public void haceClickEnElBotonLogout() {
        LoginServices.clickBtnLogout();
    }

    @And("hace click en el boton back")
    public void ClickEnElBotonBack() {
        LoginServices.clickBtnBack();
    }

    @Then("se verifica que esta en la pantalla iniciar sesion")
    public void VerificaQueEstaEnLaPantallaIniciarSesion() {
        LoginServices.verificarPageLogin();
    }

}