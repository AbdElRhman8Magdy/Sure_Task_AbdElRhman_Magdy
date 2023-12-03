package com.qacart.todo.testcases;


import com.qacart.todo.base.BaseTest;
import com.qacart.todo.base.utils.UserUtils;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.NewPage;
import com.qacart.todo.pages.NewTodoPage;
import com.qacart.todo.pages.RegisterPage;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;


@Feature("auth FUN")
public class RegisterTest extends BaseTest {

@Story("login valid")
@Test(priority = 1,description = "Login Via API")
    public void shouldBeAbleToRegister(){



    String RndmText = RandomStringUtils.randomAlphanumeric(4);
        LoginPage loginPage = new LoginPage(getDriver());
        boolean IsWelcomeMessageDisplayed = loginPage
                .Load()
                .clickSignUp()
                .Register("Abd ElRhman",
                        "Magdy",
                        "abdelrhman88magdy"+RndmText+"@gmail.com",
                        "12345678",
                        "12345678").
                IsWelcomeMessageDisplayed();

        Assert.assertTrue(IsWelcomeMessageDisplayed);

    }

    @Test(priority = 2,description = "another login",enabled = false)
    public void shouldBeAbleToRegisterOLd() {


        LoginPage loginPage = new LoginPage(getDriver());
        loginPage
                .Load()
                .clickSignUp();
        String email = UserUtils.GenerateRndmUser().getEmail();
        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage
                .RegisterOld("Abd ElRhman",
                        "Magdy",
                        email,
                        "12345678",
                        "12345678");

        NewPage newPage = new NewPage(getDriver());
        newPage.ClickOnAdd()
                .WriteToDoText("hello")
                .GetAdedTodo();

        NewTodoPage newTodoPage = new NewTodoPage(getDriver());
        newTodoPage.clickAddNewToDo();
        newTodoPage.WriteToDoText("khalil");
        newPage.DeleteToDo();

    }
}
