package com.jennifer;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Testify_Automation\\Module4\\Module 4B\\Task\\Task13\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/");
        driver.manage().window().maximize();
        //Click on search
        driver.findElement(By.xpath("/html/body//header[@role='banner']//button[@class='flat-button search-expand touch-icon-button']/div[@class='search-expand-text']")).click();
        //Type text
        driver.findElement(By.xpath("//div[@id='BlogSearch1']//form[@action='https://selenium08.blogspot.com/search']//input[@name='q']"))
                .sendKeys("Demo dropdown");
        //Search
        Actions search = new Actions(driver);
        search.sendKeys(Keys.ENTER).build().perform();
        driver.findElement(By.xpath("/html//div[@id='Blog1']/div[1]/article[@class='post-outer-container']//h3/a[@href='https://selenium08.blogspot.com/2019/11/dropdown.html']")).click();
        //Scroll down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window,scrollBy(0,200)");
        //Get the Select element
        WebElement selectDropdown = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]"));

        Thread.sleep(3000);
        //1. Select by visible text
        Select country = new Select(selectDropdown);
        Thread.sleep(3000);
        country.selectByVisibleText("Nigeria");
        Thread.sleep(3000);

        driver.quit();
    }
}

//Go to https://selenium08.blogspot.com/
// search for "Demo dropdown" form the search field.
// on the dropdown page, select Nigeria from the country list and select january february
// and march from the moths list. (image; https://i.imgur.com/sIgQwwG.png)