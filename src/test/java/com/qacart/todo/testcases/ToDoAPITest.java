package com.qacart.todo.testcases;

import com.qacart.todo.API.RegisterAPI;
import com.qacart.todo.API.TaskAPI;
import com.qacart.todo.base.BaseTest;
import com.qacart.todo.pages.NewPage;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("ToDo Feature")
public class ToDoAPITest extends BaseTest {


    @Story("adding to do")
    @Description("here is story descrption")
    @Test (priority = 2,description = "Login add then delete ")
    public void shouldBeAbleToAddNewTodo(){

        RegisterAPI registerAPI = new RegisterAPI();
        registerAPI.register();

        //inject cookies after open browser and visit page
        // injectCookiestoBrowser(registerAPI.getCookeis());
        NewPage newPage = new NewPage(getDriver());
        newPage.Load();

        injectCookiestoBrowser(registerAPI.getCookeis());

        String AdedItem = newPage.Load()
                .ClickOnAdd()
                .WriteToDoText("API INjection")
                .GetAdedTodo();
        Assert.assertEquals(AdedItem,"API INjection");
        newPage.DeleteToDo()
                .IsDeleted();





//        LoginPage loginPage = new LoginPage(driver);
//        String AdedItem = loginPage
//                .Load()
//                .login(ConfigUtils.GetInstance().ReturnBaseURL(),"12345678")
//                .ClickOnAdd()
//                .WriteToDoText("Learn Frame Workkk")
//                .GetAdedTodo();
//        Assert.assertEquals(AdedItem,"Learn Frame Workkk");



//        NewPage newPage = loginPage.login("abdelrhman88magdy@gmail.com","12345678");

        //NewPage newPage = new NewPage(driver); as can be called from login page and in last step in login page
//        boolean isWelconmeDisplayed = newPage.IsWelcomeMessageDisplayed();
        //Assert.assertTrue(IsWelcomeMessageDisplayed);

       // NewTodoPage newTodoPage = new NewTodoPage(driver);

//        NewTodoPage newTodoPage =  newPage.ClickOnAdd();
//        newTodoPage.WriteToDoText("Learn Frame Workkk");

//        String Added_todo = newPage.GetAdedTodo();
//        Assert.assertEquals(AdedItem,"Learn Frame Workkk");
//        System.out.println("is text is same as assert   "+Added_todo+" "+AdedItem);

        //newPage.DeleteToDo();



    }
    @Test (priority = 1,description = "Login add then delete added ")
    public void ShouldBeAbleToDeleteTodo() {
        RegisterAPI registerAPI = new RegisterAPI();
        registerAPI.register();

        TaskAPI taskAPI = new TaskAPI();
        taskAPI.AddTask(registerAPI.getToken());

        NewPage newPage = new NewPage(getDriver());
        newPage.Load();
        injectCookiestoBrowser(registerAPI.getCookeis());

        String added = newPage
                .Load()
                .DeleteToDo()
                .GetAdedTodo();
//        boolean IsNoAvailableTodos = newPage.IsDeleted();
//        Assert.assertTrue(IsNoAvailableTodos);





        Assert.assertEquals(added,"Learn added");
        System.out.println(added);



//        LoginPage loginPage = new LoginPage(driver);
//        boolean IsNoAvailableTodos = loginPage
//                .Load()
//                .login("abdelrhman88magdy@gmail.com","12345678")
//                .ClickOnAdd()
//                .WriteToDoText("Deleeete Learn Frame Workkk")
//                .DeleteToDo()
//                .IsDeleted();



//        boolean isWelcomeDisplayed = newPage.IsWelcomeMessageDisplayed();
//        Assert.assertTrue(isWelcomeDisplayed);

//        NewTodoPage newTodoPage = newPage.ClickOnAdd();

//        newTodoPage.WriteToDoText("Deleeete Learn Frame Workkk");
//        newPage.DeleteToDo();
//        boolean IsNoAvailableTodos = newPage.IsDeleted();
//        Assert.assertTrue(IsNoAvailableTodos);
//        System.out.println("is deleted truee ??  "+IsNoAvailableTodos);

    }
}
