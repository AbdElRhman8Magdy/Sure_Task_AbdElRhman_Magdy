package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.NewPage;
import com.qacart.todo.pages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterOld extends BaseTest {
    @Test
    public void shouldBeAbleToRegister() {


        LoginPage loginPage = new LoginPage(getDriver());
        loginPage
                .Load()
                .clickSignUp();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage
                .RegisterOld("Abd ElRhman",
                        "Magdy",
                        "1امنياا111magdy@gmail.com",
                        "12345678",
                        "12345678");

        NewPage newPage = new NewPage(getDriver());
        newPage.ClickOnAdd()
                .WriteToDoText("hey")
                .GetAdedTodo();


    }
}
