package com.google.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactory {
    protected WebDriver driver;
    public WebDriver DriverInitialize(){

        String browser = System.getProperty("browser","CHROME");
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
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        WebDriver driver = new ChromeDriver(options);
        options.addArguments("user-data-dir=C:/Users/Omnia Amer/AppData/Local/Google/Chrome/User Data/Profile 10");
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();

        return driver;
    }

}
