package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class elements {

    public static WebDriver driver;

    public elements(WebDriver driver) {
        this.driver = driver;
    }

    public static By txtUserName = By.id("email");
    public static By txtUserPwd = By.id("pass");
    public static By btnLognin = By.xpath("//button[contains(text(), 'Iniciar')]");


    public static void setCredentials(String userName, String pwd){
        driver.findElement(txtUserName).sendKeys(userName);
        driver.findElement(txtUserPwd).sendKeys(pwd);
        driver.findElement(btnLognin).click();
    }

    public static void enterText(By element, String text){
        System.out.printf("Introduciendo texto " + text + " al elemento " + element);
        driver.findElement(element).sendKeys(text);
    }

}