package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMPage extends BasePage {
    public PIMPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[.='Employee Id']//*[@class='oxd-input oxd-input--active']")
    private WebElement Employee_Id;

    @FindBy(css = ".orangehrm-left-space")
    private WebElement SearchBTN;
    @FindBy(css = ".bi-pencil-fill")
    private WebElement EditEmp;

    @FindBy(xpath = "//a[.='Contact Details']")
    private WebElement ContactDetail;




    @Step
    public ContactDetails Search(){

        Employee_Id.sendKeys("0378");
        SearchBTN.click();
        EditEmp.click();
        ContactDetail.click();


        return new ContactDetails(driver);
    }


}
