package com.jennifer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Testify_Automation\\Module4\\Module 4B\\Task\\Task7\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://worldweather.wmo.int/en/home.html");
        driver.findElement(By.id("q_search")).sendKeys("Lagos");
        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/ul//div[.='Lagos, Nigeria']")).click();
        Thread.sleep(3000);
        String weatherInfo = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[5]/div[2]")).getText();
        //System.out.println(weatherInfo);

        String[] infoLines = weatherInfo.split("\n");

// (Print out in a table formart) Assuming each category has a fixed width
        String format = "%-12s%-12s%-15s%-20s\n";

        System.out.printf(format, infoLines[0], infoLines[1], infoLines[2], infoLines[3]);
        System.out.println("------------------------------------------------");

        for (int i = 4; i < infoLines.length; i += 4) {
            System.out.printf(format, infoLines[i], infoLines[i + 1], infoLines[i + 2], infoLines[i + 3]);
        }
        driver.quit();
    }
}

    // Navigate to https://worldweather.wmo.int/en/home.html.
    //Search for your city in the search field. When the result loads, print the days and weather description for each of the days shown in a readable and understandable manner.


