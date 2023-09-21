package com.jennifer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Testify_Automation\\Module4\\Module 4B\\Task\\Task12\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@id='sidebar']/aside[1]/ul//a[@href='https://jqueryui.com/resizable/']")).click();

        // Switch to the iframe containing the dialog
        driver.switchTo().frame(0);
        Thread.sleep(3000);

        WebElement resizeBox = driver.findElement(By.xpath("//*[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));

        Actions builder = new Actions(driver);
        builder.clickAndHold(resizeBox).moveByOffset(100, 100).release().build().perform();

        driver.quit();
    }
}


// Navigate to https://jqueryui.com/
//.click on the "resize" menu from the left pane
//Drag the box to be bigger.(Resize the box to be bigger)