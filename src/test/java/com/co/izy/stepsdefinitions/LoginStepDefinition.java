package com.co.izy.stepsdefinitions;

import com.co.izy.exceptions.MessageException;
import com.co.izy.models.Credentials;
import com.co.izy.tasks.LoginTask;
import com.co.izy.utils.Constants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition {



@Managed
    WebDriver hisBrowser;
    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");//saldra en la reporteria quien esta ejecutando la prueba
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));//indicar cual instancia va abrir
    }

    @Given("user open the website")
    public void userOpenTheWebsite() {
      OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://demo.serenity.is/Account/Login/?ReturnUrl=%2F"));
    }
    @When("user enter the credentials")
    public void userEnterTheCredentials(List<Credentials> credentialsList) {


        Credentials credentials;
        credentials= credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.enterCredentials(credentials));

    }
    @Then("he will see the home page and waits for validation")
    public void heWillSeeTheHomePageAndWaitsForValidation() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        TheWebPage.title(),
                        Matchers.containsString(Constants.NAME_COMPARATION)).orComplainWith(MessageException.class, Constants.MessageExceptionCompare));
    }
}
