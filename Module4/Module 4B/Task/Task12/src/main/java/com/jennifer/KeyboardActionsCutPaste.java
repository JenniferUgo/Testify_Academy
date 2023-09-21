package com.jennifer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsCutPaste {
    public static void KeyboardActionsCutPaste(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Testify_Automation\\Module4\\Module 4B\\Task\\Task12\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");


        //ctrl A to copy
        Actions keys = new Actions(driver);
        keys.sendKeys("Jennifer Ugo").keyDown(Keys.CONTROL).sendKeys("a").build().perform();
        Thread.sleep(5000);

        keys.keyDown(Keys.CONTROL).sendKeys("x").build().perform();

        Thread.sleep(3000);
        keys.keyDown(Keys.CONTROL).sendKeys("v").build().perform();

        // To move the arrow keys up and down (down in this case).
        keys.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
    }
}
