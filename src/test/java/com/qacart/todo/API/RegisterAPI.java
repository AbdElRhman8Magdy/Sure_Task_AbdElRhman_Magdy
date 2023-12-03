package com.qacart.todo.API;

import com.qacart.todo.base.config.EndPoint;
import com.qacart.todo.base.utils.UserUtils;
import com.qacart.todo.objects.User;
import io.restassured.http.Cookie;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;

public class RegisterAPI {

    private List<Cookie> RestAssurCookeis;
    private String AccessToken;
    private String userID;
    private String firstName;
//    private String email;

    public List<Cookie> getCookeis() {
        return this.RestAssurCookeis;
    }
    public String getToken() {
        return AccessToken;
    }
    public String getUserID() {
        return this.userID;
    }
    public String getFirstName() {
        return this.firstName;
    }







    public void register() {
    //String EmailRndm = RandomStringUtils.randomAlphanumeric(8);
//        "abdelrhman8dmagdy"+EmailRndm+"@gmail.com"

    User RegisterBody =  UserUtils  .GenerateRndmUser();

//            User(
//            //Set user details at ->com.qacart.todo.objects.User
//            "abdelrhman8dmagdy"+EmailRndm+"@gmail.com",
//            "12345678",
//            "Abd ElRhman","Magdy");



    Response response=
            given()
                .baseUri(EndPoint.API_BaseURI_ENDPOINT)
                .header("Content-Type","application/json")
                .body(RegisterBody)
                    .log().all()
            .when()
                .post(EndPoint.API_REGISTER_ENDPOINT)
            .then()
                .log().all()
                .extract().response()
                                    ;

    if(response.statusCode() !=201){
        throw new   RuntimeException("Error with request ->response code package com.qacart.todo.API line 65"+ response.statusCode());
    }
//    else if () {
//
//    }

        RestAssurCookeis = response.detailedCookies().asList();
        AccessToken = response.path("access_token");
        userID = response.path("userID");
        firstName = response.path("firstName");
//        email = RegisterBody.getEmail();


    }
}
