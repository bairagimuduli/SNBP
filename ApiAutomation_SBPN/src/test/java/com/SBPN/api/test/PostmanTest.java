package com.SBPN.api.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PostmanTest {
    @Test
    public void testGet() {
        // https://postman-echo.com/get?test=123

        Response response = RestAssured.get("https://postman-echo.com/get?test=123");
        System.out.println(response.prettyPrint());
    }
}
