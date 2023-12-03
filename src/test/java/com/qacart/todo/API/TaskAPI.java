package com.qacart.todo.API;

import com.qacart.todo.base.config.EndPoint;
import com.qacart.todo.base.object.Task;
import com.qacart.todo.base.utils.ConfigUtils;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TaskAPI {
    public void AddTask(String token){

        Task task = new Task("Learn added", false);

        Response response=
                given()
                        .baseUri(ConfigUtils.GetInstance().ReturnBaseURL())
                        .header("Content-Type","application/json")
                        .body(task)
                        .auth().oauth2(token)
                        .log().all()
                .when()
                        .post(EndPoint.API_TASK_ENDPOINT)
                .then()
                        .log().all()
                        .extract().response()
                ;

        if(response.statusCode() !=201){
            throw new   RuntimeException("2na 2ly kateb da   Error with request ->response code package com.qacart.todo.TaskAPI line 29"+ "  "+ response.statusCode());
        }
    }
}
