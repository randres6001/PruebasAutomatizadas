package com.co.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import com.co.choucair.models.SupplierData;
import net.serenitybdd.screenplay.Performable;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static com.co.choucair.userinterfaces.SupplierPage.*;

public class CreateASupplier implements Task {
    private final SupplierData supplier;

    public CreateASupplier(SupplierData supplier) {
        this.supplier = supplier;
    }

    public static Performable unit(SupplierData supplier) {
        return new CreateASupplier(supplier);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_NORTH, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTN_NORTH),
                Click.on(BTN_SUPPLIER),
                Click.on(BTN_CREATE_NEW_SUPPLIER),
                Enter.theValue(supplier.getCompanyName()).into(TEXT_COMPANY_NAME),
                Enter.theValue(supplier.getContactName()).into(TEXT_CONTACT_NAME),
                Enter.theValue(supplier.getContactTitle()).into(TEXT_CONTACT_TITLE),
                Enter.theValue(supplier.getAddress()).into(TEXT_ADDRESS),
                Enter.theValue(supplier.getRegion()).into(TEXT_REGION),
                Enter.theValue(supplier.getPostalCode()).into(TEXT_POSTAL_CODE),
                Enter.theValue(supplier.getCountry()).into(TEXT_COUNTRY),
                Enter.theValue(supplier.getCity()).into(TEXT_CITY),
                Enter.theValue(supplier.getPhone()).into(TEXT_PHONE),
                Enter.theValue(supplier.getFax()).into(TEXT_FAX),
                Enter.theValue(supplier.getHomePage()).into(TEXT_HOME_PAGE),
                Click.on(BUTTON_SAVE)
        );
    }
}
