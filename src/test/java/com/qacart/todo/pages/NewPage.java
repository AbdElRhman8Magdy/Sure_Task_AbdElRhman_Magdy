package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import com.qacart.todo.base.config.EndPoint;
import com.qacart.todo.base.utils.ConfigUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewPage extends BasePage {
    public NewPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@data-testid='welcome']")
    private WebElement WelcomeMessage;

    @FindBy(xpath = "//*[@data-testid='add']")
    private WebElement AddToDo;
    @FindBy(xpath = "//*[@data-testid='todo-item']")
    private WebElement AdedItem;
    @FindBy(xpath = "//*[@data-testid='delete']")
    private WebElement DeleteItem;
    @FindBy(xpath = "//*[@data-testid='no-todos']")
    private WebElement DeletedItem;

    @Step
    public boolean IsWelcomeMessageDisplayed(){
          return   WelcomeMessage.isDisplayed();
    }


    @Step
    public NewTodoPage ClickOnAdd(){

        AddToDo.click();
        return new  NewTodoPage(driver);
    }


    @Step
    public NewPage DeleteToDo(){
        DeleteItem.click();
        return this;
    }
    @Step
    public boolean IsDeleted(){
       return DeletedItem.isDisplayed();
    }
    @Step
    public String GetAdedTodo(){
        System.out.println(AdedItem.getText());
        return AdedItem.getText();
    }

    @Step
    public NewPage Load(){
        driver.get(ConfigUtils.GetInstance().ReturnBaseURL()+ EndPoint.API_NewPage_ENDPOINT);
        return this;
    }

}
