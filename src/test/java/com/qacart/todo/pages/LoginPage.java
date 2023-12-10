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
import java.util.Objects;


public class LoginPage extends BasePage {
    public String getAuth() {
        return Auth;
    }

    String Auth;

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
//
//    String getCookies=null;
//    driver.manage().getCookies();
//    System.out.println("ZZZZZZZZZ"+getCookies);





    File file = new File("browser.data");
    try {
        file.delete();
        file.createNewFile();
        FileWriter fos = new FileWriter(file);
        BufferedWriter bos = new BufferedWriter(fos);

        for (org.openqa.selenium.Cookie ck : driver.manage().getCookies()) {
            if (Objects.equals(ck.getName(), "orangehrm")){
                Auth =   ck.getValue();
            }
        }

        bos.flush();
        bos.close();
        fos.close();
    } catch (Exception ex) {
        ex.printStackTrace();

    }
    return new HomePage(driver,Auth);

}}

