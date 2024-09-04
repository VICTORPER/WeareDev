package com.co.izy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {

    public static final Target TXT_PRODUCTNAME = Target.the("Enter Product Name").locatedBy("//input[@id='ProductDialog9_ProductName']");
    public static final Target TXT_QUANTITY = Target.the("Enter QUANTITY").locatedBy("//input[@id='ProductDialog9_QuantityPerUnit']");

    public static final Target TXT_PRICEUNIT = Target.the("Enter Price Unit").locatedBy("//input[@id='ProductDialog9_UnitPrice']");

    public static final Target TXT_UNITISTOCK = Target.the("Enter Unit Stock").locatedBy("//input[@id='ProductDialog9_UnitsInStock']");
    public static final Target TXT_UNITORDER = Target.the("Enter Unit On Order").locatedBy("//input[@id='ProductDialog9_UnitsOnOrder']");
    public static final Target TXT_REORDERLEVEL = Target.the("Enter Re order level").locatedBy("//input[@id='ProductDialog9_ReorderLevel']");




}
