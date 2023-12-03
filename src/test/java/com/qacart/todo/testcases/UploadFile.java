package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

public class UploadFile extends BaseTest {

    @FindBy(xpath = "//ul[@class='course-list']//li")
    List<WebElement> CourseList;

    @Test (priority = 1)
    public void ShouldBeAbleToDeleteTodo() throws InterruptedException, AWTException {


        getDriver().get("https://hatem-hatamleh.github.io/cypress-index-html/");



List <WebElement> liist = getDriver().findElements(By.xpath("//ul[@class='course-list']//li"));

        for (int i =0; i <= liist.size()-1;i++){
            System.out.println(liist.get(i).getText());

        }

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scrollto = getDriver().findElement(By.xpath("//input[@class='btn btn-primary right-click double-click']"));
        js.executeScript("arguments[0].scrollIntoView();", scrollto);

        String color = "blue";

        js.executeScript("arguments[0].style.border = '3px solid red'", scrollto);
        Thread.sleep(2000);
        js.executeScript("arguments[0].style.backgroundColor = '" + color + "'" , scrollto);
        Thread.sleep(2000);



        getDriver().get("https://imgbb.com/upload");


        WebElement UploadBtn = getDriver().findElement(By.cssSelector(".cursor-pointer"));
        UploadBtn.click();
       Thread.sleep(2000);
        Robot rb = new Robot();


String FilePath = "C:\\Users\\abdel\\Downloads\\IMG_20230702_060918_108.jpg";
        // copying File path to Clipboard
        StringSelection str = new StringSelection(FilePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

        // press Contol+V for pasting
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        // release Contol+V for pasting
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        // for pressing and releasing Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(2000);
        String Uploaded = getDriver().findElement(By.xpath("//*[@for=\"upload-expiration\"]")).getText();
        Assert.assertEquals(Uploaded,"Auto delete image");
        System.out.println(" file  "+Uploaded);

    }
}