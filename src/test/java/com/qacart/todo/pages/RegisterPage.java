package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    /**
     *
     * @param driver
     */
//    public RegisterPage Load(){
//        //driver.get("https://todo.qacart.com/login");
//            return this;
    //instead of void use class name and return this to be able to call all methods on class at "test"
//}



    @FindBy(css = "[data-testid='first-name']")
    private WebElement FrstName;
    @FindBy (xpath = "//*[@data-testid='last-name']")
    private WebElement LastName;
    @FindBy(css = "[data-testid='email']")
    private WebElement EmailField;
    @FindBy(css = "[data-testid='password']")
    private WebElement Pss;
    @FindBy(css = "[data-testid='confirm-password']")
    private WebElement CnPss;
    @FindBy(css = "[data-testid='submit']")
    private WebElement SubmitButton;
    @FindBy(linkText = "Signup")
    private WebElement SignupBtn;




    //instead of run each test individually let's add last step to return to next test
    @Step

   public NewPage Register (String frstname, String Lastname, String Email, String password, String ConPass){
        FrstName.sendKeys(frstname);
        LastName.sendKeys(Lastname);
        EmailField.sendKeys(Email);
        Pss.sendKeys(password);
        CnPss.sendKeys(ConPass);
        SubmitButton.click();

        return new NewPage(driver);
    }


    @Step
    public void RegisterOld (String frstname,String Lastname, String Email, String password,String ConPass){
        FrstName.sendKeys(frstname);
        LastName.sendKeys(Lastname);
        EmailField.sendKeys(Email);
        Pss.sendKeys(password);
        CnPss.sendKeys(ConPass);
        SubmitButton.click();


    }


}
