package com.co.choucair.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SelectFromList implements Interaction {

    protected Target lstUnity;
    protected String option;

    public SelectFromList(Target lstUnity, String option) {
        this.lstUnity = lstUnity;
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement element = lstUnity.resolveFor(actor);
        List<WebElement> options = element.findElements(By.tagName("li"));
        for (WebElement i : options) {
            if (i.getText().contains(option)) {
                i.click();
                break;
            }
        }
    }

    public static SelectFromList on(Target lstUnity, String option) {
        return Instrumented.instanceOf(SelectFromList.class).withProperties(lstUnity, option);
    }

}
