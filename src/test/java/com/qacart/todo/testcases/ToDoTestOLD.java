package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.NewPage;
import com.qacart.todo.pages.NewTodoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToDoTestOLD extends BaseTest {
//extends BaseTest better than add before and after
//    private WebDriver driver;
//    @BeforeTest
//    public void eachtestcase (){
//        driver = new DriverFactory().DriverInitialize();
//    }
    @Test (priority = 2)
    public void shouldBeAbleToAddNewTodo(){
        //shouldBeAbleToAddNewTodo();



        //configured by loginPage.load



//        driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("abdelrhman8magdy@gmail.com");
//        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("12345678");
//        driver.findElement(By.id("submit")).click();
//instead of 3 line changed with only 2
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.Load();
        loginPage.login("abdelrhman88magdy@gmail.com","12345678");

// used in todo page by @Find
        NewPage newPage = new NewPage(getDriver());
        boolean isWelconmeDisplayed = newPage.IsWelcomeMessageDisplayed();
        Assert.assertTrue(isWelconmeDisplayed);

//        boolean isWelcomeDisplayed = driver.findElement(By.xpath("//*[@data-testid='welcome']")).isDisplayed();
//        Assert.assertTrue(isWelcomeDisplayed);

        NewTodoPage newTodoPage = new NewTodoPage(getDriver());

        newTodoPage.clickAddNewToDo();
        newTodoPage.WriteToDoText("Learn Frame Workkk");
        //newTodoPage.SubmitToDoBtn();

        //String Added_todo = driver.findElement(By.xpath("//*[@data-testid='todo-item']")).getText();
        String Added_todo = newPage.GetAdedTodo();
        Assert.assertEquals(Added_todo,"Learn Frame Workkk");
        System.out.println("is text is same as assert   "+Added_todo+" "+Added_todo);
//        driver.quit();

    }
    @Test (priority = 1)
    public void ShouldBeAbleToDeleteTodo() {

        //configured by loginPage.load
        //driver.navigate().to("https://todo.qacart.com/login");


//        driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("abdelrhman8magdy@gmail.com");
//        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("12345678");
//        driver.findElement(By.id("submit")).click();
        //instead of 3 line changed with only 2
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.Load();
        loginPage.login("abdelrhman88magdy@gmail.com","12345678");

        NewPage newPage = new NewPage(getDriver());
//        boolean isWelcomeDisplayed = driver.findElement(By.xpath("//*[@data-testid='welcome']")).isDisplayed();
//        Assert.assertTrue(isWelcomeDisplayed);
        boolean isWelcomeDisplayed = newPage.IsWelcomeMessageDisplayed();
        Assert.assertTrue(isWelcomeDisplayed);

        newPage.ClickOnAdd();

        NewTodoPage newTodoPage= new NewTodoPage(getDriver());

       // driver.findElement(By.xpath("//*[@data-testid='add']")).click();
        newTodoPage.WriteToDoText("Deleeete Learn Frame Workkk");
        //driver.findElement(By.xpath("//*[@data-testid='submit-newTask']")).click();
        //driver.findElement(By.xpath("//*[@data-testid='delete']")).click();
        newPage.DeleteToDo();
        boolean IsNoAvailableTodos = newPage.IsDeleted();
        Assert.assertTrue(IsNoAvailableTodos);
        System.out.println("is deleted truee ??  "+IsNoAvailableTodos);

    }
}
