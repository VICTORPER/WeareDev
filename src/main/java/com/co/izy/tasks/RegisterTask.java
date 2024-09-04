package com.co.izy.tasks;

import com.co.izy.models.DataRegister;
import com.co.izy.userinterfaces.LoginPage;
import com.co.izy.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegisterTask implements Task {
    DataRegister dataRegister;

    public RegisterTask(DataRegister dataRegister) {
        this.dataRegister = dataRegister;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterPage.BTN_NORTHWIND),
                Click.on(RegisterPage.BTN_CUSTOMER),
                Click.on(RegisterPage.BTN_NEWCUSTOMER),
                Enter.theValue(dataRegister.getCustomerid()).into(RegisterPage.TXT_CUSTOMERID),
                Enter.theValue(dataRegister.getCompanyname()).into(RegisterPage.TXT_COMPANYNAME),
                Enter.theValue(dataRegister.getContactname()).into(RegisterPage.TXT_CONTACTNAME),
                Enter.theValue(dataRegister.getContacttype()).into(RegisterPage.TXT_CONTACTTITLE),
                //SelectFromOptions.byValue(dataRegister.getRepresentative()).from(RegisterPage.SELECTREPRESENTATIVE)
                Enter.theValue(dataRegister.getAddress()).into(RegisterPage.TXT_ADRESS),
                Click.on((RegisterPage.BTN_SAVE))
        );
    }

    public static RegisterTask enter(DataRegister dataRegister) {
        return Tasks.instrumented(RegisterTask.class, dataRegister);
    }
}
