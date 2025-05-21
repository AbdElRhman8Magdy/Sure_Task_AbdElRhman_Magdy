package com.google.pages;

import com.github.javafaker.Weather;
import com.google.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends BasePage {
    public String getAuthToken() {
        return AuthToken;
    }

    private String AuthToken;

    public HomePage(WebDriver driver) {


        super(driver);
        this.AuthToken = AuthToken;
    }

    @FindBy(xpath =  "//textarea[@aria-label='Search']")
    private WebElement Search;
    @FindBy(xpath =  "//*[contains(text(),'طقس Google')]")
    private WebElement GoogleWeatherWidget;
    @FindBy(xpath =  "//*[contains(text(),'الطقس')]")
    private WebElement Temp;

    @Step
    public Boolean GoogleWeatherWidgetIsSuccessDisplayed(){
        return GoogleWeatherWidget.isDisplayed();
    }
    @Step
    public Boolean TemptIsSuccessDisplayed(){
        return Temp.isDisplayed();
    }
}
