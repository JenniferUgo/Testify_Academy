package com.jennifer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Testify_Automation\\Module4\\Module 4B\\Task\\Task10\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://jqueryui.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("aside:nth-of-type(2) > ul > li:nth-of-type(7) > a")).click();
        Thread.sleep(5000);

        // Switch to the iframe containing the dialog
        driver.switchTo().frame(0);
        Thread.sleep(3000);
        WebElement iframe = driver.findElement(By.xpath("//div[@id='dialog']"));
        Actions box = new Actions(driver);
        box.click(iframe).build().perform();

        // Switch back to the default content
        driver.switchTo().defaultContent();
        driver.quit();
    }
}




// Navigate to https://jqueryui.com/
// click on the dialog menu from the left pane
// click on the close icon to close the dialogue box in the middle