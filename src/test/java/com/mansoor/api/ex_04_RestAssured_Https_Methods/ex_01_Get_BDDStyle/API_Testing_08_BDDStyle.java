package com.mansoor.api.ex_04_RestAssured_Https_Methods.ex_01_Get_BDDStyle;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class API_Testing_08_BDDStyle {
    @Test
    public void test_Get_Positive()
    {
        String pincode = "577528";
        pincode = "110048";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
    }
