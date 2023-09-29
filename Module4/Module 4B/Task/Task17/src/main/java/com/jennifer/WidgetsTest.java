package com.jennifer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WidgetsTest {

    @Test
    public void testNavigateToWidgetsPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Testify_Automation\\Module4\\Module 4B\\Task\\Task17\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com");
        Thread.sleep(3000);
        WebElement widgets = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]"));
        widgets.click();

        WebElement header = driver.findElement(By.cssSelector(".main-header"));
        String headerText = header.getText();

        // Assertion to check if on Forms page
        Assert.assertTrue(headerText.contains("Widgets"));
        System.out.println("On Widgets page");
        driver.quit();
    }
}

