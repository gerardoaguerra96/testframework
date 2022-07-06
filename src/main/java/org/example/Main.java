package org.example;


import POM.elements;
import org.junit.Assert;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class ChromeTest {

    WebDriver driver;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    void happyPath() throws Exception {
        // Exercise

        elements element = new elements(driver);

        driver.get("https://www.facebook.com/");

        element.setCredentials("correoBuenoDeGerry", "ContrasenaBuena");
        //assert inicio sesion
    }
    @Test
    void badPath() throws Exception {
        // Exercise

        elements element = new elements(driver);

        driver.get("https://www.facebook.com/");

        element.setCredentials("malCorreo", "malContrasena");
        element.enterText(element.txtUserName, "Hola");
        //assert que no inicio sesion
        Assert.assertTrue();
    }
}