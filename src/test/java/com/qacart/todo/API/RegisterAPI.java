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
    private String employeeId;
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
    public String getEmployeeId() {
        return this.employeeId;
    }







    public void register() {


    User RegisterBody =  UserUtils  .GenerateRndmUser();




    Response response=
            given()
                .baseUri(EndPoint.API_BaseURI_ENDPOINT_Task)
                    .cookie("orangehrm","00a508c5b3484681526ab73876a2bf4e")
                .headers("Content-Type","application/json")
                .body(RegisterBody)
                    .log().all()
            .when()
                .post(EndPoint.API_REGISTER_ENDPOINT_Task)
            .then()
                .log().all()
                .extract().response()
                                    ;

    if(response.statusCode() !=200){
        throw new   RuntimeException("Error with request ->response code package com.qacart.todo.API line 65"+ response.statusCode());
    }
//    else if () {
//
//    }

//        RestAssurCookeis = response.detailedCookies().asList();
//        AccessToken = response.path(".data.empNumber");
////        userID = response.path("userID");
//        employeeId = response.path("data","empNumber");
//////        email = RegisterBody.getEmail();
//        System.out.println("asdasdasd"+AccessToken);
//        System.out.println(employeeId);


    }
}
