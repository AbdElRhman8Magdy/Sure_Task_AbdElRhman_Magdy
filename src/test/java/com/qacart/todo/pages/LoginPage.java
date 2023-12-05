package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import com.qacart.todo.base.utils.ConfigUtils;
import io.qameta.allure.Step;
import io.restassured.http.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class LoginPage extends BasePage {

    @Step("aaddded description mannually to Load loging page and login")
    public LoginPage Load(){
        driver.get(ConfigUtils.GetInstance().ReturnBaseURL());
        return this;
   }

   public LoginPage(WebDriver driver) {
       super(driver);
   }


    @FindBy(css = "[name=username]")
    private WebElement UserNameInput;
    @FindBy (xpath = "//*[@name='password']")
    private WebElement PasswordInput;
    @FindBy(css = ".oxd-button")
    private WebElement SubmitButton;
    @FindBy(linkText = "Signup")
    private WebElement SignupBtn;
    private List<Cookie> RestAssurCookeis;
    public List<Cookie> getCookeis() {
        return this.RestAssurCookeis;
    }

@Step
    public HomePage login (String email, String password) throws IOException {
    UserNameInput.sendKeys(email);
        PasswordInput.sendKeys(password);
        SubmitButton.click();

//    String getCookeis;
//    driver.manage().getCookies();




        return new HomePage(driver);
    }


}
