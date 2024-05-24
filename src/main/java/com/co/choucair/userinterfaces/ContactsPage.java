package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ContactsPage {

    public static final Target BTN_ORGANIZATION = Target.the("")
            .locatedBy("//a[@href='#nav_menu1_3_1']");
    public static final Target BTN_CONTACTS = Target.the("")
            .locatedBy("//a[@href='/Organization/Contact']");
    public static final Target BTN_CREATE_NEW_CONTACT = Target.the("")
            .locatedBy("//div[@class='tool-button add-button icon-tool-button']");
    public static final Target TXT_CONTACT_TITLE = Target.the("")
            .locatedBy("//input[@id='Serenity_Pro_Organization_ContactDialog4_Title']");
    public static final Target TXT_CONTACT_FIRST_NAME = Target.the("")
            .locatedBy("//input[@id='Serenity_Pro_Organization_ContactDialog4_FirstName']");
    public static final Target TXT_CONTACT_LAST_NAME = Target.the("")
            .locatedBy("//input[@id='Serenity_Pro_Organization_ContactDialog4_LastName']");
    public static final Target TXT_CONTACT_EMAIL = Target.the("")
            .locatedBy("//input[@name='Email']");
    public static final Target TXT_CONTACT_IDENTIFY = Target.the("")
            .locatedBy("//input[@name='IdentityNo']");
    public static final Target TXT_USER = Target.the("")
            .locatedBy("//div[@id='s2id_Serenity_Pro_Organization_ContactDialog4_UserId']");
    public static final Target LST_USER = Target.the("")
            .locatedBy("//ul[@id='select2-results-1']");
    public static final Target BTN_SAVE = Target.the("")
            .locatedBy("//div[@class='tool-button save-and-close-button icon-tool-button']");
    public static final Target LBL_VALIDATION= Target.the("")
            .locatedBy("//div[@class='slick-cell l2 r2']//a[contains(text(),'{0}')]");


}
