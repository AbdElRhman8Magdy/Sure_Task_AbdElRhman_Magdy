package com.google.pages;

import com.github.javafaker.Weather;
import com.google.base.BasePage;
import com.google.base.utils.ConfigUtils;
import io.qameta.allure.Step;
import io.restassured.http.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    @Step("Load Search page and Flight")
    public LoginPage Load(){
        driver.get(ConfigUtils.GetInstance().ReturnBaseURL());
        return this;
   }

   public LoginPage(WebDriver driver) {
       super(driver);
   }


    @FindBy(css = "[id=APjFqb]")
    private WebElement GoogleSearchInput;
    @FindBy(xpath = "//div[contains(text(),'رحلات طيران')]")
    private WebElement FlightSelect;
    @FindBy(xpath = "//*[contains(text(),'Departing flights')]")
    private WebElement FlightWidget;


@Step
    public  LoginPage Search (String SearchQuery) throws IOException {
    GoogleSearchInput.sendKeys(SearchQuery);
    new Actions(driver).keyDown(Keys.ENTER).sendKeys("").perform();
    FlightSelect.click();

    return this;
    }
    @Step
    public Boolean FlightIsSuccessDisplayed(){
        return FlightWidget.isDisplayed();
    }

    @Step
    public HomePage SearchWeather (String SearchQuery, String Weather) throws IOException {
        GoogleSearchInput.sendKeys(SearchQuery);
        new Actions(driver).keyDown(Keys.ENTER).sendKeys("").perform();
        GoogleSearchInput.clear();
        GoogleSearchInput.sendKeys(Weather);
        new Actions(driver).keyDown(Keys.ENTER).sendKeys("").perform();
        return new HomePage(driver);

    }

    @Step
    public PlacesWidget SearchRestaurant (String SearchQuery) throws IOException {
        GoogleSearchInput.clear();
        GoogleSearchInput.sendKeys(SearchQuery);
        new Actions(driver).keyDown(Keys.ENTER).sendKeys("").perform();
        return new PlacesWidget(driver);

    }

}



