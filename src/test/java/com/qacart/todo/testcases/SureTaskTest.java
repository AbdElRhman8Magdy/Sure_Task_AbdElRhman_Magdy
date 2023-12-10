package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.pages.ContactDetails;
import com.qacart.todo.pages.JobDetails;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.PIMPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SureTaskTest extends BaseTest {





    @Test
    public void API() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.Load().login("Admin","admin123").NavigateToEmpPage();

//        RegisterAPI registerAPI = new RegisterAPI();
//        registerAPI.register();
        PIMPage pimPage = new PIMPage(getDriver());
        pimPage.Search().EditContact();

        ContactDetails contactDetails= new ContactDetails(getDriver());

        contactDetails.IsSuccessDisplayed();
        Assert.assertTrue(contactDetails.IsSuccessDisplayed());
        contactDetails.AddAttachment();
        System.out.println("Is Save Details Toast Message is shown  --->  " +contactDetails.IsSuccessDisplayed());

        contactDetails.IsUploadGridShown();
        Assert.assertTrue(contactDetails.IsUploadGridShown());
        System.out.println("Is Upload Grid Is shown --->   " + contactDetails.IsUploadGridShown());

        contactDetails.NavigateToJobPage();

    }

    @Test
    public void GoToJobdetails() throws IOException, InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.Load().login("Admin","admin123").NavigateToEmpPage();

        PIMPage pimPage = new PIMPage(getDriver());
        pimPage.
                Search().
                NavigateToJobPage().
                EditJopDetails();
    }

    @Test
    public void GoToJobdetailszzz() throws IOException, InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.Load().login("Admin","admin123");

        PIMPage pimPage = new PIMPage(getDriver());
        pimPage.
                Search().
                NavigateToJobPage();

        JobDetails jobDetails = new JobDetails(getDriver());
         jobDetails.EditJopDetails();


    }
}
