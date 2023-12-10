package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public String getAuthToken() {
        return AuthToken;
    }

    private String AuthToken;

    public HomePage(WebDriver driver, String AuthToken) {


        super(driver);
        this.AuthToken = AuthToken;
    }

    @FindBy(xpath =  "//a[.='PIM']")
    private WebElement PIMPage;

    public PIMPage NavigateToEmpPage(){
        PIMPage.click();

        return new PIMPage(driver);
    }
}
