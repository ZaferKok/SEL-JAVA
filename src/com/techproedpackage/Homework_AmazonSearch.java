package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
        // Create a new class : AmazonSearch
public class Homework_AmazonSearch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/CIMBOM/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Go to https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        // Search for “porcelain teapot”
        WebElement serachBox = driver.findElement(By.id("twotabsearchtextbox"));
        serachBox.sendKeys("porcelain teapot");
        serachBox.submit();

        // Then click on "Best Sellers"
        WebElement bestSellers = driver.findElement(By.linkText("Today's Deals"));
        bestSellers.click();

        // Then print how many starts the first product have
        WebElement starCount = driver.findElement(By.linkText("247"));
        String numberOfStars = starCount.getText();
        System.out.println("THE NUMBER OF THE STARS : " + numberOfStars);

        // Then click on first product
        WebElement firstProduct = driver.findElement(By.partialLinkText("Adobe"));
        firstProduct.click();

        // Then print the first product name
        WebElement productName = driver.findElement(By.id("productTitle"));
        String firstItemName = productName.getText();
        System.out.println(firstItemName);

        // Then click on "Add to Card" button
        WebElement addToCart = driver.findElement(By.id("add-to-cart-button"));
        addToCart.click();

        driver.navigate().to("https://www.amazon.com/ap/signin?_encoding=UTF8&openid.assoc_handle=amazon_checkout_us&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fbuy%2Fsignin%2Fhandlers%2Fcontinue.html%3Fie%3DUTF8%26brandId%3D%26cartItemIds%3D%26eGCApp%3D%26hasWorkingJavascript%3D0%26isEGCOrder%3D0%26isFresh%3D0%26oldCustomerId%3D%26oldPurchaseId%3D%26preInitiateCustomerId%3D%26purchaseInProgress%3D%26ref_%3Dcart_signin_submit%26siteDesign%3D&pageId=amazon_checkout_us&showRmrMe=0&siteState=isRegularCheckout.1%7CIMBMsgs.%7CisRedirect.0");

        // Then verify the "Sing-In" text is visible.
        WebElement signIn = driver.findElement(By.className("a-spacing-small"));
        String actualSignIn = signIn.getText();
        String expectedSignIn = "Sing-In";

        // Use if-else statement to veryfy the expexted text
        if (actualSignIn.equals(expectedSignIn)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL SIGN IN : " + actualSignIn);
            System.out.println("EXPECTED SIGN IN : " + expectedSignIn);
        }
    }
}
