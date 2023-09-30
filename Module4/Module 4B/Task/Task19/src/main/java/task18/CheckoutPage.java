package task18;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

import java.time.Duration;

public class CheckoutPage {
    private final WebDriver driver;
    private final By firstNameField = By.cssSelector("#first-name");
    private final By lastNameField = By.cssSelector("#last-name");
    private final By postalCodeField = By.cssSelector("#postal-code");
    private final By continueButton = By.cssSelector("#continue");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }


    public void enterUserDetails(String firstName, String lastName, String postalCode) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement firstNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name")));


        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(postalCodeField).sendKeys(postalCode);
        driver.findElement(continueButton).click();
    }



}
