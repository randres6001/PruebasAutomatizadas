package com.co.choucair.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.co.choucair.userinterfaces.SupplierPage.TEXT_COMPANY_NAME;

public class ValidateSupplier implements Question<String> {
    protected Target element;

    public ValidateSupplier(Target element) {
        this.element = element;
    }

    @Override
    public String answeredBy(Actor actor) {
        return element.resolveFor(actor).getText();
    }

    public static Question<String> created(Target element) {
        return new ValidateSupplier(element);
    }
}
