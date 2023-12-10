package com.qacart.todo.testcases;

import com.qacart.todo.API.RegisterAPI;
import com.qacart.todo.API.TaskAPI;
import com.qacart.todo.base.BaseTest;
import com.qacart.todo.pages.LoginPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class Dummy extends BaseTest {

    @Test(priority = 0)
    public void APIExample() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.Load().login("Admin", "admin123");


//        injectCookiestoBrowser(registerAPI.getCookeis());

        RegisterAPI registerAPI = new RegisterAPI();
        String empNumber = registerAPI.register(loginPage.getAuth());




        TaskAPI taskAPI = new TaskAPI(empNumber);
        taskAPI.AddTask(loginPage.getAuth());

        }
        @Test(enabled = false,priority = 1)
    public void API2(){
//            TaskAPI taskAPI = new TaskAPI();
//            taskAPI.AddTask("832536150eb2410373247246f7d61b4e");
        }
    }

