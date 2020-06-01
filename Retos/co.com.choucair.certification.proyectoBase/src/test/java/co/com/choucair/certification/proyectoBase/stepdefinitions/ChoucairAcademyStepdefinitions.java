package co.com.choucair.certification.proyectoBase.stepdefinitions;

import co.com.choucair.certification.proyectoBase.tasks.Loguin;
import co.com.choucair.certification.proyectoBase.tasks.OpenUp;
import co.com.choucair.certification.proyectoBase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepdefinitions {

    @Before
    public void setStage () {OnStage.setTheStage(new OnlineCast());}


    @Given("^than Maribell wants to learn automation at the academy Choucair$")
    public void thanMaribellWantsToLearnAutomationAtTheAcademyChoucair()  {

        OnStage.theActorCalled("Maribell").wasAbleTo(OpenUp.thePage(), (Loguin.onThePage()));

    }


    @When("^she search for the course (.*) on the Choucair Academy platform$")
    public void sheSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(String course)  {

        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));

    }

    @Then("^she finds the course called resources Recursos Automatizacion Bancolombia$")
    public void sheFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia()  {

    }


}
