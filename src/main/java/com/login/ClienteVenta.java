package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClienteVenta {
    @FindBy(id = "usuario")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "entrarSistema")
    private WebElement login;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/ul/li[5]/a")
    private WebElement dropDownLogOut;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/ul/li[5]/ul/li/a")
    private WebElement logOut;


    /* DATOS PARA LA VENTA */
    
    @FindBy(xpath = "/html/body/div/div/div/div[2]/ul/li[4]/a")
    private WebElement navBarVenderA;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/span[1]")
    private WebElement botonForm;

    @FindBy(xpath  = "/html/body/div[2]/div[2]/div/div[1]/div/div[1]/form/span[1]/span[1]/span/span[2]")
    private WebElement select;

    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    private WebElement inputSelect;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div[1]/div/div[1]/form/span[2]/span[1]/span/span[2]")
    private WebElement select2;

    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    private WebElement inputSelect2;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div[1]/div/div[1]/form/span[3]")
    private WebElement btnAgregar;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div[1]/div/div[3]/div/table/caption/span")
    private WebElement btnGuardar;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/span[2]")
    private WebElement btnVer;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div[4]/div[2]/button")
    private WebElement btnCerrar;

    /* FIN DE LOS DATOS PARA LA VENTA */

    public ClienteVenta(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void login() throws InterruptedException {
        username.sendKeys("fmemije");
        Thread.sleep(2000);
        password.sendKeys("1234567890");
        login.click();
        Thread.sleep(2000);
        navBarVenderA.click();
    }

    public void vender() throws InterruptedException {
        botonForm.click();
        Thread.sleep(2000);
        select.click();
        Thread.sleep(2000);
        inputSelect.sendKeys("Fernando\n");
        Thread.sleep(2000);
        select2.click();
        Thread.sleep(2000);
        inputSelect2.sendKeys("Fernando\n");
        Thread.sleep(2000);
        btnAgregar.click();
        Thread.sleep(2000);
        btnGuardar.click();
        Thread.sleep(2000);
        btnCerrar.click();
        Thread.sleep(2000);
        btnVer.click();
        Thread.sleep(2000);
    }

    public void logOut() throws InterruptedException {
        dropDownLogOut.click();
        Thread.sleep(2000);
        logOut.click();
        Thread.sleep(2000);
    }
}
