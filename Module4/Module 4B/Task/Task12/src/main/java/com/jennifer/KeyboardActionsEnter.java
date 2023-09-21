package com.jennifer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsEnter {
    public static void KeyboardActions(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Testify_Automation\\Module4\\Module 4B\\Task\\Task12\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.xpath("/html//textarea[@id='APjFqb']")).sendKeys("Jennifer Ugo");
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        driver.quit();

        //OR we use the Actions Class

        Actions keys = new Actions(driver);
        keys.sendKeys("Jennifer Ugo").sendKeys(Keys.ENTER).build().perform();


    }
}
