package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public interface VerifyPageURLTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/CIMBOM/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "www.google.com";
        if (actualURL.equals(expectedURL)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("Expected URL : " + expectedURL);
            System.out.println("Actual URL : " + actualURL);
        }
        driver.quit();
    }
}
