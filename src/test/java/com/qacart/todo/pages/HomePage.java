package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath =  "//a[.='PIM']")
    private WebElement PIMPage;

    public PIMPage NavigateToEmpPage(){
        PIMPage.click();

        return new PIMPage(driver);
    }
}
