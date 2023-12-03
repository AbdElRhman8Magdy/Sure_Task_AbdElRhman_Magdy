package com.qacart.todo.pages;

import com.qacart.todo.base.BasePage;
import com.qacart.todo.base.config.EndPoint;
import com.qacart.todo.base.utils.ConfigUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewTodoPage extends BasePage {
    /**
     * 
     * @param driver
     */
    public NewTodoPage (WebDriver driver){
        super(driver);
    }
    @FindBy (xpath = "//*[@data-testid='add']")
    private WebElement AddNewToDo;
    @FindBy(xpath = "//*[@data-testid='new-todo']")
    private WebElement ToDoText;
    @FindBy(xpath = "//*[@data-testid='submit-newTask']")
    private WebElement SubmitToDo;

    @Step
    public NewTodoPage Load(){
    driver.get(ConfigUtils.GetInstance().ReturnBaseURL()+ EndPoint.API_NewToDoPage_ENDPOINT);
    return this;
    }


    @Step
    public void clickAddNewToDo(){
        AddNewToDo.click();
    }
    @Step
    public  NewPage WriteToDoText (String TextToDo){
        ToDoText.sendKeys(TextToDo);
        SubmitToDo.click();
        return new NewPage(driver);
    }


}

