package com.co.izy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_USERNAME = Target.the("Ingresar usuario").locatedBy("//input[@id='LoginPanel0_Username']");

    public static final Target TXT_PASSWORD = Target.the("Ingresar contraseña").locatedBy("//input[@id='LoginPanel0_Password']");

    public static final Target BTN_LOGIN = Target.the("click en el boton de login").locatedBy("//button[@id='LoginPanel0_LoginButton']");


    public static final Target Compare = Target.the("Capture name")
            .locatedBy("//*[@id='user']/ul/li[1]/span/text()");

}
