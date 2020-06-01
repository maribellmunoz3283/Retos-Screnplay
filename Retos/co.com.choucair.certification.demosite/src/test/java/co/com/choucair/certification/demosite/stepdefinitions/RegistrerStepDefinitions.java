package co.com.choucair.certification.demosite.stepdefinitions;


import co.com.choucair.certification.demosite.model.DataTable;
import co.com.choucair.certification.demosite.questions.TheAnswer;
import co.com.choucair.certification.demosite.tasks.OpenUp;
import co.com.choucair.certification.demosite.tasks.Register;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistrerStepDefinitions {



    @Given("^wants to access the Web Automation Demo Site$")
    public void wantsToAccessTheWebAutomationDemoSite() {
       theActorCalled("maribell").wasAbleTo(OpenUp.thePageDemoSite());

    }

    @When("^he performs the login on the page$")
    public void hePerformsTheLoginOnThePage(List<DataTable> dataTable) {
        theActorInTheSpotlight().attemptsTo(Register.user(dataTable));

    }

    @Then("^verifies that the screen is loading with text Double Click on Edit Icon to (.*) the Table Row$")
    public void verifiesThatTheScreenIsLoadingWithTextDoubleClickOnEditIconToEDITTheTableRow(String expectedWord)  {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheAnswer.is(), Matchers.equalTo(expectedWord)));

    }
}


// @Entonces("^el verifica que se carga la pantalla con texto Double Click on Edit Icon to (.*) the Table Row$")
//    public void elVerificaQueSeCargaLaPantallaConTextoDoubleClickOnEditIconToEDITTheTableRow(String palabraEsperada) {
//        theActorInTheSpotlight().should(GivenWhenThen.seeThat(LaRespuesta.es(), Matchers.equalTo(palabraEsperada)));
//    }