package com.jennifer;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Testify_Automation\\Module4\\Module 4B\\Task\\Task11\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("APjFqb")).sendKeys("testify ltd");
        driver.findElement(By.cssSelector(".LLD4me.LS8OJ.o3j99.yr19Zb")).click();
        driver.findElement(By.xpath("/html/body//form[@role='search']//div[@class='A8SBwf']/div[@class='FPdoLc lJ9FBc']/center/input[@role='button']")).click();
        driver.findElement(By.cssSelector("a[ping^='/url?sa=t&source=web&rct=j&opi=89978449&url=https://www.test'] > .DKV0Md.LC20lb.MBeuO")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window,scrollBy(0,200)");

        driver.findElement(By.cssSelector("div:nth-of-type(2) > .bg-\\[\\#DFEDFF\\].dark\\:bg-\\[\\#013069\\].p-2.rounded-full > .dark\\:fill-\\[\\#86BCFF\\].fill-\\[\\#13529F\\]")).click();
        Thread.sleep(2000);
        //Pop up
        driver.switchTo().frame(1);
        Thread.sleep(3000);
        WebElement iframe = driver.findElement(By.xpath("//*[@id=\"organization_guest_contextual-sign-in\"]/div/section/button/icon/svg"));
        Actions box = new Actions(driver);
        box.click(iframe).build().perform();

        Thread.sleep(3000);
        WebElement desc = driver.findElement(By.cssSelector(".org-top-card-summary__tagline"));
        desc.getText();
        String descriptionText = desc.getText();
        System.out.println(descriptionText);
        driver.quit();
    }
}


//  ALERT
 // Alert alert = driver.switchTo().alert();
//        alert.accept();
//        alert.dismiss();
//        alert.sendKeys("");
//        alert.getText();




// Go to google.
//search for "testify ltd"
//Click on the search that result with www.testifyltd.com
//scroll down the testify website and click on the linkedIn icon.
//Get the description text on the userpage.(image; https://i.imgur.com/PmrWDXa.png )
