package com.test_cases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.login.Admin;
import com.login.CommonMethods;
import com.setup.SetupDriver;

public class TC_01_Admin {
    WebDriver driver  = SetupDriver.setupChromeDriver();
    Admin admin = new Admin(driver);

    @BeforeTest 
    public void startWebDriver() throws InterruptedException {
        driver.get("http://desarrollosenweb.com/examen4D-DSM/");
        Thread.sleep(2000);
    }

    @Test
    public void login() throws InterruptedException {
        admin.login();
        Thread.sleep(2000);
        CommonMethods.takeScreenshot(driver, "TC_01_Admin");
        admin.logOut();
        Thread.sleep(2000);
    }

    @AfterTest
    public void closeWebDriver() {
        driver.close();
    }

}
