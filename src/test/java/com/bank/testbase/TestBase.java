package com.bank.testbase;

import com.bank.browserselector.BrowserSelector;
import com.bank.utility.Utility;
import org.openqa.selenium.Point;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by patel
 */
public class TestBase extends Utility {

    BrowserSelector browserSelector = new BrowserSelector();
    String baseUrl = "http://www.way2automation.com/angularjs-protractor/banking/#/login";

    @BeforeTest
    public void openBrowser(){
        browserSelector.selectBrowser("chrome");
        driver.manage().window().setPosition(new Point(-2000, 0));//display into second screen
        driver.manage().window().maximize();
//        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterTest
    public void tearDown(){
        //driver.quit();
    }



}
