package SauceDemo;

import com.jennifer.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrderItemTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Testify_Automation\\Module4\\Module 4B\\Task\\Task18\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
    }

    @Test
    public void testOrderItem() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addToCart(2);
        productsPage.goToCart();

        CartPage cartPage = new CartPage(driver);
        String[] expectedItems = {"Sauce Labs Backpack\n" +
                "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.\n" +
                "$29.99\n" +
                "Remove", "Sauce Labs Bike Light\n" +
                "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.\n" +
                "$9.99\n" +
                "Remove"};
        Assert.assertTrue(cartPage.verifyCartItems(expectedItems));

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.enterUserDetails("Usher", "Raymond", "12345");

        OverviewPage overviewPage = new OverviewPage(driver);
        String actualCartItem = overviewPage.getCartItemName();
        Assert.assertEquals(actualCartItem, expectedItems[0]); // Assuming first item is added

        overviewPage.clickFinishButton();

        ConfirmationPage confirmationPage = new ConfirmationPage(driver);
        String confirmationMessage = confirmationPage.getConfirmationMessage();
        Assert.assertEquals(confirmationMessage, "Thank you for your order!");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
