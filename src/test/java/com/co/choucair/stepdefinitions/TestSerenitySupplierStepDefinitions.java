package com.co.choucair.stepdefinitions;

import com.co.choucair.models.SupplierData;
import com.co.choucair.models.SupplierDataFactory;
import com.co.choucair.questions.ValidateSupplier;
import com.co.choucair.tasks.CreateASupplier;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static com.co.choucair.userinterfaces.SupplierPage.LBL_VALIDATION;
import static com.co.choucair.utils.GlobalData.ACTOR;
import static com.co.choucair.utils.GlobalData.URL;
import static org.hamcrest.Matchers.containsString;

public class TestSerenitySupplierStepDefinitions {

    @Given("^the user wants to create a new supplier$")
    public void theUserWantsToCreateANewSupplier() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URL));

    }

    @When("^the user attempts to create a Supplier with$")
    public void theUserAttemptsToCreateASupplierWith(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CreateASupplier.unit(SupplierDataFactory.setData(dataTable).get(0))
        );
    }

    @Then("^the user will see the supplier created with (.*)$")
    public void theUserWillSeeTheSupplierCreatedWithAcmeCorporation(String name) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ValidateSupplier.created(LBL_VALIDATION.of(name)), containsString(name))
        );
    }

}
