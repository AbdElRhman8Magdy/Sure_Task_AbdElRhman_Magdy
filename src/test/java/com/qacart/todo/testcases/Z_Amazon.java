package com.qacart.todo.testcases;

import com.qacart.todo.base.BaseTest;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.awt.*;

public class Z_Amazon extends BaseTest {
    @Test(priority = 1,enabled = true)
    public void amazonVisit() throws InterruptedException, AWTException {

        String s = RandomStringUtils.randomAlphanumeric(8);;
        System.out.printf(s);
        System.out.printf(s);
        System.out.printf(s);


        getDriver().get("https://www.amazon.eg/-/en/Akai-electric-pedestal-ak-18s-black/dp/B091NXYPGF?ref_=Oct_DLandingS_D_c3d21990_2&th=1&fbclid=IwAR1yNvkdxsMZmHxcXPNSvmhmL5Jfpyv-Fb640C-sA-qLrFEvCu0QvIE-eeU");

        getDriver().findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
//        Thread.sleep(2000);
        getDriver().findElement(By.xpath("//span[@id='attachSiAddCoverage']")).click();
        Thread.sleep(2000);

    }


}

