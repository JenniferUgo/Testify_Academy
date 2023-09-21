package com.jennifer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Testify_Automation\\Module4\\Module 4B\\Task\\Task9\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(2000);
        WebElement loginButtonAfterBack = driver.findElement(By.id("login-button"));
        String loginButtonValue = loginButtonAfterBack.getAttribute("value");
        System.out.println("Login button value: " + loginButtonValue);

        Thread.sleep(3000);
        driver.navigate().forward();

        WebElement product = driver.findElement(By.cssSelector(".inventory_list .inventory_item:nth-of-type(1) .inventory_item_name"));
        String productName = product.getText();
        System.out.println("Product name on homepage: " + productName);
        Thread.sleep(2000);

        driver.quit();
    }
}


//Navigate to saucedemo.com
//Login with username and password
//navigate back to login screen from the homepage
//print out the Login button attribut "VALUE" to verify that you are back on the login screen
//navigate forward to the homepage, print out a name of a product to verify that you are back on the homepage