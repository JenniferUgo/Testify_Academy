package com.jennifer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class CartPage {
    private final WebDriver driver;
    private final By cartItemNames = By.className("cart_item_label");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifyCartItems(String[] expectedItems) {
        List<WebElement> cartItems = driver.findElements(cartItemNames);

        if (cartItems.size() != expectedItems.length) {
            System.out.println("Number of cart items does not match expected number");
            return false;
        }

        for (int i = 0; i < expectedItems.length; i++) {
            String expectedItem = expectedItems[i];
            String actualItem = cartItems.get(i).getText();

            if (!actualItem.equals(expectedItem)) {
                System.out.println("Mismatch found:");
                System.out.println("Expected Item: " + expectedItem);
                System.out.println("Actual Item: " + actualItem);
                return false;
            }
        }

        return true;
    }
}
