package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Day1Homework {
    public static void main(String[] args) {
//        Create a new class : Day1Homework
//        Using ChromeDriver, Go to facebook and verify if page title is “facebook”, If not, print the correct title.
//                Verify if the page URL contains facebook; if not, print the right url.
//                Then Navigate to https://www.walmart.com/
//        Verify if the walmart page title includes “Walmart.com”
//        Navigate back to facebook
//        Refresh the page
//        Maximize the window
//        Close the browser

        System.setProperty("webdriver.chrome.driver","C:/Users/CIMBOM/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        String actualTitle = driver.getTitle();
        if (actualTitle.equals("facebook")){
            System.out.println("PASS");
        }else {
            System.out.println("The actual title is : " + actualTitle);
        }

        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains("facebook")){
            System.out.println("PASS");
        }else{
            System.out.println("The URL does not contain 'facebook'");
        }

        driver.navigate().to("https://www.walmart.com/");
        String actualTitleOfWallmart = driver.getTitle();
        if (actualTitleOfWallmart.contains("Walmart.com")){
            System.out.println("PASS");
        }else {
            System.out.println("The actual web title is : " + actualTitleOfWallmart);
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.quit();
    }
}
