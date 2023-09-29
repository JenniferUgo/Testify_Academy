package com.jennifer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Main {
    WebDriver driver = new ChromeDriver();

    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "C:\\Testify_Automation\\Module4\\Module 4B\\Task\\Task16\\src\\chromedriver.exe");
        driver.manage().window().maximize();

        driver.navigate().to("https://testifyltd.com");
        driver.findElement(By.xpath("/html//div[@id='__next']/section/div/div[1]/div[2]/div/div[5]/ul//a[@href='/contact']"))
                .click();

        // Locating the elements containing contact details
        WebElement email = driver.findElement(By.xpath("//?/span[@innertext='info@testifyltd.com']"));
        WebElement phone = driver.findElement(By.xpath("//?/span[@innertext='(+234)905-882-0971']"));
        WebElement location = driver.findElement(By.xpath("//?/span[@innertext='Nigeria']"));

        // Getting the text content of the elements
        String emailText = email.getText();
        String phoneText = phone.getText();
        String locationText = location.getText();
        SoftAssert sa = new SoftAssert();


        // Asserting that the details match the expected values
        Assert.assertEquals(emailText, "info@testifyltd.co.uk");
        Assert.assertEquals(phoneText, "(+234)904-882-0971");
        Assert.assertEquals(locationText, "Nigeria");
        sa.assertAll();


        System.out.println("Email: " + emailText);
        System.out.println("Phone: " + phoneText);
        System.out.println("Location " + locationText);

        driver.quit();


    }
}

// Navigate to https://testifyltd.com/ .
//Assert that the 'Our contact' column at the footer of the homepage has the following correct details;
//EMAIL: info@testifyltd.co.uk
//LOCATION: Nigeria
//PHONE: (+234)904-882-0971