package com.co.choucair.stepdefinitions;

import com.co.choucair.models.UserLoombokData;
import com.co.choucair.questions.ValidateContact;
import com.co.choucair.tasks.CreateAContact;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.co.choucair.userinterfaces.ContactsPage.LBL_VALIDATION;
import static com.co.choucair.utils.GlobalData.ACTOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class TestSerenitySecondStepDefinitions {

    @When("the user attempts to create a Contact with")
    public void theUserAttemptsToCreateAContactWith(DataTable table) {
        OnStage.theActorCalled(ACTOR).attemptsTo(
                CreateAContact.unit(UserLoombokData.setData(table).get(0))
        );
    }

    @Then("^the user will see the contact created with (.*)$")
    public void theUserWillSeeTheContactCreatedWith(String firstName) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(ValidateContact.created(LBL_VALIDATION.of(firstName)))
        );
    }


}

