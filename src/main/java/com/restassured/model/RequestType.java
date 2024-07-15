package com.restassured.model;

public enum RequestType implements DescriptionType {
    GET("GET"),
    PUT("PUT"),
    POST("POST");
    private final String name;

    RequestType(String requestType) {
        this.name = requestType;
    }

    public static RequestType from(String description) {
        return DescriptionType.from(RequestType.class, description);
    }

    @Override
    public String getName() {
        return this.name;
    }

}
