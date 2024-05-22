package com.co.choucair.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class NavigateToOrganization implements Task {

    private static final Target MENU_ORGANIZATION = Target.the("").locatedBy("");

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_ORGANIZATION)
        );
    }

    public static NavigateToOrganization option() {
        return instrumented(NavigateToOrganization.class);
    }
}
