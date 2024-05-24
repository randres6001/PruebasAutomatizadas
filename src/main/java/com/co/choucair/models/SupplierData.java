package com.co.choucair.models;
import com.co.choucair.models.SupplierData;
import io.cucumber.datatable.DataTable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SupplierData {
    private String companyName;
    private String contactName;
    private String contactTitle;
    private String address;
    private String region;
    private String postalCode;
    private String country;
    private String city;
    private String phone;
    private String fax;
    private String homePage;

    // Getters and setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public static List<SupplierData> setData(DataTable table) {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        return data.stream().map(row -> {
            SupplierData supplier = new SupplierData();
            supplier.setCompanyName(row.get("companyName"));
            supplier.setContactName(row.get("contactName"));
            supplier.setContactTitle(row.get("contactTitle"));
            supplier.setAddress(row.get("address"));
            supplier.setRegion(row.get("region"));
            supplier.setPostalCode(row.get("postalCode"));
            supplier.setCountry(row.get("country"));
            supplier.setCity(row.get("city"));
            supplier.setPhone(row.get("phone"));
            supplier.setFax(row.get("fax"));
            supplier.setHomePage(row.get("homePage"));
            return supplier;
        }).collect(Collectors.toList());
    }
}
