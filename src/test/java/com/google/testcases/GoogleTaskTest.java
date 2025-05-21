package com.google.testcases;

import com.google.base.BaseTest;
import com.google.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class GoogleTaskTest extends BaseTest {


    @Test
    public void SearchFlight() throws IOException, InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        loginPage.Load()
                .Search("flight options from (Cairo to Marsa Alam)");
        Assert.assertTrue(loginPage.FlightIsSuccessDisplayed());
    }

    @Test
    public void SearchWeather() throws IOException, InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        loginPage.Load()
                .SearchWeather("flight options from (Cairo to Marsa Alam)","Marsa Alam weather");
        Assert.assertTrue(homePage.GoogleWeatherWidgetIsSuccessDisplayed());
        Assert.assertTrue(homePage.TemptIsSuccessDisplayed());
    }
    @Test
    public void SearchRestaurant() throws IOException, InterruptedException {
        LoginPage loginPage = new LoginPage(getDriver());
        PlacesWidget placesWidget = new PlacesWidget(getDriver());
        loginPage.Load()
                .SearchRestaurant("restaurant near Marsa Alam")
                .SortByOpenResturants();
        Assert.assertTrue(placesWidget.PlacesWidgetIsSuccessDisplayed());

    }
}
