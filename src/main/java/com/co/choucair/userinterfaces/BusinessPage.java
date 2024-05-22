package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BusinessPage {

    public static final Target BTN_ORGANIZATION = Target.the("")
            .locatedBy("//a[@href='#nav_menu1_3_1']");
    public static final Target BTN_BUSINESS_UNIT = Target.the("")
            .locatedBy("//a[@href='/Organization/BusinessUnit']");  
    public static final Target BTN_CREATE_NEW_UNIT = Target.the("")
            .locatedBy("//div[@class='tool-button add-button icon-tool-button']");
    public static final Target TXT_UNIT_NAME = Target.the("")
            .locatedBy("//input[@id='Serenity_Pro_Organization_BusinessUnitDialog3_Name']");
    public static final Target TXT_LIST = Target.the("")
            .locatedBy("//div[@id='s2id_Serenity_Pro_Organization_BusinessUnitDialog3_ParentUnitId']");
    public static final Target LST_UNITY = Target.the("")
            .locatedBy("//ul[@id='select2-results-1']");
    public static final Target BTN_SAVE = Target.the("")
            .locatedBy("//div[@class='tool-button save-and-close-button icon-tool-button']");
    public static final Target LBL_VALIDATION= Target.the("")
            .locatedBy("//div[@class='slick-cell l1 r1']//a[contains(text(),'{0}')]");


}
