package com.co.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavigateToContacts implements Task {

    private static final Target MENU_CONTACTS = Target.the("").locatedBy("");

    public static NavigateToContacts option() {
        return instrumented(NavigateToContacts.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_CONTACTS)

        );
    }
}


