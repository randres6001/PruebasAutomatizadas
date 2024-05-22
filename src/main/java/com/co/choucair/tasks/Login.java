package com.co.choucair.tasks;

import com.co.choucair.models.UserLoombokData;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.choucair.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {


    UserLoombokData userLoombokData;

    public Login(UserLoombokData userLoombokData) {
        this.userLoombokData = userLoombokData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_USER, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(userLoombokData.getUser()).into(TXT_USER),
                Enter.theValue(userLoombokData.getPass()).into(TXT_PASS),
                JavaScriptClick.on(BTN_SUBMIT),
                WaitUntil.the(TXT_VALIDATION, isVisible()).forNoMoreThan(10).seconds()
        );
    }

    public static Login onTheSite(UserLoombokData userLoombokData){
        return Instrumented.instanceOf(Login.class).withProperties(userLoombokData);
    }
}
