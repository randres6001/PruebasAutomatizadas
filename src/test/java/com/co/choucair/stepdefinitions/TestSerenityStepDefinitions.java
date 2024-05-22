package com.co.choucair.stepdefinitions;

import com.co.choucair.models.UserLoombokData;
import com.co.choucair.questions.ValidateTheUnit;
import com.co.choucair.tasks.CreateABusiness;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.co.choucair.userinterfaces.BusinessPage.LBL_VALIDATION;
import static com.co.choucair.utils.GlobalData.ACTOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class TestSerenityStepDefinitions {

    @When("the user attempts to create a business unit with")
    public void theUserAttemptsToCreateABusinessUnitWith(DataTable table) {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                CreateABusiness.unit(UserLoombokData.setData(table).get(0))
        );
    }

    @Then("^the user will see the business unit created with (.*)$")
    public void theUserWillSeeTheBusinessUnitCreatedWithName(String unidad) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidateTheUnit.created(LBL_VALIDATION.of(unidad)))
        );
    }


}

