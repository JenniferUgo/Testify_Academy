package com.jennifer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Testify_Automation\\Module4\\Module 4B\\Task\\Task18\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //1
        driver.get("https://saucedemo.com");
        driver.manage().window().maximize();

        //2
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        //3
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();

        driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]"))
                .click();
        Thread.sleep(3000);

        //4
        WebElement productOne = driver.findElement(By.xpath("//div[@id='']"));
        String productOneText = productOne.getText();

        Assert.assertTrue(productOneText.contains("Sauce Labs Backpack"));
        System.out.println("Product One is Present");

        WebElement productTwo = driver.findElement(By.xpath("//div[@id='']"));
        String productTwoText = productTwo.getText();

        Assert.assertTrue(productTwoText.contains("Sauce Labs Bike Light"));
        System.out.println("Product Two is Present");

        //5
        driver.findElement(By.xpath("//button[@id='checkout']")).click();

        //6
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Usher");
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Raymond");
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("SE26");

        driver.findElement(By.xpath("//input[@id='continue']")).click();

        //7
        Thread.sleep(2000);
        WebElement itemOne = driver.findElement(By.xpath("//div[@id='']"));
        String itemOneText = itemOne.getText();
        Assert.assertTrue(itemOneText.contains("Sauce Labs Backpack"));
        System.out.println("Item One is Present");

        WebElement itemTwo = driver.findElement(By.xpath("//div[@id='']"));
        String itemTwoText = itemTwo.getText();
        Assert.assertTrue(itemTwoText.contains("Sauce Labs Bike Light"));
        System.out.println("Item Two is Present");

        //8
        driver.findElement(By.xpath("//button[@id='finish']")).click();

        WebElement success = driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your order!')]"));
        String successMessage = success.getText();
        Assert.assertTrue(successMessage.contains("Thank you for your order!"));

        driver.quit();
    }
}

//Using your knowledge of POM, organize your order item test case below:
//Navigate to saucedemo.com
//Login with the username and password on the Login screen.
//Add two items to cart. Click on the cart icon on the top right.
//Assert that the items you clicked and added to cart are what are displayed on the "YOUR CART" page.
//Click on the checkout button.
//Input first name last name and postal code and click on continue.
//Assert that the item showed on the CHECKOUT: OVERVIEW page is the item that was added to cart from the first page.
//Click on the "Finish" button. Assert that user sees a success message "THANK YOU FOR YOUR ORDER".