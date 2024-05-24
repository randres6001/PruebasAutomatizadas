package com.co.choucair.models;

import io.cucumber.datatable.DataTable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SupplierDataFactory {
    public static List<SupplierData> setData(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        return rows.stream().map(row -> {
            SupplierData supplierData = new SupplierData();
            supplierData.setCompanyName(row.get("companyName"));
            supplierData.setContactName(row.get("contactName"));
            supplierData.setContactTitle(row.get("contactTitle"));
            supplierData.setAddress(row.get("address"));
            supplierData.setRegion(row.get("region"));
            supplierData.setPostalCode(row.get("postalCode"));
            supplierData.setCountry(row.get("country"));
            supplierData.setCity(row.get("city"));
            supplierData.setPhone(row.get("phone"));
            supplierData.setFax(row.get("fax"));
            supplierData.setHomePage(row.get("homePage"));
            return supplierData;
        }).collect(Collectors.toList());
    }
}
