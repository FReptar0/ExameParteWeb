package com.test_cases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.login.ClienteVenta;
import com.login.CommonMethods;
import com.setup.SetupDriver;

public class TC_01_ClienteVender {
    WebDriver driver = SetupDriver.setupChromeDriver();
    ClienteVenta cliente = new ClienteVenta(driver);

    @BeforeTest
    public void startWebDriver() throws InterruptedException {
        driver.get("http://desarrollosenweb.com/examen4D-DSM/");
        Thread.sleep(2000);
    }

    @Test
    public void login() throws InterruptedException {
        cliente.login();
        Thread.sleep(2000);
        cliente.vender();
        CommonMethods.takeScreenshot(driver, "TC_01_ClienteVender_Vender");
        Thread.sleep(2000);
        cliente.logOut();
    }

    @AfterTest
    public void closeWebDriver() {
        driver.close();
    }

}