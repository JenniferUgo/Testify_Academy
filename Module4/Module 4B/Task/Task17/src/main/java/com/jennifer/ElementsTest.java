package com.jennifer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsTest {

    @Test
    public void testNavigateToElementsPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Testify_Automation\\Module4\\Module 4B\\Task\\Task17\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com");
        WebElement elements = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
        elements.click();

        WebElement header = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]"));
        String headerText = header.getText();

        // Assertion to check if on Elements page
        Assert.assertTrue(headerText.contains("Elements"));
        System.out.println("On Elements page ");
        driver.quit();
    }
}
