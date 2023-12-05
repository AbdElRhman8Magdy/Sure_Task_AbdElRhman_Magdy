package com.qacart.todo.pages;

import com.github.javafaker.Faker;
import com.qacart.todo.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class ContactDetails extends BasePage {
    /**
     * 
     * @param driver
     */
    public ContactDetails(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//*[.='Street 1']//*[@class='oxd-input oxd-input--active']")
    private WebElement Str1;
    @FindBy(xpath = "//*[.='Street 2']//*[@class='oxd-input oxd-input--active']")
    private WebElement Str2;
    @FindBy(xpath =  "//*[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//*[@type='submit']")
    private WebElement Save;
    @FindBy(xpath = "//*[.='Success']")
    private WebElement ToastSuccess;

    @FindBy(xpath = "//*[.=' Add ']")
            private WebElement AddAttachment;
    @FindBy(css = ".oxd-file-input")
    private WebElement Upload;
    @FindBy(css = ".bi-upload")
            private WebElement UploadBtn;
    @FindBy(xpath = "//button[2]")
    private WebElement UploadSave;

    @FindBy (xpath = "//div[@class='oxd-table-card']")
            private WebElement UploadGrid;

    @FindBy (xpath = "//a[.='Job']")
            private WebElement JobPage;



    String Streatname1 = new Faker().address().streetName();
    String Streatname2 = new Faker().address().streetAddressNumber();




    @Step
    public void EditContact(){

        Str1.click();
        Str1.clear();
        Str1.sendKeys(Streatname1);


        Str2.clear();
        Str2.sendKeys(Streatname2);

        Save.click();
    }
@Step
    public Boolean IsSuccessDisplayed(){
return ToastSuccess.isDisplayed();
}

@Step
    public void AddAttachment() throws InterruptedException {
        AddAttachment.click();
        File filepath = new File("src//main//resources//IMG_20230702_060918_108.jpg");
        Upload.sendKeys(filepath.getAbsolutePath());
        Thread.sleep(4000);
//    Actions upload = new Actions(driver);
//    upload.sendKeys(Upload,filepath.getAbsolutePath());

    UploadSave.click();

    }
    @Step
    public Boolean IsUploadGridShown(){
        return UploadGrid.isDisplayed();
    }
@Step
    public JobDetails NavigateToJobPage(){
     JobPage.click();
        return new JobDetails(driver);
    }

    @Step
    public  void Load(){
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewJobDetails/empNumber/47");
    }

}

