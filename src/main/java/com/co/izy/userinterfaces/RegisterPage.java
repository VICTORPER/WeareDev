package com.co.izy.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {


    public static final Target TXT_CUSTOMERID = Target.the("Enter CustomerID").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_CustomerID']");

    public static final Target TXT_COMPANYNAME = Target.the("Enter CompanyName").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_CompanyName']");

    public static final Target TXT_CONTACTNAME = Target.the("Enter ContactName").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_ContactName']");

    public static final Target TXT_CONTACTTITLE = Target.the("Enter ContactTitle").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_ContactTitle']");

    public static final Target SELECTREPRESENTATIVE = Target.the("Select Representative").locatedBy("//div[@id='select2-drop-mask']");

    public static final Target TXT_ADRESS = Target.the("Enter Address").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_Address']");

    public static final Target SELECTCOUNTRY = Target.the("Select COUNTRY").locatedBy(" //span[@class='select2-chosen' and @id='select2-chosen-11']");
    public static final Target OPTION_COUNTRY = Target.the("Country option")
            .locatedBy("//span[text()='Argentina']");

    //public static final Target SELECTCITY = Target.the("Select CITY").locatedBy(" //span[@id='select2-chosen-12']");
    public static final Target TXT_REGION = Target.the("Enter Region").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_Region']");

    public static final Target TXT_PHONE = Target.the("Enter Phone").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_Phone']");

    public static final Target TXT_EMAIL = Target.the("Enter EMAIL").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_Email']");

    public static final Target BTN_SAVE = Target.the("CLick on Bottom save").locatedBy("//span[text()='Save']");

}
