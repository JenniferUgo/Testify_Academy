package com.jennifer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Testify_Automation\\Module4\\Module 4B\\Task\\Task8\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://idorenyinankoh.github.io/loginPage/");
        boolean state = driver.findElement(By.cssSelector("input#xpLevel")).isEnabled();
        driver.findElement(By.id("firstName")).sendKeys("Jen");
        driver.findElement(By.id("lastName")).sendKeys("Daniels");
        driver.findElement(By.id("email")).sendKeys("jen@test.com");
        driver.findElement(By.id("password")).sendKeys("jentest");
        driver.findElement(By.id("confirmPass")).sendKeys("jentest");
        driver.findElement(By.id("xpLevel")).sendKeys("Software QA Engineer");
        driver.findElement(By.cssSelector("input#female")).click();
        Thread.sleep(2000);
        boolean status = driver.findElement(By.cssSelector("input#xpLevel")).isEnabled();
        System.out.println(state);
        System.out.println(status);

        driver.quit();
    }
}


// Navigate to https://idorenyinankoh.github.io/loginPage/
//check if the " create account" button is enabled"
//fill all the fields
//check if the "create account"is enabled

// TO SCROLL DOWN A PAGE
//  JavascriptExecutor js = (JavascriptExecutor) driver;
//  js.executeScript("window,scrollBy(0,200)");