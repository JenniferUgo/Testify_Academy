package com.jennifer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage {
    private final WebDriver driver;
    private final By addToCartButton1 = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    private final By addToCartButton2 = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");

    private final By cartIcon = By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart(int numberOfItems) {
        for (int i = 0; i < numberOfItems; i++) {
            if (i == 0) {
                driver.findElement(addToCartButton1).click();
            } else if (i == 1) {
                driver.findElement(addToCartButton2).click();
            }
        }
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }
}
