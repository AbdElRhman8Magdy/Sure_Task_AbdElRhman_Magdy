package com.qacart.todo.testcases;


import com.qacart.todo.objects.User;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class dummyAPI {


        public static void main(String[] args) throws IOException {

            String EmailRndm = RandomStringUtils.randomAlphanumeric(8);


//                String RegisterBody = "{" +
//                        "\"email\":\"abdelrhman8dmagdy"+EmailRndm+"@gmail.com\"," +
//                        "\"password\":\"12345678\"," +
//                        "\"firstName\":\"Abd ElRhman\"," +
//                        "\"lastName\":\"Magdy\"}";
            User RegisterBody = new User("abdelrhman8dmagdy"+EmailRndm+"@gmail.com",
                    "12345678",
                    "Abd ElRhman","Magdy");
//             given  BaseURL
                Response response= given()
                        .baseUri("https://todo.qacart.com/api/v1/")
                        .header("Content-Type","application/json")
                        .body(RegisterBody)
//             When Type / url endpoint
                        .when()
                        .post("/users/register")
//             Then response
                        .then()
                        .extract().response()
                //.log().all()
                //.extract().response() -> at given add ->Response response= given() to be printed
                //      body()
                //      cookies()
                ;

                String AccessToken = response.path("access_token");
            String UsrID = response.path("userID");
                // id acceess token inside arrat response.path("user[0].access_token");
            System.out.println(response.body().prettyPrint());
            System.out.println("USER ID -> "+UsrID);
            System.out.println("acccetioken  -> "+AccessToken);
            System.out.println("email ->"+RegisterBody.getEmail());
    }
}