package com.co.izy.tasks;

import com.co.izy.models.DataProduct;
import com.co.izy.models.DataRegister;
import com.co.izy.userinterfaces.MenuComponent;
import com.co.izy.userinterfaces.ProductPage;
import com.co.izy.userinterfaces.RegisterPage;
import com.oracle.jrockit.jfr.Producer;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ProductTask implements Task {

    DataProduct product;

    public ProductTask(DataProduct product) {
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuComponent.BTN_NORTHWIND),
                Click.on(MenuComponent.BTN_PRODUCT),
                Click.on(MenuComponent.BTN_NEWPRODUCT),
                Enter.theValue(product.getProductname()).into(ProductPage.TXT_PRODUCTNAME),
                Enter.theValue(product.getQuantityperunit()).into(ProductPage.TXT_QUANTITY),
                Enter.theValue(product.getPriceunit()).into(ProductPage.TXT_PRICEUNIT),
                Enter.theValue(product.getUnitorder()).into(ProductPage.TXT_UNITORDER),
                Enter.theValue(product.getUnitinstock()).into(ProductPage.TXT_UNITISTOCK),
                Enter.theValue(product.getReorderlevel()).into(ProductPage.TXT_REORDERLEVEL),
                Click.on((MenuComponent.BTN_SAVE))
        );
    }

    public static ProductTask enter(DataProduct dataProduct) {
        return Tasks.instrumented(ProductTask.class, dataProduct);
    }
}