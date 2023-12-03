package com.qacart.todo.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactory {
    protected WebDriver driver;
    public WebDriver DriverInitialize(){

        String browser = System.getProperty("browser","EDGE");
        switch (browser) {
            case "CHROME" -> {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            case "EDGE" -> {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }
            case "FIREFOX" -> {
                WebDriverManager.firefoxdriver().setup();
                WebDriver driver = new FirefoxDriver();
            }
            case "SAFARI" -> WebDriverManager.safaridriver().setup();
            default -> throw new RuntimeException("Not Supported browser");
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        driver.navigate().to("https://todo.qacart.com/login");
        driver.manage().window().maximize();

        return driver;
    }

}
