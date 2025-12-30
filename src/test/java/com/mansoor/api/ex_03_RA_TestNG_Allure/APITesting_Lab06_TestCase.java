package com.mansoor.api.ex_03_RA_TestNG_Allure;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab06_TestCase {
    String pincode = "577528";
    @Test
    public void test_Get_Postive_Tc1(){
        pincode = "577528";
        RestAssured
                .given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when().get()
                .then().log().all().statusCode(200);
    }
    @Test
    public void test_Get_negative_Tc2(){
        pincode = "@";
        RestAssured
                .given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when().get()
                .then().log().all().statusCode(200);
    }
    @Test
    public void test_Get_negative_Tc3(){
        pincode = "";
        RestAssured
                .given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when().get()
                .then().log().all().statusCode(200);
    }
}
