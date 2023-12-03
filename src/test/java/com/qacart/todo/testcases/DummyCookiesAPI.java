package com.qacart.todo.testcases;

import com.qacart.todo.API.RegisterAPI;
import com.qacart.todo.base.utils.ConfigUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DummyCookiesAPI {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // better to use - navigate smallest page in website like 404 page -> insert cookies then refresh OR visit required page
        driver.get(ConfigUtils.GetInstance().ReturnBaseURL());
        driver.manage().window().maximize();

        Thread.sleep(3000);

        RegisterAPI registerAPI = new RegisterAPI();
        registerAPI.register();

        List<io.restassured.http.Cookie> RestAssuredCookies =  registerAPI.getCookeis();
        for(io.restassured.http.Cookie cookie : RestAssuredCookies){

            Cookie SeleniumCookie = new Cookie(cookie.getName(),cookie.getValue());
            driver.manage().addCookie(SeleniumCookie);
        }

//for loop to get and inject cookies to browser
//
//        List<io.restassured.http.Cookie> RestAssuredCookies =  registerAPI.getCookeis();
//        for(io.restassured.http.Cookie cookie : RestAssuredCookies){
//
//            Cookie SeleniumCookie = new Cookie(cookie.getName(),cookie.getValue());
//            driver.manage().addCookie(SeleniumCookie);
//        }

        //replace by cookie utils & base test



//        Cookie accTknCookie = new Cookie("access_token","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjY1MDEzMThiOWRlMmVmMDAxNDI3NmQ3MiIsImZpcnN0TmFtZSI6IlRoZXJvbiIsImxhc3ROYW1lIjoiVGlsbG1hbiIsImlhdCI6MTY5NDU3NzAzNX0.6BYirnDBy7YP4GZdMrLCULu5loLZWb5LNoMhCKd5Ulc");
//        Cookie frstName = new Cookie("firstName","Maaagyd");

//        driver.manage().addCookie(accTknCookie);
//        driver.manage().addCookie(frstName);
        Thread.sleep(3000);
        driver.get(ConfigUtils.GetInstance().ReturnBaseURL());


        //Selenium Cookies
        //to add cookies visit website first -> addd cookies -> visit website again
        //best to visit 404 page to be more faster


    }
}
