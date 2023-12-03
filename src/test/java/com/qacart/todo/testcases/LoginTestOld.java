package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import org.testng.annotations.Test;

public class LoginTestOld extends BaseTest {
//    private WebDriver driver;

    @Test
    public void shouldBeAbleToLoginWithEmailAndPassword(){

//        driver = new DriverFactory().DriverInitialize();
//        driver.navigate().to("https://todo.qacart.com/login");
       // driver = new DriverFactory().DriverInitialize();

        //configured by loginPage.load
        // driver.navigate().to("https://todo.qacart.com/login");

//        LoginPage loginPage = new LoginPage(driver);
//        boolean IsWelcomeMessageDisplayed = loginPage.
//                Load()
//                .login("abdelrhman88magdy@gmail.com","12345678")
//                .IsWelcomeMessageDisplayed();



        //used chain in login page as login fn refere to new page
        //and load fn have refere to login class

        //loginPage.login("abdelrhman88magdy@gmail.com","12345678");

       // NewPage newPage = new NewPage(driver);
       // boolean isWelcomeDisplayed = newPage.IsWelcomeMessageDisplayed();


//        driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("hatem@example.com");
        // you have to register first and keep logged in to be able to run script
        /*driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("abdelrhman8magdy@gmail.com");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("12345678");
        driver.findElement(By.id("submit")).click();*/

// used in todo page by @Find

//        boolean isWelconmeDisplayed = newPage.IsWelcomeMessageDisplayed();
//        Assert.assertTrue(isWelconmeDisplayed);
//        System.out.println(isWelconmeDisplayed);

//        boolean isWelcomeDisplayed = driver.findElement(By.xpath("//*[@data-testid='welcome']")).isDisplayed();
//        Assert.assertTrue(isWelcomeDisplayed);

        //driver.quit();




    }
}
