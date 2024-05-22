package com.co.choucair.tasks;

import com.co.choucair.interactions.HitKey;
import com.co.choucair.interactions.SelectFromList;
import com.co.choucair.interactions.SelectRandomList;
import com.co.choucair.models.UserLoombokData;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.co.choucair.userinterfaces.BusinessPage.*;
import static com.co.choucair.userinterfaces.ContactsPage.*;
import static com.co.choucair.userinterfaces.ContactsPage.BTN_ORGANIZATION;
import static com.co.choucair.userinterfaces.ContactsPage.BTN_SAVE;
import static com.co.choucair.userinterfaces.ContactsPage.LBL_VALIDATION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CreateAContact implements Task {

    protected UserLoombokData userLoombokData;

    public CreateAContact(UserLoombokData userLoombokData) {
        this.userLoombokData = userLoombokData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_ORGANIZATION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_ORGANIZATION),
                Click.on(BTN_CONTACTS),
                Click.on(BTN_CREATE_NEW_CONTACT),
                Enter.theValue(userLoombokData.getTitle()).into(TXT_CONTACT_TITLE),
                Enter.theValue(userLoombokData.getFirstName()).into(TXT_CONTACT_FIRST_NAME),
                Enter.theValue(userLoombokData.getLastName()).into(TXT_CONTACT_LAST_NAME),
                Enter.theValue(userLoombokData.getEmail()).into(TXT_CONTACT_EMAIL),
                Enter.theValue(userLoombokData.getId()).into(TXT_CONTACT_IDENTIFY),
                Click.on(TXT_USER),
                HitKey.on(Keys.ENTER),
               // Enter.theValue(Keys.DOWN).into(LST_USER),
               // SelectRandomList.on(LST_USER),
                Click.on(BTN_SAVE),
                Scroll.to(LBL_VALIDATION.of(userLoombokData.getFirstName()))
        );
    }

    public static CreateAContact unit(UserLoombokData userLoombokData) {
        return Instrumented.instanceOf(CreateAContact.class).withProperties(userLoombokData);
    }
}
