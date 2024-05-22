package com.co.choucair.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public class UserLoombokData {

    String user;
    String pass;
    String name;
    String unity;
    String title;
    String firstName;
    String lastName;
    String email;
    String id;

    String userName;


    public static List<UserLoombokData> setData(DataTable table) {
        List<UserLoombokData> data = new ArrayList<>();
        List<Map<String, String>> mapList = table.asMaps();
        for (Map<String, String> map : mapList) {
            data.add(new ObjectMapper().convertValue(map, UserLoombokData.class));
        }
        return data;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public String getName() {
        return name;
    }

    public String getUnity() {
        return unity;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }
}
