package com.mansoor.api.ex_04_RestAssured_Https_Methods.ex_02_Post;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class API_Testing_10_BDD_Style {
    @Test
    public void Post_Auth_Token(){
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .log().all()
                .body(payload)
                .when().post()
                .then().log().all().statusCode(200);
    }
}
