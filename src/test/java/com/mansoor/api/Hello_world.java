package com.mansoor.api;

import io.restassured.RestAssured;

public class Hello_world {
    public static void main(String[] args){
        RestAssured.given().baseUri("htpps://google.com").log().all().
                when().log().all().then().log().all();
        System.out.println("Hello World");
    }
}
