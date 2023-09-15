package com.jennifer;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Testify_Automation\\Module4\\Module 4B\\Task\\Task4\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/");
        //driver.findElement(By.xpath("//div[@id='navbar-brand-centered']/ul[@class='nav navbar-nav']//a[@href='http://demo.guru99.com/Security/SEC_V1/index.php']")).click();
        // Find and click the link that triggers the popup
        driver.findElement(By.linkText("Security Project")).click();
        // Locate the close button element and click it
        driver.findElement(By.id("ad_position_box")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("uid")).sendKeys("jennee");
        driver.findElement(By.name("password")).sendKeys("word1");
        driver.quit();
    }
}

// Navigate to http://demo.guru99.com/
//Click on the security Project menu.
// Input any text in the email and password field