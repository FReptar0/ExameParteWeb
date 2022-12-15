package com.test_cases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.login.Cliente;
import com.login.CommonMethods;
import com.setup.SetupDriver;

public class TC_01_Cliente {
    WebDriver driver  = SetupDriver.setupChromeDriver();
    Cliente cliente = new Cliente(driver);

    @BeforeTest 
    public void startWebDriver() throws InterruptedException {
        driver.get("http://desarrollosenweb.com/examen4D-DSM/");
        Thread.sleep(2000);
    }

    @Test
    public void login() throws InterruptedException {
        cliente.login();
        Thread.sleep(2000);
        CommonMethods.takeScreenshot(driver, "TC_01_Cliente_CrearCliente");
        cliente.manageProducts();
        Thread.sleep(2000);
        CommonMethods.takeScreenshot(driver, "TC_01_Cliente_CrearCategoria");
        cliente.createProduct();
        Thread.sleep(2000);
        CommonMethods.takeScreenshot(driver, "TC_01_Cliente_CrearProducto");
        cliente.logOut();
        Thread.sleep(2000);
    }

    @AfterTest
    public void closeWebDriver() throws InterruptedException {
        driver.close();
    }
}
