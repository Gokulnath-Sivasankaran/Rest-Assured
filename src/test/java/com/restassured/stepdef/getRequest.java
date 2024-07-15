package com.restassured.stepdef;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;


class getRequest {

    RequestSpecification requestSpecification;
    RequestSpecBuilder specBuilder;
    //BasicAuthScheme basicAuthScheme = new BasicAuthScheme();

//    public BasicAuthScheme getBasicAuthScheme() {
//        basicAuthScheme.setUserName("x-api-key");
//        basicAuthScheme.setPassword("reqres-free-v1");
//        return basicAuthScheme;
//    }

    @BeforeEach
    public void setup() {
        // Setting BaseURI once
        specBuilder = new RequestSpecBuilder();
        specBuilder.setBaseUri("https://reqres.in/api");
        specBuilder.setBasePath("/api");
        //specBuilder.setAuth(getBasicAuthScheme);
        //specBuilder.addParam("api-key", "reqres-free-v1");
        //specBuilder.addParam("x-api-key", "reqres-free-v1");
        requestSpecification = specBuilder.build();
        // Setting BasePath once
        //RestAssured.basePath ="/booking";
    }


    Map<String, String> requestLink = new HashMap<>() {{
        put("GET", "/users?page=2");
    }};


    @Test
    void verifyGETRequest() {
        given().
                spec(requestSpecification).when().get(requestLink.get("GET"))
                .then().contentType(ContentType.JSON).statusCode(401).log().body()
        ;
    }

}