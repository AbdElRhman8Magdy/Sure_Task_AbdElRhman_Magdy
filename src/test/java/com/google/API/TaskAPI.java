package com.google.API;

import com.google.base.config.EndPoint;
import com.google.base.utils.UserUtils;
import com.google.objects.EditUser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TaskAPI {
    private final String empNumber;

    public TaskAPI(String empNumber) {
        this.empNumber = empNumber;
    }


    public void AddTask(String Auth){

        EditUser RegisterBody = UserUtils.GenerateEditdmUser();


        Response response=
                given()
                        .baseUri(EndPoint.API_BaseURI_ENDPOINT_Task)
                        .cookie("orangehrm",Auth)
                        .header("Content-Type","application/json")
                        .body(RegisterBody)
                        .log().all()
                .when()
                        .put(String.format(EndPoint.API_TASK_ENDPOINT,empNumber))
                .then()
                        .log().all()
                        .extract().response()
                ;

        if(response.statusCode() !=200){
            throw new   RuntimeException("2na 2ly kateb da   Error with request ->response code package com.qacart.todo.TaskAPI line 29"+ "  "+ response.statusCode());
        }

        JsonPath jsonPathEvaluator = response.jsonPath();
        String sinNumber = jsonPathEvaluator.get("$.data.sinNumber");
        System.out.println(sinNumber);
    }


}
