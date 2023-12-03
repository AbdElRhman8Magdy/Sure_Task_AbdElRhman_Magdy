package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToDoTestBuilderPatternChainingTestz extends BaseTest {

    @Test (priority = 2)
    public void shouldBeAbleToAddNewTodo(){



        LoginPage loginPage = new LoginPage(getDriver());
        String AdedItem = loginPage
                .Load()
                .login("abdelrhman88magdy@gmail.com","12345678")
                .ClickOnAdd()
                .WriteToDoText("Learn Frame Workkk")
                .GetAdedTodo();
        Assert.assertEquals(AdedItem,"Learn Frame Workkk");



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
    @Test (priority = 1)
    public void ShouldBeAbleToDeleteTodo() {


        LoginPage loginPage = new LoginPage(getDriver());
        boolean IsNoAvailableTodos = loginPage
                .Load()
                .login("abdelrhman88magdy@gmail.com","12345678")
                .ClickOnAdd()
                .WriteToDoText("Deleeete Learn Frame Workkk")
                .DeleteToDo()
                .IsDeleted();



//        boolean isWelcomeDisplayed = newPage.IsWelcomeMessageDisplayed();
//        Assert.assertTrue(isWelcomeDisplayed);

//        NewTodoPage newTodoPage = newPage.ClickOnAdd();

//        newTodoPage.WriteToDoText("Deleeete Learn Frame Workkk");
//        newPage.DeleteToDo();
//        boolean IsNoAvailableTodos = newPage.IsDeleted();
        Assert.assertTrue(IsNoAvailableTodos);
        System.out.println("is deleted truee ??  "+IsNoAvailableTodos);

    }
}
