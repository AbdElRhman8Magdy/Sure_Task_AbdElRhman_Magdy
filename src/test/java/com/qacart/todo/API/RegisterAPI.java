package com.qacart.todo.API;

import com.qacart.todo.base.config.EndPoint;
import com.qacart.todo.base.utils.UserUtils;
import com.qacart.todo.objects.User;
import io.restassured.http.Cookie;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;

public class RegisterAPI {

    private List<Cookie> RestAssurCookeis;
    private String AccessToken;
    private String userID;
    private String employeeId;
    private String EmpNumber;

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
    public String SetEmployeeId() {
        return this.employeeId;
    }
    public String getEmpNumber(){
        return this.EmpNumber;

    }



    public String register(String auth) {


    User RegisterBody =  UserUtils  .GenerateRndmUser();



    Response response=
            given()
                .baseUri(EndPoint.API_BaseURI_ENDPOINT_Task)
                    .cookie("orangehrm",auth)
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

        RestAssurCookeis = response.detailedCookies().asList();


//        JsonPath jsonPathEvaluator = response.jsonPath();
//        String empNumber1 = jsonPathEvaluator.get("$lastName");

        JsonPath jsonPathEvaluator = response.jsonPath();
         EmpNumber = jsonPathEvaluator.getString("data.empNumber");
        System.out.println((jsonPathEvaluator.getString("data.empNumber")));

        return new String(EmpNumber);


//        AccessToken = response.jsonPath(.data.empNumber);
//        userID = response.path("userID");
        //employeeId = response.path("data","empNumber");
//        System.out.println("1asdasdasd"+empNumber1);
//        System.out.println("2asdasdasdasdasdasd"+jsonPathEvaluator.get("data"));
//        System.out.println(response.body().path("$data.empNumber"));
//        System.out.println("3asdasdasdasdasdasds"+jsonPathEvaluator.get("data[]"));
//        System.out.println("4asdasdasdasdd"+jsonPathEvaluator.get("[]lastName"));
//        System.out.println("5asdasdasdasdasdaszzzzzd"+jsonPathEvaluator.get("$data[0]lastName"));
//        System.out.println("6asdasdasdasdasdasd"+jsonPathEvaluator.get("data()empNumber"));
//        System.out.println(response.body().print());


        //System.out.println(employeeId);
//        System.out.println("ssssas"+AccessToken);




    }
}
