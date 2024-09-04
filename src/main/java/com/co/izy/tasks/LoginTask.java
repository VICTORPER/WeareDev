package com.co.izy.tasks;

import com.co.izy.interactions.WaitElement;
import com.co.izy.models.Credentials;
import com.co.izy.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class LoginTask implements Task {

    Credentials credentials;

    public LoginTask(Credentials credentials){
        this.credentials = credentials;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(credentials.getUsername()).into(LoginPage.TXT_USERNAME),
                Enter.theValue(credentials.getPassword()).into(LoginPage.TXT_PASSWORD),
                Click.on((LoginPage.BTN_LOGIN))


                //WaitElement.untilAppears(LoginPage.BTN_LOGIN),
        );
    }

    public static LoginTask enterCredentials(Credentials credentials) {
        return Tasks.instrumented(LoginTask.class, credentials);
    }
}
