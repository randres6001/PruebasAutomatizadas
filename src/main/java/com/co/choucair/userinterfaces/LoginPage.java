package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_USER = Target.the("campo para usuario")
            .locatedBy("//input[@id='LoginPanel0_Username']");
    public static final Target TXT_PASS = Target.the("campo para contraseña")
            .locatedBy("//input[@id='LoginPanel0_Password']");
    public static final Target BTN_SUBMIT = Target.the("boton para iniciar sesion")
            .locatedBy("//button[@id='LoginPanel0_LoginButton']");
    public static final Target TXT_VALIDATION = Target.the("titulo de la pantalla principal")
            .locatedBy("//h1");
}
