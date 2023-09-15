package com.jennifer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Testify_Automation\\Module4\\Module 4B\\Task\\Task2\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://instagram.com");
        driver.quit();
    }
}
