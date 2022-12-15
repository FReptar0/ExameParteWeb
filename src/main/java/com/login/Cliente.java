package com.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cliente {
    @FindBy(id = "usuario")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "entrarSistema")
    private WebElement login;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/ul/li[3]/a")
    private WebElement manageClients;

    @FindBy(id = "nombre")
    private WebElement nombre;  

    @FindBy(id = "apellidos")
    private WebElement apellido;

    @FindBy(id = "direccion")
    private WebElement direccion;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "telefono")
    private WebElement telefono;

    @FindBy(id = "rfc")
    private WebElement rfc;

    @FindBy(id = "btnAgregarCliente")
    private WebElement guardarCliente;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/ul/li[2]/a")
    private WebElement dropDownManageProducts;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/ul/li[2]/ul/li[1]/a")
    private WebElement manageCatefories;

    @FindBy(id = "categoria")
    private WebElement categoria;

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/form/span")
    private WebElement guardarCategoria;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/ul/li[2]/ul/li[2]/a")
    private WebElement manageProducts;

    @FindBy(id = "categoriaSelect")
    private WebElement cate;

    @FindBy(id = "nombre")
    private WebElement nombreProducto;

    @FindBy(id = "descripcion")
    private WebElement descripcion;

    @FindBy(id = "cantidad")
    private WebElement cantidad;

    @FindBy(id = "precio")
    private WebElement precio;

    @FindBy(id = "imagen")
    private WebElement imagen;

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/form/span")
    private WebElement aggregarProducto;


    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/ul/li[5]/a")
    private WebElement dropDownLogOut;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/ul/li[5]/ul/li/a")
    private WebElement logOut;

    public Cliente(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void login() throws InterruptedException {
        username.sendKeys("fmemije");
        Thread.sleep(2000);
        password.sendKeys("1234567890");
        login.click();
        Thread.sleep(2000);
        manageClients.click();
        Thread.sleep(2000);

        nombre.sendKeys("Fernando_4D-DSM");
        Thread.sleep(2000);
        apellido.sendKeys("Rodriguez Memije");
        Thread.sleep(2000);
        direccion.sendKeys("Calle 1");
        Thread.sleep(2000);
        email.sendKeys("20213tn137@utez.edu.mx");
        Thread.sleep(2000);
        telefono.sendKeys("1234567890");
        Thread.sleep(2000);
        rfc.sendKeys("FEMR123456789");
        Thread.sleep(2000);
        guardarCliente.click(); 
    }

    public void manageProducts() throws InterruptedException {
        Thread.sleep(2000);
        dropDownManageProducts.click();
        Thread.sleep(2000);
        manageCatefories.click();
        Thread.sleep(2000);

        categoria.sendKeys("Fernando_RodriguezMemije_4D-DSM");
        Thread.sleep(2000);
        guardarCategoria.click();
        Thread.sleep(2000);
    }

    public void createProduct() throws InterruptedException {
        dropDownManageProducts.click();
        Thread.sleep(2000);
        manageProducts.click();
        Thread.sleep(2000);


        cate.sendKeys("Fernando_RodriguezMemije_4D-DSM");
        Thread.sleep(2000);
        nombreProducto.sendKeys("FernandoRodriguez_Francia");
        Thread.sleep(2000);
        descripcion.sendKeys("Hola Mundo");
        Thread.sleep(2000);
        cantidad.sendKeys("10");
        Thread.sleep(2000);
        precio.sendKeys("100");
        Thread.sleep(2000);
        imagen.sendKeys("C:\\Users\\Fernando\\Desktop\\francia.jfif");
        Thread.sleep(2000);
        aggregarProducto.click();
        Thread.sleep(2000);
    }

    public void logOut() throws InterruptedException {
        dropDownLogOut.click();
        Thread.sleep(2000);
        logOut.click();
        Thread.sleep(2000);
    }
    
}
