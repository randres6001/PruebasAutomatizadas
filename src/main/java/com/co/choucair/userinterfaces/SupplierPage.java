package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SupplierPage {
    public static final Target BTN_NORTH = Target.the("North button")
            .locatedBy("//a[@href='#nav_menu1_2_1']");
    public static final Target BTN_SUPPLIER = Target.the("Supplier button")
            .locatedBy("//span[contains(text(),'Suppliers')]");
    public static final Target BTN_CREATE_NEW_SUPPLIER = Target.the("Create new supplier button")
            .locatedBy("//div[@class='tool-button add-button icon-tool-button']");

    public static final Target TEXT_COMPANY_NAME = Target.the("Company name field")
            .locatedBy("//input[@name='CompanyName']");
    public static final Target TEXT_CONTACT_NAME = Target.the("Contact name field")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_SupplierDialog6_ContactName']");

    public static final Target TEXT_CONTACT_TITLE = Target.the("Contact title field")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_SupplierDialog6_ContactTitle']");
    public static final Target TEXT_ADDRESS = Target.the("Address field")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_SupplierDialog6_Address']");

    public static final Target TEXT_REGION = Target.the("Region field")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_SupplierDialog6_Region']");

    public static final Target TEXT_POSTAL_CODE = Target.the("Postal code field")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_SupplierDialog6_PostalCode']");

    public static final Target TEXT_COUNTRY = Target.the("Country field")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_SupplierDialog6_Country']");
    public static final Target TEXT_CITY = Target.the("City field")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_SupplierDialog6_City']");

    public static final Target TEXT_PHONE = Target.the("Phone field")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_SupplierDialog6_Phone']");
    public static final Target TEXT_FAX = Target.the("Fax field")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_SupplierDialog6_Fax']");
    public static final Target TEXT_HOME_PAGE = Target.the("Home page field")
            .locatedBy("//input[@id='Serenity_Demo_Northwind_SupplierDialog6_HomePage']");
    public static final Target BUTTON_SAVE = Target.the("Save button")
            .locatedBy("//div[@class='tool-button save-and-close-button icon-tool-button']");

    public static final Target LBL_VALIDATION = Target.the("Validation label")
            .locatedBy("//div[@class='grid-canvas']//*[contains(text(),'{0}')]");
}
