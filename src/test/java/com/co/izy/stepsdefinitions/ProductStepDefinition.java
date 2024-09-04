package com.co.izy.stepsdefinitions;

import com.co.izy.models.DataProduct;
import com.co.izy.models.DataRegister;
import com.co.izy.tasks.ProductTask;
import com.co.izy.tasks.RegisterTask;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class ProductStepDefinition {

    @When("^he user enter de data for the register new product$")
    public void heUserEnterDeDataForTheRegisterNewProduct(List<DataProduct> dataRegisterList) {
        DataProduct dataproduct;
        dataproduct = dataRegisterList.get(0);

        OnStage.theActorInTheSpotlight().attemptsTo(ProductTask.enter(dataproduct));
    }


    @Then("^new product register succesfull$")
    public void newProductRegisterSuccesfull() {
        // Write code here that turns the phrase above into concrete actions
    }
}
