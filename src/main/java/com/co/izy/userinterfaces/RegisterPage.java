package com.co.izy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {

    public  static final Target BTN_NORTHWIND = Target.the("click option NORTHWIND").locatedBy("//*[@id='nav_menu1_2']/li[1]/a/span");

    public static final Target BTN_CUSTOMER= Target.the("click option customer").locatedBy("//ul[@id='nav_menu1_2_1']/li[1]/a/span");

    public static final Target BTN_NEWCUSTOMER= Target.the("click option customer").locatedBy("//span[@class='button-inner' and contains(., 'New Customer')]");

    public static final Target TXT_CUSTOMERID = Target.the("Enter CustomerID").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_CustomerID']");

    public static final Target TXT_COMPANYNAME = Target.the("Enter CompanyName").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_CompanyName']");

    public static final Target TXT_CONTACTNAME = Target.the("Enter ContactName").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_ContactName']");

    public static final Target TXT_CONTACTTITLE = Target.the("Enter ContactTitle").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_ContactTitle']");

    public static final Target SELECTREPRESENTATIVE = Target.the("Select Representative").locatedBy("//div[@class='select2-container select2-container-multi editor s-Serenity-LookupEditor s-LookupEditor valid select2-dropdown-open']//div[text()='Anne Dodsworth']");

    public static final Target TXT_ADRESS = Target.the("Enter Address").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_Address']");

    public static final Target BTN_SAVE = Target.the("CLick on Bottom save").locatedBy("//span[text()='Save']");

}
