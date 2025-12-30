package com.mansoor.api.ex_01_RA_HelloWorld;

import io.restassured.RestAssured;

public class Hello_world {
    public static void main(String[] args){
        RestAssured.given().baseUri("htpps://google.com").log().all().
                when().log().all().then().log().all();
        System.out.println("Hello World");
    }
}
