package com.jennifer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage {
    private final WebDriver driver;
    private final By cartItemName = By.className("inventory_item_name");
    private final By finishButton = By.id("finish");

    public OverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCartItemName() {
        return driver.findElement(cartItemName).getText();
    }

    public void clickFinishButton() {
        driver.findElement(finishButton).click();
    }
}
