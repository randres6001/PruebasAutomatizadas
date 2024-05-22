package com.co.choucair.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Random;

public class SelectRandomList implements Interaction {

    protected Target element;
    protected Random randon = new Random();
    protected int randonNum;

    public SelectRandomList(Target element) {
        this.element = element;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement elemento = element.resolveFor(actor);
        List<WebElement> opciones = elemento.findElements(By.tagName("li"));
        randonNum = randon.nextInt(opciones.size())+1;
        opciones.get(randonNum).click();

    }

    public static SelectRandomList on(Target element){
        return Instrumented.instanceOf(SelectRandomList.class).withProperties(element);
    }
}
