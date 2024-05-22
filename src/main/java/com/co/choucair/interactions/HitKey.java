package com.co.choucair.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static net.serenitybdd.core.Serenity.getDriver;

public class HitKey implements Interaction {

    protected Keys key;

    public HitKey(Keys key) {
        this.key = key;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Actions action = new Actions(getDriver());
        action.sendKeys(key).build().perform();
    }

    public static HitKey on(Keys key){
        return Instrumented.instanceOf(HitKey.class).withProperties(key);
    }
}
