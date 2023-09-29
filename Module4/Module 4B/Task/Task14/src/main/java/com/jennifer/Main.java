package com.jennifer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Testify_Automation\\Module4\\Module 4B\\Task\\Task14\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        // Implicit wait
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.toolsqa.com/");
        // Explicit wait
        WebDriverWait accept = new WebDriverWait(driver, Duration.ofSeconds(3));
        accept.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//button[@id='accept-cookie-policy']")));
        driver.findElement(By.xpath("/html//button[@id='accept-cookie-policy']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html//nav[@class='navbar']/div[@class='container-fluid']/div//span[@class='navbar__tutorial-menu--text']"))
                        .click();
        Thread.sleep(3000);
        driver.quit();
    }
}

// Navigate to https://www.toolsqa.com/
//close the dialogue box that pops up after a few seconds
//Click on the tutorial button in the top left corner of the page