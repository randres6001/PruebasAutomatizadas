package com.co.choucair.tasks;

import com.co.choucair.interactions.SelectFromList;
import com.co.choucair.models.UserLoombokData;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.choucair.userinterfaces.BusinessPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreateABusiness implements Task {

    protected UserLoombokData userLoombokData;

    public CreateABusiness(UserLoombokData userLoombokData) {
        this.userLoombokData = userLoombokData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_ORGANIZATION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_ORGANIZATION),
                Click.on(BTN_BUSINESS_UNIT),
                Click.on(BTN_CREATE_NEW_UNIT),
                Enter.theValue(userLoombokData.getName()).into(TXT_UNIT_NAME),
                Click.on(TXT_LIST),
                SelectFromList.on(LST_UNITY, userLoombokData.getUnity()),
                Click.on(BTN_SAVE),
                WaitUntil.the(LBL_VALIDATION.of(userLoombokData.getName()), isVisible()).forNoMoreThan(10).seconds()

        );
    }

    public static CreateABusiness unit(UserLoombokData userLoombokData) {
        return Instrumented.instanceOf(CreateABusiness.class).withProperties(userLoombokData);
    }
}
