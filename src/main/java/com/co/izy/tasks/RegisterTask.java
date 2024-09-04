package com.co.izy.tasks;

import com.co.izy.models.DataRegister;
import com.co.izy.userinterfaces.LoginPage;
import com.co.izy.userinterfaces.MenuComponent;
import com.co.izy.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

public class RegisterTask implements Task {
    DataRegister dataRegister;

    public RegisterTask(DataRegister dataRegister) {
        this.dataRegister = dataRegister;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuComponent.BTN_NORTHWIND),
                Click.on(MenuComponent.BTN_CUSTOMER),
                Click.on(MenuComponent.BTN_NEWCUSTOMER),
                Enter.theValue(dataRegister.getCustomerid()).into(RegisterPage.TXT_CUSTOMERID),
                Enter.theValue(dataRegister.getCompanyname()).into(RegisterPage.TXT_COMPANYNAME),
                Enter.theValue(dataRegister.getContactname()).into(RegisterPage.TXT_CONTACTNAME),
                Enter.theValue(dataRegister.getContacttype()).into(RegisterPage.TXT_CONTACTTITLE),
                Enter.theValue(dataRegister.getAddress()).into(RegisterPage.TXT_ADRESS),
                Enter.theValue(dataRegister.getRegion()).into(RegisterPage.TXT_REGION),
                Enter.theValue(dataRegister.getPhone()).into(RegisterPage.TXT_PHONE),
                Enter.theValue(dataRegister.getEmail()).into(RegisterPage.TXT_EMAIL),
                Click.on((RegisterPage.BTN_SAVE))
        );
    }

    public static RegisterTask enter(DataRegister dataRegister) {
        return Tasks.instrumented(RegisterTask.class, dataRegister);
    }
}
