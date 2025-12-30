package com.mansoor.api.ex_04_RestAssured_Https_Methods.ex_02_Post;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class API_Testing_11_NonBDD_Style {
    String payload = "{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void API_Testing_11_NonBDD_Style(){
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.body(payload);
        r.contentType(ContentType.JSON);
        r.log().all();

        response = r.when().post();
        vr = response.then().log().all().statusCode(200);

    }



}
