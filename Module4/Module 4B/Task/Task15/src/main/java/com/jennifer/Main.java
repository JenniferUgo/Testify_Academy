package com.jennifer;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Main {
        WebDriver driver =null;
    @Test
    public void googleSearch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Testify_Automation\\Module4\\Module 4B\\Task\\Task15\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://google.com");
        driver.findElement(By.xpath("/html//textarea[@id='APjFqb']")).sendKeys("testify");
        Actions search = new Actions(driver);
        search.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
        driver.close();
    }
     @Test
     public void mcDonalds() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Testify_Automation\\Module4\\Module 4B\\Task\\Task15\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.mcdonalds.com/us/en-us.html");
        WebElement orderNowButton = driver.findElement(By.xpath("/html//a[@id='button-ordernow']"));
        // Get the color code of the button
        String colorCode = orderNowButton.getCssValue("color");
         // Print out the color code
        System.out.println("Color code of the 'Order Now' button: " + colorCode);
        Thread.sleep(2000);
        driver.quit();
    }
}

// Structure your TestNG file to run Navigate to google and search for testify.
//close the browser
//Navigate to https://www.mcdonalds.com/us/en-us.html . print out the colour - code of the order now button.
// All test should be done in one class and utilize your knowledge of tesNG annotation)