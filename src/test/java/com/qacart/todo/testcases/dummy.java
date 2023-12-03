package com.qacart.todo.testcases;

import java.io.*;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class dummy {


        public static void main(String[] args) throws IOException {

                //create request bode inside String to be called where each parm end with +
                String RegisterBody = "{\"email\":\"abdelrhman88magdy@gmail.com\"," +
                        "\"password\":\"12345678\"," +
                        "\"firstName\":\"Abd ElRhman\"," +
                        "\"lastName\":\"Magdy\"}";
//
//             to create API Request use (
//               Given -> for Domain and Body
//             , When -> for end Point and request type
//             , Then -> response )
//             given  BaseURL
                given()
                        .baseUri("https://todo.qacart.com/api/v1/")
                        .header("Content-Type","application/json")
                        .body(RegisterBody)
//             When Type / url endpoint
                        .when()
                                .post("/users/register")
//             Then response
                        .then()
                                .log().all()
                ;



        File file = new File("src/test/java/com/qacart/todo/base/config/production.properties");
        InputStream inputStream = new FileInputStream(file);
        Properties properties = new Properties();
        properties.load(inputStream);

        String baseUrl = properties.getProperty("baseUrl");

        System.out.println(baseUrl);

    }}
