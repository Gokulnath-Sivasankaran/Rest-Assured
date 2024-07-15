package com.restassured;

import lombok.Data;

@Data
public class Sample {

    private String firstName;
    private String lastName;
    private String fullName;

    public String getFullName() {
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }
}
