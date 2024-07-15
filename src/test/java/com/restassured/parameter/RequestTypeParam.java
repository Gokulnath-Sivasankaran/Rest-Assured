package com.restassured.parameter;


import com.restassured.model.RequestType;
import io.cucumber.java.ParameterType;

public class RequestTypeParam {

    @ParameterType(".*")
    public RequestType requestType(String requestType) {
        return RequestType.from(requestType);
    }
}
