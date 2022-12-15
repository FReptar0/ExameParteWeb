package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin {
    @FindBy(id = "usuario")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "entrarSistema")
    private WebElement login;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/ul/li[3]/a")
    private WebElement manageUsers;

    @FindBy(id = "nombre")
    private WebElement nombre;

    @FindBy(id = "apellido")
    private WebElement apellido;

    @FindBy(id = "usuario")
    private WebElement usuario;

    @FindBy(id = "password")
    private WebElement password1;

    @FindBy(id = "registro")
    private WebElement guardarUsuario;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/ul/li[6]/a")
    private WebElement dropDownLogOut;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/ul/li[6]/ul/li/a")
    private WebElement logOut;

    


    public Admin(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void login() throws InterruptedException {
        username.sendKeys("admin");
        Thread.sleep(2000);
        password.sendKeys("abracadabra123");
        login.click();
        Thread.sleep(2000);
        manageUsers.click();
        Thread.sleep(2000);
        nombre.sendKeys("Fernando");
        Thread.sleep(2000);
        apellido.sendKeys("Memije");
        Thread.sleep(2000);
        usuario.sendKeys("fmemije");
        Thread.sleep(2000);
        password.sendKeys("1234567890");
        Thread.sleep(2000);
        guardarUsuario.click();
    }

    public void logOut() throws InterruptedException {
        Thread.sleep(2000);
        dropDownLogOut.click();
        Thread.sleep(2000);
        logOut.click();
    }
}
