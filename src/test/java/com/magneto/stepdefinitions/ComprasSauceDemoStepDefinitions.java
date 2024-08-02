package com.magneto.stepdefinitions;

import com.magneto.questions.TextOf;
import com.magneto.task.*;
import com.magneto.utils.Constants;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;
import static com.magneto.userinterfaces.Complete.TITULO;


public class ComprasSauceDemoStepDefinitions {

    @Before
    public void setup() {
        setTheStage(new OnlineCast());
    }

    @Given("El usuario {string} esta en la pagina de inicio de SauceDemo")
    public void elUsuarioEstaEnLaPaginaDeInicioDeSauceDemo(String actorName) {
        theActorCalled(actorName).wasAbleTo(Open.url(Constants.URL));

    }

    @When("Inicia sesion con el usuario {string} y elige el producto para su compra")
    public void iiniciaSesionConElUsuarioYEligeElProductoParaSuCompra(String user) {
        theActorInTheSpotlight().attemptsTo(Login.in(user), Home.item(), Inventory.aggregate(), Cart.shopping());
    }

    @And("Llena los campos para la compra para finalizar su compra")
    public void llenaLosCamposParaLaCompraParaFinalizarSuCompra(List<Map<String, String>> userAllFields) {
        theActorInTheSpotlight().attemptsTo(Checkout.next(userAllFields),CheckoutTwo.overview());
    }

    @Then("Valida que el mensaje final sea {string}")
    public void ValidaQueElMensajeFinalSea(String mensaje) {
        theActorInTheSpotlight().should(seeThat(TextOf.field(TITULO.of(mensaje)),equalTo(mensaje)));
    }



}
