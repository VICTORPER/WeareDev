package com.co.izy.stepsdefinitions;

import com.co.izy.exceptions.MessageException;
import com.co.izy.models.DataRegister;
import com.co.izy.tasks.RegisterTask;
import com.co.izy.utils.Constants;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterStepDefinition {


    @When("^he user enter de data for the register$")
    public void heUserEnterDeDataForTheRegister(List<DataRegister> dataRegisterList) {
        DataRegister dataRegister;
        dataRegister = dataRegisterList.get(0);

        OnStage.theActorInTheSpotlight().attemptsTo(RegisterTask.enter(dataRegister));
    }


    @Then("^new user register succesfull$")
    public void newUserRegisterSuccesfull() {

        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        TheWebPage.title(),
                        Matchers.containsString(Constants.NAME_CUSTOMER)).orComplainWith(MessageException.class, Constants.MessageExceptionCompare));
    }

}
