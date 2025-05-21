package com.google.pages;

import com.google.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlacesWidget extends BasePage {
    /**
     * 
     * @param driver
     */
    public PlacesWidget(WebDriver driver){
        super(driver);
    }


    @FindBy(xpath =  "//*[contains(text(),'الأماكن')]")
    private WebElement Places;
    @FindBy(xpath =  "//*[contains(text(),'مفتوح الآن')]")
    private WebElement SortByOpen;

    @Step
    public PlacesWidget  SortByOpenResturants(){
        SortByOpen.click();
        return this;

    }
    @Step
    public Boolean PlacesWidgetIsSuccessDisplayed(){
        return Places.isDisplayed();
    }



}

