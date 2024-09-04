package com.co.izy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuComponent {

    public  static final Target BTN_NORTHWIND = Target.the("click option NORTHWIND").locatedBy("//*[@id='nav_menu1_2']/li[1]/a/span");

    public static final Target BTN_CUSTOMER= Target.the("click option customer").locatedBy("//ul[@id='nav_menu1_2_1']/li[1]/a/span");

    public static final Target BTN_NEWCUSTOMER= Target.the("click option customer").locatedBy("//span[@class='button-inner' and contains(., 'New Customer')]");

    public static final Target BTN_PRODUCT= Target.the("click option product").locatedBy("//span[@class='s-sidebar-link-text' and contains(., 'Products')]");

    public static final Target BTN_NEWPRODUCT= Target.the("click option new product Product").locatedBy("//span[@class='button-inner' and contains(., 'New Product')]");

    public static final Target BTN_SAVE = Target.the("CLick on Bottom save").locatedBy("//span[text()='Save']");


}
