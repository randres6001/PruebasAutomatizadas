package com.co.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateToBusinessUnits implements Task {

    private static final Target MENU_BUSINESS_UNITS = Target.the("").locatedBy("");

    public static NavigateToBusinessUnits option() {
        return instrumented(NavigateToBusinessUnits.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_BUSINESS_UNITS)

        );
    }
}


